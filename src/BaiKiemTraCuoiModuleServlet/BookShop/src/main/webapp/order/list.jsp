<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="vn.t3h.btvn.bookshop.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Danh sách đơn hàng</title>
</head>
<body>
<h2>Danh sách đơn hàng</h2>
<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>User ID</th>
        <th>Tổng tiền</th>
        <th>Trạng thái</th>
        <th>Thanh toán</th>
        <th>Ngày đặt</th>
        <th>Hành động</th>
    </tr>
    <c:forEach var="o" items="${orders}">
        <tr>
            <td>${o.id}</td>
            <td>${o.userId}</td>
            <td>${o.totalAmount}</td>
            <td>${o.status}</td>
            <td>${o.paymentMethod}</td>
            <td>${o.createdDate}</td>
            <td>
                <c:if test="${sessionScope.loggedUser.role == 'ADMIN' || sessionScope.loggedUser.role == 'USER'}">
                    <a href="${pageContext.request.contextPath}/order?action=updateStatus&orderId=${o.id}&status=CONFIRMED">Xác nhận</a> |
                    <a href="${pageContext.request.contextPath}/order?action=updateStatus&orderId=${o.id}&status=SHIPPING">Giao hàng</a> |
                    <a href="${pageContext.request.contextPath}/order?action=updateStatus&orderId=${o.id}&status=DONE">Hoàn thành</a> |
                    <a href="${pageContext.request.contextPath}/order?action=updateStatus&orderId=${o.id}&status=CANCELLED">Hủy</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
