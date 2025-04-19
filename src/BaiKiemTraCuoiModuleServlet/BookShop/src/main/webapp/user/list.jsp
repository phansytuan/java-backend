<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Quản lý User</title>
</head>
<body>
<h2>Danh sách User</h2>
<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Fullname</th>
        <th>Email</th>
        <th>Role</th>
        <th>Hành động</th>
    </tr>
    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.fullname}</td>
            <td>${u.email}</td>
            <td>${u.role}</td>
            <td>
                <a href="${pageContext.request.contextPath}/user?action=edit&id=${u.id}">Sửa</a> |
                <a href="${pageContext.request.contextPath}/user?action=delete&id=${u.id}"
                   onclick="return confirm('Xóa user này?');">Xóa</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="${pageContext.request.contextPath}/user?action=add">Thêm user</a>
</body>
</html>
