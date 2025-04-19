<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="model.CartItem" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Giỏ hàng</title>
</head>
<body>
<h2>Giỏ hàng</h2>
<form action="${pageContext.request.contextPath}/cart" method="post">
    <table border="1" cellpadding="5">
        <tr>
            <th>Sách</th>
            <th>Giá</th>
            <th>Số lượng</th>
            <th>Tổng</th>
            <th>Hành động</th>
        </tr>
        <c:set var="total" value="0" scope="page" />
        <c:forEach var="item" items="${sessionScope.cart}">
            <tr>
                <td>${item.book.title}</td>
                <td>${item.book.price - item.book.discount}</td>
                <td>
                    <input type="hidden" name="bookId" value="${item.book.id}" />
                    <input type="number" name="quantity" value="${item.quantity}" min="1" />
                </td>
                <td>${item.subtotal}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/cart?action=remove&bookId=${item.book.id}">Xóa</a>
                </td>
            </tr>
            <c:set var="total" value="${total + item.subtotal}" scope="page" />
        </c:forEach>
        <tr>
            <td colspan="3">Tổng:</td>
            <td colspan="2">${total}</td>
        </tr>
    </table>
    <br/>
    <input type="submit" value="Cập nhật giỏ hàng" />
</form>
<br/>
<a href="${pageContext.request.contextPath}/order?action=checkout">Thanh toán</a>
</body>
</html>
