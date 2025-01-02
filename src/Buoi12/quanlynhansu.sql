create DATABASE quanlynhansu;
use quanlynhansu;
CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL
);
INSERT INTO departments (department_id, department_name, location)
VALUES
    (1, 'IT', 'Hà Nội'),
    (2, 'HR', 'TP. Hồ Chí Minh'),
    (3, 'Finance', 'Đà Nẵng');
	CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    position VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    department_id INT,
    hire_date DATE NOT NULL,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);
INSERT INTO employees (employee_id, name, position, salary, department_id, hire_date)
VALUES
    (1, 'Nguyễn Văn A', 'Developer', 1500, 1, '2020-05-01'),
    (2, 'Trần Thị B', 'Tester', 1200, 1, '2021-03-15'),
    (3, 'Lê Văn C', 'Developer', 1500, 2, '2019-08-10'),
    (4, 'Nguyễn Thị D', 'Project Manager', 2500, 2, '2020-01-20'),
    (5, 'Phạm Văn E', 'Tester', 1300, 3, '2021-07-12'),
    (6, 'Hoàng Thị F', 'Developer', 1400, 3, '2022-09-01'),
    (7, 'Đặng Văn G', 'Developer', 1500, 1, '2022-05-20'),
    (8, 'Nguyễn Văn H', 'Developer', 2000, 2, '2018-12-15');
select * from employees;
select * from departments;



# 1. GROUP BY: Tính tổng lương của mỗi phòng ban:
-- Lấy ID của phòng ban và tính tổng lương của tất cả nhân viên trong mỗi phòng ban đó
select
    department_id,           -- Chọn ID của phòng ban
    SUM(salary) AS total_salary  -- Tính tổng lương (salary) và đặt tên cột là total_salary
from employees                -- Bảng chứa thông tin liên quan đến nhân viên
GROUP BY department_id;           -- Nhóm dữ liệu theo phòng ban (department_id)

    # nếu muốn có thêm tên department
    select dept.department_name, sum(emp.salary)
    from employees emp
        inner join departments dept
            on emp.department_id = dept.department_id
    GROUP BY emp.department_id;


# 2. HAVING: Lọc các phòng ban có tổng lương lớn hơn 3000:
select department_id, SUM(salary) AS total_salary
from employees
group by department_id
HAVING sum(salary)>3000;

    # nếu muốn có thêm tên department
    select dept.department_name, sum(emp.salary)
    from employees emp
         inner join departments dept
                    on emp.department_id = dept.department_id
    group by emp.department_id
    HAVING sum(salary)>3000;


# 3. DISTINCT: Lấy danh sách vị trí công việc duy nhất:
select DISTINCT position
from employees;


# 4. LIMIT & OFFSET: Lấy 3 nhân viên đầu tiên, bỏ qua 2 nhân viên đầu tiên:
-- Lấy danh sách 3 nhân viên tiếp theo sau khi bỏ qua 2 nhân viên đầu tiên
select *               -- Chọn tất cả các cột từ bảng employees
from employees          -- Từ bảng chứa thông tin nhân viên
LIMIT 3                 -- Giới hạn kết quả trả về chỉ lấy 3 dòng
    OFFSET 2;               -- Bỏ qua 2 dòng đầu tiên trong kết quả

--     offset: bắt đầu từ index nào
--     limit: giới hạn bao nhiêu bản ghi


# 5. LIKE: Tìm nhân viên có tên chứa “Nguyễn”:
select *
from employees
where name LIKE '%Nguyễn%';


# 6. SUM và AVG: Tính tổng và trung bình lương của toàn bộ nhân viên:
SELECT SUM(salary) AS total_salary, AVG(salary) AS average_salary
FROM employees;


# 7. INNER JOIN: Lấy danh sách nhân viên và tên phòng ban của họ:
select
    emp.name,              -- Lấy tên nhân viên từ bảng employees
    dept.department_name   -- Lấy tên phòng ban từ bảng departments
