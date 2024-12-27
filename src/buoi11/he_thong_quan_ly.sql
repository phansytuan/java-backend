CREATE DATABASE he_thong_quan_ly;
-- Tạo bảng Students
CREATE TABLE IF NOT EXISTS Students (
                                        id INT AUTO_INCREMENT PRIMARY KEY,
                                        first_name VARCHAR(50),
    last_name VARCHAR(50),
    birth_date DATE,
    email VARCHAR(100)
    );

-- Tạo bảng Courses
CREATE TABLE IF NOT EXISTS Courses (
                                       id INT AUTO_INCREMENT PRIMARY KEY,
                                       course_name VARCHAR(100),
    course_description TEXT
    );

-- Tạo bảng Enrollments
CREATE TABLE IF NOT EXISTS Enrollments (
                                           id INT AUTO_INCREMENT PRIMARY KEY,
                                           student_id INT,
                                           course_id INT,
                                           enrollment_date DATE,
                                           CONSTRAINT fk_student
                                           FOREIGN KEY (student_id) REFERENCES Students(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT fk_course
    FOREIGN KEY (course_id) REFERENCES Courses(id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
    );

INSERT INTO Students (first_name, last_name, birth_date, email)
VALUES
    ('Nguyen', 'Van A', '2001-02-10', 'nva@example.com'),
    ('Le', 'Thi B', '1999-10-25', 'ltb@example.com'),
    ('Tran', 'Van C', '2000-03-15', 'tvc@example.com'),
    ('Pham', 'Thi D', '2002-07-01', 'ptd@example.com'),
    ('Ngo', 'Van E', '1998-12-11', 'nve@example.com');

INSERT INTO Courses (course_name, course_description)
VALUES
    ('Lập Trình Cơ Bản', 'Khóa học về lập trình nền tảng, ngôn ngữ C'),
    ('Toán Học', 'Khóa học cơ bản về giải tích và đại số'),
    ('Ngôn Ngữ Anh', 'Khóa học tiếng Anh giao tiếp cơ bản');

INSERT INTO Enrollments (student_id, course_id, enrollment_date)
VALUES
    (1, 1, '2024-01-01'),  -- Sinh viên id=1 đăng ký khóa id=1
    (2, 1, '2024-01-02'),  -- Sinh viên id=2 đăng ký khóa id=1
    (3, 2, '2024-02-10'),  -- Sinh viên id=3 đăng ký khóa id=2
    (1, 2, '2024-03-05'),  -- Sinh viên id=1 đăng ký khóa id=2
    (4, 3, '2024-04-12');  -- Sinh viên id=4 đăng ký khóa id=3

SELECT first_name, last_name, email
FROM Students;

SELECT course_name, course_description
FROM Courses;

SELECT s.first_name, s.last_name, c.course_name
FROM Students s
         JOIN Enrollments e ON s.id = e.student_id
         JOIN Courses c ON e.course_id = c.id;

SELECT s.first_name, s.last_name
FROM Students s
         JOIN Enrollments e ON s.id = e.student_id
         JOIN Courses c ON e.course_id = c.id
WHERE c.course_name = 'Lập Trình Cơ Bản';

SELECT *
FROM Students
WHERE birth_date > '2000-01-01'
  AND email LIKE '%example%';

UPDATE Students
SET email = 'new_email@example.com'
WHERE id = 1;

UPDATE Courses
SET course_description = 'Mô tả mới cho khóa học Lập Trình Cơ Bản'
WHERE course_name = 'Lập Trình Cơ Bản';

DELETE FROM Students
WHERE id = 5
  AND id NOT IN (SELECT student_id FROM Enrollments);

DELETE FROM Courses
WHERE id = 3
  AND id NOT IN (SELECT course_id FROM Enrollments);

SELECT *
FROM Students
WHERE birth_date > '2000-01-01';

SELECT *
FROM Students
WHERE first_name LIKE 'Nguyen%';

SELECT s.*
FROM Students s
         JOIN Enrollments e ON s.id = e.student_id
         JOIN Courses c ON e.course_id = c.id
WHERE s.birth_date > '2000-01-01'
  AND c.course_name = 'Toán Học';

SELECT DISTINCT s.*
FROM Students s
         JOIN Enrollments e ON s.id = e.student_id
WHERE e.course_id IN (1, 2);

SELECT *
FROM Courses
WHERE id BETWEEN 1 AND 3;

