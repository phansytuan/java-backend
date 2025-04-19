<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Danh sách sách</title>
</head>
<body>
<h2>Danh sách sách</h2>
<table border="1" cellpadding="5">
  <tr>
    <th>ID</th>
    <th>Tiêu đề</th>
    <th>Giá</th>
    <th>Giảm giá</th>
    <th>Tác giả</th>
    <th>SL Tồn</th>
    <th>Hành động</th>
  </tr>
  <c:forEach var="b" items="${books}">
    <tr>
      <td>${b.id}</td>
      <td>${b.title}</td>
      <td>${b.price}</td>
      <td>${b.discount}</td>
      <td>${b.author}</td>
      <td>${b.quantity}</td>
      <td>
        <a href="${pageContext.request.contextPath}/cart?action=add&bookId=${b.id}">Mua</a> |
        <a href="${pageContext.request.contextPath}/book?action=edit&id=${b.id}">Sửa</a> |
        <a href="${pageContext.request.contextPath}/book?action=delete&id=${b.id}"
           onclick="return confirm('Xóa sách này?');">Xóa</a>
      </td>
    </tr>
  </c:forEach>
</table>
<br/>
<a href="${pageContext.request.contextPath}/book?action=add">Thêm sách</a>
</body>
</html>
