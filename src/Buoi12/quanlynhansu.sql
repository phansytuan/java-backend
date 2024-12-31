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

#     offset: bắt đầu từ index nào
#     limit: giới hạn bao nhiêu bản ghi