from employees emp          -- Bảng chứa thông tin nhân viên, đặt alias là emp
INNER JOIN
    departments dept       -- Bảng chứa thông tin phòng ban, đặt alias là dept
    ON emp.department_id = dept.department_id;
     -- Kết nối hai bảng qua khóa ngoại department_id


# 8. LEFT JOIN: Lấy danh sách tất cả phòng ban và nhân viên của phòng ban đó (nếu có):
select
    dept.department_name,   -- Lấy tên phòng ban từ bảng departments
    emp.name               -- Lấy tên nhân viên từ bảng employees, nếu có
from departments dept        -- Bảng chứa thông tin phòng ban, đặt alias là dept
LEFT JOIN
    employees emp           -- Bảng chứa thông tin nhân viên, đặt alias là emp
    ON dept.department_id = emp.department_id; -- Kết nối hai bảng qua khóa department_id


# 9. RIGHT JOIN: Lấy danh sách tất cả nhân viên và thông tin phòng ban của họ (nếu có):
select emp.name,dept.department_name from employees emp
    RIGHT JOIN departments dept
ON emp.department_id = dept.department_id;


# 10. SELF JOIN: Tìm các nhân viên có cùng mức lương
-- Tìm danh sách các nhân viên có cùng mức lương với ít nhất một nhân viên khác
select distinct
    emp.salary,      -- Chọn mức lương
    emp.name         -- Chọn tên của nhân viên
from employees emp          -- tạo bảng chính chứa thông tin nhân viên, đặt alias là emp
    INNER JOIN employees emp_same_salary -- Thực hiện SELF JOIN với bảng employees, đặt alias là emp_same_salary
    ON emp.salary = emp_same_salary.salary   -- Điều kiện: mức lương của hai nhân viên phải bằng nhau
        and emp_same_salary.employee_id != emp.employee_id; -- Điều kiện: loại trừ trường hợp một nhân viên so sánh với chính mình


# 11. Tìm phòng ban có nhiều nhân viên nhất và/rồi tính tổng lương của phòng ban đó
SELECT
    dept.department_name,            -- Lấy tên phòng ban
    COUNT(emp.employee_id) AS employee_count,   -- Đếm số lượng nhân viên trong phòng ban, đặt tên cột là employee_count
    SUM(emp.salary) AS total_salary    -- Tính tổng lương của các nhân viên trong phòng ban, đặt tên cột là total_salary
from departments dept                   -- Bảng chứa thông tin phòng ban, đặt alias là dept
INNER JOIN employees emp                     -- Bảng chứa thông tin nhân viên, đặt alias là emp
    ON dept.department_id = emp.department_id -- Điều kiện nối: kết nối phòng ban với nhân viên qua department_id

GROUP BY dept.department_name             -- Nhóm kết quả theo tên phòng ban
ORDER BY COUNT(emp.employee_id) DESC       -- Sắp xếp theo số lượng nhân viên giảm dần
limit 1;                       -- Chỉ lấy 1 phòng ban có số lượng nhân viên nhiều nhất


# 12. Tìm nhân viên có mức lương cao nhất trong mỗi phòng ban
SELECT
    emp.name,                  -- Lấy tên nhân viên
    emp.salary,                -- Lấy mức lương của nhân viên
    dept.department_name       -- Lấy tên phòng ban của nhân viên
from employees emp                     -- Bảng employees chứa thông tin nhân viên, alias là emp

INNER JOIN departments dept            -- Bảng departments chứa thông tin phòng ban, alias là dept
    ON emp.department_id = dept.department_id        -- Kết nối hai bảng qua khóa department_id
WHERE emp.salary = (SELECT MAX(e.salary)                     -- Tìm mức lương cao nhất
        from employees e               -- Bảng employees (self-subquery), alias là e
        WHERE e.department_id = emp.department_id );         -- Điều kiện: cùng phòng ban


# 13. Tính mức lương trung bình của từng vị trí công việc, chỉ hiển thị các vị trí có lương trung bình lớn hơn 1500
SELECT DISTINCT
    emp.position,                          -- Chọn vị trí công việc
    AVG(emp.salary) AS avg_position_salary -- Tính lương trung bình của vị trí công việc
