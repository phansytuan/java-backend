-- Tạo cơ sở dữ liệu mới
CREATE DATABASE atino_shop;
USE atino_shop;

-- Tạo bảng categories để lưu trữ thông tin danh mục sản phẩm
CREATE TABLE categories (
                            category_id INT AUTO_INCREMENT PRIMARY KEY, -- ID tự tăng cho danh mục
                            name VARCHAR(255) NOT NULL                  -- Tên danh mục
);

-- Tạo bảng products để lưu trữ thông tin sản phẩm
CREATE TABLE products (
                          product_id INT AUTO_INCREMENT PRIMARY KEY, -- ID tự tăng cho sản phẩm
                          name VARCHAR(255) NOT NULL,                -- Tên sản phẩm
                          description TEXT,                          -- Mô tả sản phẩm
                          price DECIMAL(10, 2) NOT NULL,             -- Giá sản phẩm
                          image_url VARCHAR(255),                    -- Đường dẫn đến hình ảnh sản phẩm
                          category_id INT,                           -- ID danh mục của sản phẩm
                          FOREIGN KEY (category_id) REFERENCES categories(category_id) -- Ràng buộc khóa ngoại
);

-- Tạo bảng product_details để lưu trữ thông tin chi tiết của sản phẩm
CREATE TABLE product_details (
                                 product_detail_id INT AUTO_INCREMENT PRIMARY KEY, -- ID tự tăng cho chi tiết sản phẩm
                                 product_id INT,                                   -- ID sản phẩm liên kết
                                 color VARCHAR(50),                                -- Màu sắc của sản phẩm
                                 size VARCHAR(50),                                 -- Kích thước sản phẩm (nếu có)
                                 weight DECIMAL(10, 2),                            -- Khối lượng sản phẩm (nếu có)
                                 material VARCHAR(255),                            -- Chất liệu sản phẩm (nếu có)
                                 FOREIGN KEY (product_id) REFERENCES products(product_id) -- Ràng buộc khóa ngoại
);

-- Thêm một số danh mục mẫu
INSERT INTO categories (name) VALUES
                                  ('Electronics'),
                                  ('Clothing'),
                                  ('Books'),
                                  ('Home Appliances');

-- Thêm một số sản phẩm mẫu
INSERT INTO products (name, description, price, image_url, category_id) VALUES
                                                                            ('Smartphone', 'A high-quality smartphone with amazing features.', 699.99, 'images/smartphone.jpg', 1),
                                                                            ('Laptop', 'A powerful laptop for all your computing needs.', 999.99, 'images/laptop.jpg', 1),
                                                                            ('T-Shirt', 'A comfortable cotton T-shirt.', 19.99, 'images/tshirt.jpg', 2),
                                                                            ('Novel', 'A gripping novel that you cannot put down.', 12.99, 'images/novel.jpg', 3);

-- Thêm một số chi tiết sản phẩm mẫu
INSERT INTO product_details (product_id, color, size, weight, material) VALUES
                                                                            (1, 'Black', '6.5-inch', 0.174, 'Plastic and Glass'),
                                                                            (2, 'Silver', '15-inch', 1.5, 'Aluminum'),
                                                                            (3, 'Blue', 'L', NULL, 'Cotton'),
                                                                            (4, NULL, NULL, 0.5, 'Paper');

