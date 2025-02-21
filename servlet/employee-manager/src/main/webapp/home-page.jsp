<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang Chủ - Atino</title>

    <!-- Nhúng Google Font 'Quicksand' -->
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">

    <style>
        /* Đặt font chung cho toàn bộ trang */
        * {
            font-family: 'Quicksand', sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            background-color: #f8f8f8;
        }

        /* Thanh điều hướng */
        .navbar {
            background: linear-gradient(45deg, #ff6f61, #ff914d);
            padding: 15px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            position: sticky;
            top: 0;
            z-index: 100;
            color: white;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            font-size: 16px;
            margin: 0 15px;
            font-weight: 600;
            transition: 0.3s;
        }

        .navbar a:hover {
            text-decoration: underline;
            color: #ffe600;
        }

        .navbar .logo {
            font-size: 24px;
            font-weight: bold;
        }

        /* Hiển thị user */
        .user-info {
            font-size: 18px;
            font-weight: 600;
        }

        .user-info span {
            background-color: white;
            color: #ff6f61;
            padding: 5px 10px;
            border-radius: 5px;
            cursor: pointer;
            margin-left: 10px;
            transition: 0.3s;
        }

        .user-info span:hover {
            background-color: #ff3b2f;
            color: white;
        }

        /* Hero Section */
        .hero-section {
            background-image: url('https://images.pexels.com/photos/1236700/pexels-photo-1236700.jpeg');
            background-size: cover;
            background-position: center;
            color: white;
            text-align: center;
            padding: 120px 20px;
        }

        .hero-section h1 {
            font-size: 50px;
            font-weight: 700;
            margin-bottom: 15px;
        }

        .hero-section p {
            font-size: 18px;
            font-weight: 500;
            margin-bottom: 20px;
        }

        /* Danh sách sản phẩm */
        .products-section {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 20px;
            padding: 40px 20px;
            background-color: white;
        }

        .product-card {
            background: #ffffff;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);
            text-align: center;
            padding: 20px;
            transition: transform 0.3s ease;
        }

        .product-card:hover {
            transform: scale(1.05);
        }

        .product-card img {
            width: 100%;
            height: 200px;
            object-fit: cover;
            border-radius: 8px;
        }

        .product-card h3 {
            margin: 15px 0;
            font-size: 20px;
            font-weight: 600;
            color: #333;
        }

        .product-card p {
            color: #777;
            font-size: 14px;
            font-weight: 500;
        }

        /* Footer */
        .footer {
            background-color: #3b3b3b;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .footer a {
            color: #ff6f61;
            text-decoration: none;
            font-weight: 600;
        }

        .footer a:hover {
            text-decoration: underline;
        }

        /* Responsive */
        @media (max-width: 768px) {
            .products-section {
                grid-template-columns: 1fr 1fr;
            }
        }

        @media (max-width: 480px) {
            .products-section {
                grid-template-columns: 1fr;
            }

            .hero-section h1 {
                font-size: 36px;
            }

            .hero-section p {
                font-size: 16px;
            }
        }
    </style>
</head>
<body>

<!-- Thanh điều hướng -->
<div class="navbar">
    <div class="logo">Atino</div>
    <div>
        <a href="#">Trang Chủ</a>
        <a href="#">Dịch Vụ</a>
        <a href="#">Liên Hệ</a>
    </div>

    <div id="userInfo" class="user-info">
        <c:if test="${not empty username}">
            <span>Xin chào ${username}</span>
            <a href="/logout">Đăng xuất</a>
        </c:if>

        <c:if test="${empty username}">
            <a href="/login">Đăng nhập</a>
        </c:if>
    </div>
</div>

<!-- Phần hero -->
<div class="hero-section">
    <h1>Chào mừng đến với Atino</h1>
    <p>Khám phá các giải pháp công nghệ giúp tối ưu hóa công việc của bạn!</p>
</div>

<!-- Danh sách sản phẩm -->
<div class="products-section">
    <div class="product-card">
        <img src="https://source.unsplash.com/300x200/?laptop,technology" alt="Sản phẩm 1">
        <h3>Sản phẩm 1</h3>
        <p>Thiết bị công nghệ mới nhất.</p>
    </div>
    <div class="product-card">
        <img src="https://source.unsplash.com/300x200/?smartphone,gadget" alt="Sản phẩm 2">
        <h3>Sản phẩm 2</h3>
        <p>Điện thoại thông minh cao cấp.</p>
    </div>
    <div class="product-card">
        <img src="https://source.unsplash.com/300x200/?headphone,tech" alt="Sản phẩm 3">
        <h3>Sản phẩm 3</h3>
        <p>Tai nghe chống ồn siêu cấp.</p>
    </div>
    <div class="product-card">
        <img src="https://source.unsplash.com/300x200/?watch,smartwatch" alt="Sản phẩm 4">
        <h3>Sản phẩm 4</h3>
        <p>Đồng hồ thông minh.</p>
    </div>
    <div class="product-card">
        <img src="https://source.unsplash.com/300x200/?camera,tech" alt="Sản phẩm 5">
        <h3>Sản phẩm 5</h3>
        <p>Máy ảnh chuyên nghiệp.</p>
    </div>
    <div class="product-card">
        <img src="https://source.unsplash.com/300x200/?tablet,technology" alt="Sản phẩm 6">
        <h3>Sản phẩm 6</h3>
        <p>Máy tính bảng cao cấp.</p>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    <p>&copy; 2025 Atino.vn | <a href="#">Điều Khoản</a> | <a href="#">Chính Sách</a></p>
</div>
</body>
</html>
