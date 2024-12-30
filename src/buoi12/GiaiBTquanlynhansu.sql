--1. GROUP BY: Tính tổng lương của mỗi phòng ban
SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id;

--2. HAVING: Lọc các phòng ban có tổng lương lớn hơn 3000
SELECT department_id, SUM(salary) AS total_salary
FROM employees
GROUP BY department_id
HAVING SUM(salary) > 3000;

--3. DISTINCT: Lấy danh sách vị trí công việc duy nhất
SELECT DISTINCT position
FROM employees;

--4. LIMIT & OFFSET: Lấy 3 nhân viên đầu tiên, bỏ qua 2 nhân viên đầu tiên
SELECT *
FROM employees
         LIMIT 3 OFFSET 2;

--5. LIKE: Tìm nhân viên có tên chứa “Nguyễn”
SELECT *
FROM employees
WHERE name LIKE '%Nguyễn%';

--6. SUM và AVG: Tính tổng và trung bình lương của toàn bộ nhân viên
SELECT SUM(salary) AS total_salary, AVG(salary) AS avg_salary
FROM employees;

--7. INNER JOIN: Lấy danh sách nhân viên và tên phòng ban của họ
SELECT e.name AS employee_name, d.department_name
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id;

--8. LEFT JOIN: Lấy danh sách tất cả phòng ban và nhân viên của phòng ban đó (nếu có)
SELECT d.department_name, e.name AS employee_name
FROM departments d
         LEFT JOIN employees e ON d.department_id = e.department_id;

--9. RIGHT JOIN: Lấy danh sách tất cả nhân viên và thông tin phòng ban của họ (nếu có)
SELECT e.name AS employee_name, d.department_name
FROM employees e
         RIGHT JOIN departments d ON e.department_id = d.department_id;

--10. SELF JOIN: Tìm các nhân viên có cùng mức lương
SELECT e1.name AS employee_1, e2.name AS employee_2, e1.salary
FROM employees e1
         INNER JOIN employees e2 ON e1.salary = e2.salary AND e1.employee_id <> e2.employee_id;

--11. Tìm phòng ban có nhiều nhân viên nhất và tổng lương của phòng ban đó
SELECT d.department_name, COUNT(e.employee_id) AS num_employees, SUM(e.salary) AS total_salary
FROM departments d
         INNER JOIN employees e ON d.department_id = e.department_id
GROUP BY d.department_id
ORDER BY num_employees DESC
    LIMIT 1;

--12. Tìm nhân viên có mức lương cao nhất trong mỗi phòng ban
SELECT e.name, e.salary, d.department_name
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id
WHERE e.salary = (
    SELECT MAX(salary)
    FROM employees
    WHERE department_id = e.department_id
);

--13. Tính mức lương trung bình của từng vị trí công việc, chỉ hiển thị các vị trí có lương trung bình lớn hơn 1500
SELECT position, AVG(salary) AS avg_salary
FROM employees
GROUP BY position
HAVING AVG(salary) > 1500;

--14. Lấy danh sách nhân viên và đồng nghiệp cùng phòng ban (không bao gồm chính họ)
SELECT e1.name AS employee, e2.name AS colleague
FROM employees e1
         INNER JOIN employees e2 ON e1.department_id = e2.department_id AND e1.employee_id <> e2.employee_id;

--15. Tính tổng số năm kinh nghiệm của mỗi phòng ban
SELECT d.department_name, SUM(YEAR(CURDATE()) - YEAR(e.hire_date)) AS total_experience
FROM departments d
         INNER JOIN employees e ON d.department_id = e.department_id
GROUP BY d.department_id;

--16. Tìm nhân viên được tuyển dụng sớm nhất trong mỗi phòng ban, bao gồm cả tên và ngày tuyển dụng
SELECT e.name, e.hire_date, d.department_name
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id
WHERE e.hire_date = (
    SELECT MIN(hire_date)
    FROM employees
    WHERE department_id = e.department_id
);

--17. Tìm phòng ban có tổng lương lớn nhất và hiển thị tên nhân viên, lương và phòng ban đó
SELECT e.name, e.salary, d.department_name
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id
WHERE e.department_id = (
    SELECT department_id
    FROM employees
    GROUP BY department_id
    ORDER BY SUM(salary) DESC
    LIMIT 1
    );

--18. Phân nhóm nhân viên theo bậc lương và tính tổng số nhân viên trong từng nhóm
SELECT
    CASE
        WHEN salary < 1500 THEN '< 1500'
        WHEN salary BETWEEN 1500 AND 2000 THEN '1500-2000'
        ELSE '> 2000'
        END AS salary_range,
    COUNT(*) AS num_employees
FROM employees
GROUP BY salary_range;

--19. Tìm nhân viên có tổng số lương cao nhất trong tất cả các phòng ban (bao gồm cả tên phòng ban)
SELECT e.name, SUM(e.salary) AS total_salary, d.department_name
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id
GROUP BY e.name, d.department_name
ORDER BY total_salary DESC
    LIMIT 1;

--20. Tìm tên nhân viên có lương cao hơn mức lương trung bình của phòng ban mà họ làm việc
SELECT e.name, e.salary, d.department_name
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id
WHERE e.salary > (
    SELECT AVG(salary)
    FROM employees
    WHERE department_id = e.department_id
);