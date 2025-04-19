<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Thanh toán</title>
</head>
<body>
<h2>Thanh toán</h2>
<form action="${pageContext.request.contextPath}/order" method="post">
    <input type="hidden" name="action" value="checkout" />
    Địa chỉ giao hàng: <input type="text" name="address" /><br/>
    Phương thức thanh toán:
    <select name="paymentMethod">
        <option value="COD">Thanh toán khi nhận hàng (COD)</option>
        <option value="BANK">Chuyển khoản</option>
    </select>
    <br/><br/>
    <input type="submit" value="Đặt hàng" />
</form>
</body>
</html>
