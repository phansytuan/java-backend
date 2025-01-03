-- Tạo cơ sở dữ liệu mới
CREATE DATABASE atino_store;
USE atino_store;

-- Tạo bảng categories
CREATE TABLE categories (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            description TEXT
);

-- Tạo bảng products
CREATE TABLE products (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          price DECIMAL(10, 2) NOT NULL,
                          image_url VARCHAR(500),
                          description TEXT,
                          category_id INT,
                          FOREIGN KEY (category_id) REFERENCES categories(id)
);

-- Tạo bảng product_images (nếu cần quản lý nhiều hình ảnh cho sản phẩm)
CREATE TABLE product_images (
                                id INT AUTO_INCREMENT PRIMARY KEY,
                                product_id INT,
                                image_url VARCHAR(500),
                                FOREIGN KEY (product_id) REFERENCES products(id)
);

-- Thêm dữ liệu mẫu cho categories
INSERT INTO categories (name, description) VALUES
                                               ('Áo Polo', 'Các sản phẩm áo polo nam thời trang'),
                                               ('Áo Sơ Mi', 'Các sản phẩm áo sơ mi nam thanh lịch'),
                                               ('Quần Jeans', 'Các sản phẩm quần jeans trẻ trung'),
                                               ('Phụ Kiện', 'Các phụ kiện thời trang nam');

-- Thêm dữ liệu mẫu cho products
INSERT INTO products (name, price, image_url, description, category_id) VALUES
                                                                            ('Áo Polo Basic', 250000, 'https://atino.vn/images/ao-polo-basic.jpg', 'Áo polo basic thiết kế đơn giản, chất liệu cotton', 1),
                                                                            ('Áo Sơ Mi Trắng', 300000, 'https://atino.vn/images/ao-so-mi-trang.jpg', 'Áo sơ mi trắng thanh lịch, phù hợp mọi dịp', 2),
                                                                            ('Quần Jeans Slim Fit', 400000, 'https://atino.vn/images/quan-jeans-slim-fit.jpg', 'Quần jeans slim fit năng động, trẻ trung', 3),
                                                                            ('Thắt Lưng Da Nam', 150000, 'https://atino.vn/images/that-lung-da.jpg', 'Thắt lưng da thật cho nam giới', 4);

-- Thêm dữ liệu mẫu cho product_images
INSERT INTO product_images (product_id, image_url) VALUES
                                                       (1, 'https://atino.vn/images/ao-polo-basic-1.jpg'),
                                                       (1, 'https://atino.vn/images/ao-polo-basic-2.jpg'),
                                                       (2, 'https://atino.vn/images/ao-so-mi-trang-1.jpg');

-- Truy vấn danh sách sản phẩm và category
SELECT p.id, p.name AS product_name, p.price, p.image_url, c.name AS category_name
FROM products p
         JOIN categories c ON p.category_id = c.id;

-- Truy vấn danh sách category
SELECT id, name FROM categories;

-- Truy vấn thông tin chi tiết sản phẩm
SELECT p.id, p.name, p.price, p.description, p.image_url, c.name AS category_name
FROM products p
         JOIN categories c ON p.category_id = c.id
WHERE p.id = 1; -- Thay 1 bằng ID của sản phẩm cần xem


/*
Thực thể và mối quan hệ

    Categories (Danh mục sản phẩm):
Mô tả loại sản phẩm như "Áo Polo", "Áo Sơ Mi", "Quần Jeans",...
Một danh mục có thể chứa nhiều sản phẩm.
Mối quan hệ: 1:N (Một category có nhiều sản phẩm).

    Products (Sản phẩm):
Mô tả từng sản phẩm cụ thể, thuộc một danh mục.
Một sản phẩm có thể có nhiều hình ảnh mô tả.


Mối quan hệ:
Với Categories: N:1 (Một sản phẩm thuộc về một danh mục).
Với Product Images: 1:N (Một sản phẩm có nhiều hình ảnh).

    Product Images (Hình ảnh sản phẩm):
Lưu trữ nhiều hình ảnh của một sản phẩm cụ thể.
Mối quan hệ: N:1 (Một hình ảnh thuộc về một sản phẩm).


Thực thể và thuộc tính:
    Categories:
id (Primary Key): ID của danh mục.
name: Tên danh mục.
description: Mô tả danh mục.

    Products:
id (Primary Key): ID của sản phẩm.
name: Tên sản phẩm.
price: Giá sản phẩm.
image_url: URL hình ảnh chính.
description: Mô tả sản phẩm.
category_id (Foreign Key): Liên kết tới ID danh mục.

    Product Images:
id (Primary Key): ID hình ảnh.
product_id (Foreign Key): Liên kết tới ID sản phẩm.
image_url: URL hình ảnh phụ.

Các mối quan hệ cụ thể
        Categories ↔ Products:
Mỗi Category có thể chứa nhiều Product (1:N).
Mỗi Product chỉ thuộc về một Category (N:1).

        Products ↔ Product Images:
Mỗi Product có thể có nhiều Product Images (1:N).
Mỗi Product Image chỉ liên quan đến một Product (N:1).


Mô hình ERD minh họa: (Entity-Relationship Diagram)

        [Categories]
          - id (PK)
          - name
          - description
               |
               |  1:N
               |
        [Products]
          - id (PK)
          - name
          - price
          - image_url
          - description
          - category_id (FK)
               |
               |  1:N
               |
        [Product Images]
          - id (PK)
          - product_id (FK)
          - image_url
*/

