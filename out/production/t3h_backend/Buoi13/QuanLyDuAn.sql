CREATE DATABASE QuanLyDuAn;
USE QuanLyDuAn;

-- Tạo bảng NHAN_VIEN
CREATE TABLE NHAN_VIEN (
                           id integer auto_increment primary key, -- ID nhân viên (Khóa chính)
                           MA_NHAN_VIEN varchar(30),
                           HO_TEN NVARCHAR(100),          -- Họ tên
                           NGAY_SINH DATE,               -- Ngày sinh
                           DIA_CHI NVARCHAR(200),        -- Địa chỉ
                           CHUC_VU NVARCHAR(50)          -- Chức vụ
);
-- Tạo bảng PHONG_BAN
CREATE TABLE PHONG_BAN (
                           id integer auto_increment primary key, -- ID phòng ban (Khóa chính)
                           MA_PHONG_BAN varchar(30),
                           TEN_PHONG_BAN NVARCHAR(50)   -- Tên phòng ban
);
-- Tạo bảng DU_AN
CREATE TABLE DU_AN (
                       id integer auto_increment primary key,  -- ID dự án (Khóa chính)
                       MA_DU_AN nvarchar(30),
                       TEN_DU_AN NVARCHAR(100)       -- Tên dự án
);


/*
Tạo (bảng) Quan hệ giữa
NHÂN VIÊN - PHÒNG BAN (nhiều - 1)
    -> trong bảng nhân viên thêm column department_id
       đóng vai trò là khoá ngoại
       tham chiếu từ bảng nhân viên -> bảng phòng ban
*/
-- tạo thêm column department_id
alter table NHAN_VIEN add column department_id integer;
-- config khoá ngoại cho department_id
alter table NHAN_VIEN add foreign key (department_id) references PHONG_BAN(id);


/*
PHÒNG BAN - DỰ ÁN (nhiều - 1)
tương tự như NHAN_VIEN - PHONG_BAN
*/
-- tạo thêm column department_id
alter table DU_AN add column department_id integer;
-- config khoá ngoại cho department_id
alter table DU_AN add foreign key (department_id) references PHONG_BAN(id);


/*
NHÂN VIÊN - DỰ ÁN (nhiều - nhiều)
- 1 nhân viên làm nhiều dự án
- 1 dự án sẽ có nhiều nhân viên cùng làm


để thể hiện được mqh nhiều - nhiều
sẽ tạo thêm bảng phụ tên là NHAN_VIEN_DU_AN

mqh: NHAN_VIEN_DU_AN - NHAN VIEN (1 - nhiều)
       NHAN_VIEN_DU_AN - DU AN (nhiều - 1)

bảng NHAN_VIEN_DU_AN có 2 cột:
    NHAN_VIEN_ID: khoá ngoại tham chiếu tới bảng NHAN VIEN
    DU_AN_ID: khoá ngoại tham chiếu tới bảng DU AN
*/
create table NHAN_VIEN_DU_AN(
    NHAN_VIEN_ID integer,
    DU_AN_ID integer
);
alter table NHAN_VIEN_DU_AN add foreign key (NHAN_VIEN_ID) references NHAN_VIEN(id);
alter table NHAN_VIEN_DU_AN add foreign key (DU_AN_ID) references DU_AN(id);

