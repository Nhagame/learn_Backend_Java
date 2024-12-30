DROP DATABASE if exists quanlyhocsinh;

CREATE DATABASE quanlyhocsinh;
USE quanlyhocsinh;

CREATE TABLE Students(
	id INTEGER auto_increment PRIMARY KEY,
	first_name NVARCHAR(50),
	last_name NVARCHAR(50),
	birth_date DATE,
	email VARCHAR(100)
);

CREATE TABLE Courses(
	id INTEGER auto_increment PRIMARY KEY,
	course_name NVARCHAR(100),
	course_description LONGTEXT
);

CREATE TABLE Enrollments(
	id INTEGER auto_increment PRIMARY KEY,
	student_id INT NOT NULL,
	course_id INT NOT NULL, 
	enrollment_date DATE
);

-- Chèn dữ liệu mẫu vào bảng Students
INSERT INTO Students (first_name, last_name, birth_date, email)
VALUES
('Nguyễn', 'Văn A', '2001-05-15', 'nguyenvana@example.com'),
('Trần', 'Thị B', '2002-08-20', 'tranthib@example.com'),
('Lê', 'Hoàng C', '2000-11-10', 'lehoangc@example.com'),
('Phạm', 'Hồng D', '2003-03-05', 'phamhongd@example.com'),
('Võ', 'Quang E', '2001-07-25', 'voquange@example.com'),
('Hoàng', 'Trấn G', '2002-08-23', 'hoangtrang@example.com');

-- Chèn dữ liệu mẫu vào bảng Courses
INSERT INTO Courses (course_name, course_description)
VALUES
('Lập trình cơ bản', 'Học cách lập trình cơ bản bằng ngôn ngữ Python.'),
('Phát triển Web', 'Xây dựng ứng dụng web hiện đại với HTML, CSS, và JavaScript.'),
('Khoa học dữ liệu', 'Phân tích dữ liệu và xây dựng mô hình dự đoán bằng Python.'),
('Toán học', 'Môn toán học dành cho những người không sợ stress');

-- Chèn dữ liệu mẫu vào bảng Enrollments
INSERT INTO Enrollments (student_id, course_id, enrollment_date)
VALUES
(1, 1, '2024-01-01'), -- Nguyễn Văn A đăng ký Lập trình cơ bản
(2, 1, '2024-01-02'), -- Trần Thị B đăng ký Lập trình cơ bản
(3, 2, '2024-01-03'), -- Lê Hoàng C đăng ký Phát triển Web
(4, 3, '2024-01-04'), -- Phạm Hồng D đăng ký Khoa học dữ liệu
(5, 2, '2024-01-05'), -- Võ Quang E đăng ký Phát triển Web
(6, 4, '2024-01-05'); -- Hoàng Trấn G đăng ký Toán học


-- Truy vấn dữ liệu tất cả thông tin sinh viên
SELECT first_name, last_name, email 
FROM Students;

-- truy vấn dữ liệu tất cả khóa học
SELECT course_name, course_description 
FROM Courses;

-- truy vấn danh sách sinh viên kèm khóa học
SELECT 
	Students.first_name,
    Students.last_name,
    Courses.course_name
FROM Enrollments
JOIN Students ON Enrollments.student_id = Students.id
JOIN Courses ON Enrollments.course_id = Courses.id;

-- Truy vấn danh sách sinh viên đã đăng ký khóa học lập trình cơ bản 
SELECT 
	Students.first_name,
    Students.last_name,
    Courses.course_name
FROM Enrollments
JOIN Students ON Enrollments.student_id = Students.id
JOIN Courses ON Enrollments.course_id = Courses.id
WHERE Courses.course_name = 'Lập trình cơ bản';

-- Truy vấn sinh viên có ngày sinh sau 2000-01-01 cà có email chứa từ "example" 
SELECT first_name, last_name, birth_date, email
FROM Students
WHERE birth_date > '2000-01-01' AND email LIKE '%example%';

-- Cập nhật email của sinh viên có student_id = 1 thành một địa chỉ email mới.
UPDATE Students
SET email = 'new_email@example.com'
WHERE id = 1;

-- Cập nhật mô tả khóa học lập trình cơ bản mới
SET SQL_SAFE_UPDATES = 0;

UPDATE Courses
SET course_description = 'Mô tả của môn học lập trình cơ bản đã được thay đổi'
WHERE course_name = 'Lập trình cơ bản';

SELECT course_name, course_description
FROM Courses
WHERE course_name = 'Lập trình cơ bản';

-- xóa dữ liệu
--  toán tử
-- có ngày sinh lớn hơn 2000-01-01
SELECT * FROM Students WHERE birth_date > '2000-01-01';

-- truy vấn sinh viên có bắt đầu tên bằng "Nguyen"
SELECT * FROM Students WHERE first_name LIKE "%Nguyen%";

-- Truy vấn sinh viên có ngày sinh sau 2000-01-01 và đã đăng ký khóa học toán học
SELECT 
    Students.first_name,
    Students.last_name,
    Students.birth_date,
    Courses.course_name
FROM 
	Students
JOIN
	Enrollments ON Students.id = Enrollments.student_id
JOIN 
	Courses ON Enrollments.course_id = Courses.id
WHERE
	birth_date > '2000-01-01'
    AND
    Courses.course_name = "Toán học";
-- 
SELECT 
    s.first_name, s.last_name
FROM 
    Enrollments e
JOIN 
    Students s ON e.student_id = s.id
WHERE 
    e.course_id IN (101, 102);

--
SELECT * FROM Courses WHERE id BETWEEN 101 AND 103;
 