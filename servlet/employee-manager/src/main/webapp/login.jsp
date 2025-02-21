<%--
  Created by IntelliJ IDEA.
  User: 7390
  Date: 2/4/2025
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Đăng Nhập</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: url('https://images.pexels.com/photos/2246476/pexels-photo-2246476.jpeg') no-repeat center center fixed;
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: white;
        }

        .login-container {
            background-color: rgba(0, 0, 0, 0.6);
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.5);
            padding: 40px;
            width: 100%;
            max-width: 400px;
        }

        h2 {
            text-align: center;
            font-size: 24px;
            margin-bottom: 20px;
            color: #ffffff;
        }

        .input-group {
            margin-bottom: 15px;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 12px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
            outline: none;
            transition: border-color 0.3s;
        }

        input[type="text"]:focus, input[type="password"]:focus {
            border-color: #ff7e5f;
        }

        .login-btn {
            width: 100%;
            padding: 12px;
            background-color: #ff7e5f;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .login-btn:hover {
            background-color: #feb47b;
        }

        .login-footer {
            text-align: center;
            margin-top: 15px;
        }

        .login-footer a {
            text-decoration: none;
            color: #ff7e5f;
            font-size: 14px;
        }

        .login-footer a:hover {
            text-decoration: underline;
        }

        .remember-me {
            display: flex;
            align-items: center;
        }

        .remember-me input {
            margin-right: 8px;
        }

        /* Thông báo */
        .notification {
            position: fixed;
            top: 20px;
            right: 20px;
            color: white;
            padding: 15px 20px;
            border-radius: 5px;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
            opacity: 0;
            transform: translateX(100%);
            transition: opacity 0.5s, transform 0.5s;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .success {
            background-color: #28a745;
        }

        .error {
            background-color: red;
        }

        .notification.show {
            opacity: 1;
            transform: translateX(0);
        }

        .notification .close-btn {
            font-size: 20px;
            cursor: pointer;
            margin-left: 15px;
        }
    </style>
</head>
<body>

<div class="login-container">
    <h2>Đăng Nhập</h2>
    <form id="loginForm" action="/login" method="post">
        <div class="input-group">
            <input type="text" name="username" placeholder="Nhập tên đăng nhập" required>
        </div>
        <div class="input-group">
            <input type="password" name="password" placeholder="Nhập mật khẩu" required>
        </div>
        <div class="remember-me">
            <input type="checkbox" id="rememberMe">
            <label for="rememberMe">Ghi nhớ đăng nhập</label>
        </div>
        <div class="input-group">
            <button type="submit" class="login-btn">Đăng Nhập</button>
        </div>
    </form>
    <div class="login-footer">
        <a href="#">Quên mật khẩu?</a> | <a href="#">Chưa có tài khoản? Đăng ký ngay</a>
    </div>
</div>

<c:choose>
    <c:when test="${not empty message}">
        <c:choose>
            <c:when test="${message == 'loginSuccess'}">
                <div id="loginSuccess" class="notification success show">
                    <span>Đăng nhập thành công!</span>
                    <span class="close-btn" onclick="closeNotification('loginSuccess')">×</span>
                </div>
            </c:when>
            <c:when test="${message == 'loginError'}">
                <div id="loginError" class="notification error show">
                    <span>Đăng nhập thất bại!</span>
                    <span class="close-btn" onclick="closeNotification('loginError')">×</span>
                </div>
            </c:when>
            <c:when test="${message == 'permissionDenied'}">
                <div id="permissionDenied" class="notification error show">
                    <span>Bạn không có quyền truy cập vào tài nguyên!</span>
                    <span class="close-btn" onclick="closeNotification('permissionDenied')">×</span>
                </div>
            </c:when>
            <c:when test="${message == 'dontLogin'}">
                <div id="dontLogin" class="notification error show">
                    <span>Đăng nhập để truy cập tài nguyên!</span>
                    <span class="close-btn" onclick="closeNotification('dontLogin')">×</span>
                </div>
            </c:when>
        </c:choose>
    </c:when>
</c:choose>


<script>
    function closeNotification(id) {
        var notification = document.getElementById(id);
        notification.classList.remove("show");
    }

    // document.getElementById("loginForm").addEventListener("submit", function(event) {
    //     event.preventDefault();
    //
    //     var notification = document.getElementById("notification");
    //     notification.classList.add("show");
    // });
</script>

</body>
</html>

