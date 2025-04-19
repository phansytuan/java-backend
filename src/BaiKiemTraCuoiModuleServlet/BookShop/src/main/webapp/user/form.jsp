<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Form User</title>
</head>
<body>
<h2><c:if test="${user != null}">Sửa user</c:if><c:if test="${user == null}">Thêm user</c:if></h2>
<form action="${pageContext.request.contextPath}/user" method="post">
    <c:if test="${user != null}">
        <input type="hidden" name="id" value="${user.id}" />
    </c:if>
    Username: <input type="text" name="username" value="${user.username}" /><br/>
    Password: <input type="text" name="password" value="${user.password}" /><br/>
    Fullname: <input type="text" name="fullname" value="${user.fullname}" /><br/>
    Email: <input type="text" name="email" value="${user.email}" /><br/>
    Phone: <input type="text" name="phone" value="${user.phone}" /><br/>
    Address: <input type="text" name="address" value="${user.address}" /><br/>
    Gender:
    <select name="gender">
        <option value="1" <c:if test="${user != null && user.gender == 1}">selected</c:if>>Nam</option>
        <option value="0" <c:if test="${user != null && user.gender == 0}">selected</c:if>>Nữ</option>
    </select><br/>
    Role:
    <select name="role">
        <option value="CUSTOMER" <c:if test="${user != null && user.role == 'CUSTOMER'}">selected</c:if>>CUSTOMER</option>
        <option value="USER" <c:if test="${user != null && user.role == 'USER'}">selected</c:if>>USER</option>
        <option value="ADMIN" <c:if test="${user != null && user.role == 'ADMIN'}">selected</c:if>>ADMIN</option>
    </select>
    <br/><br/>
    <input type="submit" value="Lưu" />
</form>
</body>
</html>