from employees emp                     -- Bảng employees chứa thông tin nhân viên, alias là emp
GROUP BY emp.position                   -- Nhóm theo từng vị trí công việc để tính trung bình lương
HAVING avg_position_salary > 1500;       -- Lọc các vị trí có lương trung bình lớn hơn 1500


# 14. Lấy danh sách nhân viên và đồng nghiệp cùng phòng ban
select distinct emp.name, dept.department_name from departments dept
    inner join employees emp
    on dept.department_id = emp.department_id
group by emp.name, dept.department_name;


# 15. Tính tổng số năm kinh nghiệm của mỗi phòng ban
select department_id, SUM(YEAR(CURDATE()) - YEAR(hire_date)) as total_experience
from employees
group by department_id;

select
    dept.department_name,
    max(year(curdate()) -year(emp.hire_date)) as total_experience
from employees emp
    inner join departments dept on emp.department_id = dept.department_id
    group by dept.department_name;


# 16. Tìm nhân viên được tuyển dụng sớm nhất trong mỗi phòng ban, bao gồm cả tên và ngày tuyển dụng

-- Bước 1: Tìm ra phòng ban và ngày tuyển dụng sớm nhất của phòng ban đó
SELECT
    dept.department_name,                    -- Tên phòng ban
    MIN(emp.hire_date) AS min_hire_date      -- Ngày tuyển dụng sớm nhất
FROM employees emp                           -- Bảng employees chứa thông tin nhân viên
INNER JOIN departments dept                            -- Bảng departments chứa thông tin phòng ban
    ON emp.department_id = dept.department_id  -- Kết nối bảng nhân viên và phòng ban dựa trên department_id
GROUP BY dept.department_name;                         -- Nhóm theo tên phòng ban để tìm ngày tuyển dụng sớm nhất

-- Code hoàn chỉnh: Tìm ra nhân viên được tuyển dụng sớm nhất của từng phòng ban
SELECT emp.name AS employee_name,              -- Tên nhân viên
       dept.department_name,                   -- Tên phòng ban
       emp.hire_date                           -- Ngày tuyển dụng của nhân viên
FROM employees emp                           -- Bảng employees chứa thông tin nhân viên
INNER JOIN
    departments dept                        -- Bảng departments chứa thông tin phòng ban
    ON emp.department_id = dept.department_id -- Kết nối bảng nhân viên và phòng ban dựa trên department_id

INNER JOIN
    (select dept.department_name,               -- tên phòng ban
            MIN(emp.hire_date) as min_hire_date -- ngày tuyển dụng sớm nhất
    from employees emp inner join departments dept
        on emp.department_id = dept.department_id
    group by dept.department_name)
        dept_min_hire_date   -- bảng con chứa tên phòng ban và ngày tuyển dụng sớm nhất

        ON dept.department_name = dept_min_hire_date.department_name -- Kết nối dựa trên tên phòng ban
        AND emp.hire_date = dept_min_hire_date.min_hire_date;
        -- Lọc nhân viên có ngày tuyển dụng trùng với ngày tuyển dụng sớm nhất
    # Nếu chúng ta có nhiều bảng hơn thì sẽ đỡ phải dùng sub query hơn


# 17. Tìm phòng ban có tổng lương lớn nhất và hiển thị tên nhân viên, lương và phòng ban đó
-- tìm phòng ban có tổng lương lớn nhất
select dept.department_name, MAX(emp.salary) max_salary from employees emp
inner join departments dept on emp.department_id = dept.department_id
group by dept.department_name order by max_salary desc
limit 1;

-- Bước 2: Tìm nhân viên thuộc phòng ban có tổng lương lớn nhất
select emp.name, dept.department_name,emp.salary from employees emp
inner join departments dept on emp.department_id = dept.department_id

inner join (select dept.department_name, MAX(emp.salary) max_salary from employees emp
            inner join departments dept on emp.department_id = dept.department_id
            group by dept.department_name order by max_salary desc limit 1)
            dept_max_salary
on dept.department_name = dept_max_salary.department_name
where emp.salary=dept_max_salary.max_salary;


# 18. Phân nhóm nhân viên theo bậc lương (ví dụ: < 1500, 1500-2000, > 2000) và tính tổng số nhân viên trong từng nhóm
-- Sử dụng CASE và GROUP BY:

-- case condition (giống if else)
#     case
#         when condition1 then a
#         when condition2 then b
#         else c
#     end

SELECT
    CASE
        WHEN emp.salary > 2000 THEN 'level > 2000'                              -- nhóm mức lương lớn hơn 2000
        WHEN emp.salary BETWEEN 1500 AND 2000 THEN 'level 1500 - 2000'          -- nhóm mức lương từ 1500 đến 2000
        ELSE 'level < 1500'                                                     -- nhóm mức lương nhỏ hơn 1500
        END AS level,                                           -- Đặt tên cho từng nhóm lương
    COUNT(*) AS total_emp                                       -- Tính tổng số nhân viên trong từng nhóm
FROM employees emp                                              -- Bảng employees chứa thông tin nhân viên
GROUP BY level;                                                 -- Nhóm kết quả theo từng bậc lương


# 19. Tìm nhân viên có tổng số lương cao nhất trong tất cả các phòng ban (bao gồm cả tên phòng ban)

-- Bước 1: Tìm mức lương cao nhất trong bảng employees
SELECT MAX(salary) AS max_salary FROM employees;

-- Bước 2: Kết hợp thông tin nhân viên và phòng ban có mức lương cao nhất
SELECT    emp.name,               -- Lấy tên nhân viên
          emp.salary,             -- Lấy mức lương của nhân viên
          dept.department_name    -- Lấy tên phòng ban của nhân viên
from employees emp           -- Bảng employees chứa thông tin nhân viên

INNER JOIN departments dept        -- Kết hợp với bảng departments để lấy thông tin phòng ban
    ON emp.department_id = dept.department_id -- Liên kết bằng department_id
WHERE emp.salary =      -- Chỉ lấy nhân viên có mức lương bằng mức lương cao nhất
      (SELECT MAX(salary) AS max_salary FROM employees);      -- Truy vấn phụ tìm mức lương cao nhất


# 20. Tìm tên nhân viên có lương Cao Hơn mức Lương Trung Bình của phòng ban mà họ làm việc
-- Bước 1: Tính mức lương trung bình của từng phòng ban
SELECT dept.department_name,             -- Lấy tên phòng ban
       AVG(emp.salary) AS avg_salary     -- Tính mức lương trung bình của phòng ban
from employees emp                       -- Bảng employees chứa thông tin nhân viên
INNER JOIN departments dept                            -- Kết hợp với bảng departments để lấy tên phòng ban
    ON emp.department_id = dept.department_id  -- Liên kết bằng department_id
GROUP BY dept.department_name;                          -- Nhóm theo tên phòng ban để tính mức lương trung bình cho từng phòng ban

-- Bước 2: Tìm nhân viên có lương cao hơn mức lương trung bình của phòng ban
SELECT
    emp.name,                         -- Lấy tên nhân viên
    dept.department_name,             -- Lấy tên phòng ban
    emp.salary,                       -- Lấy mức lương của nhân viên
    dept_avg_salary.avg_salary        -- Lấy mức lương trung bình của phòng ban
FROM employees emp                     -- Bảng employees chứa thông tin nhân viên

INNER JOIN departments dept                             -- Kết hợp với bảng departments để lấy thông tin phòng ban
    ON emp.department_id = dept.department_id  -- Liên kết bằng department_id
INNER JOIN
    (select dept.department_name,           -- Lấy tên phòng ban
            AVG(emp.salary) as avg_salary   -- Tính mức lương trung bình của phòng ban
     from employees emp inner join departments dept on emp.department_id = dept.department_id
     group by dept.department_name)         -- Subquery để tính lương trung bình
     dept_avg_salary

ON dept.department_name = dept_avg_salary.department_name -- Liên kết phòng ban với lương trung bình
WHERE emp.salary > dept_avg_salary.avg_salary;
-- Lọc ra nhân viên có lương cao hơn mức lương trung bình của phòng ban

