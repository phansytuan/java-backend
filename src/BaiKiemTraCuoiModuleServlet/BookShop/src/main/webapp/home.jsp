<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="vn.t3h.btvn.bookshop.model.User" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%
    User u = (User) session.getAttribute("loggedUser");
    if(u != null) {
%>
<p>Xin chào, <b><%= u.getFullname() %></b> (role: <%= u.getRole() %>)</p>
<p><a href="<%= request.getContextPath() %>/logout">Đăng xuất</a></p>
<%
    }
%>

<h2>Trang chủ</h2>
<ul>
    <li><a href="<%= request.getContextPath() %>/book?action=list">Quản lý Sách</a></li>
    <li><a href="<%= request.getContextPath() %>/cart?action=view">Giỏ hàng</a></li>
    <li><a href="<%= request.getContextPath() %>/order?action=list">Danh sách Đơn hàng</a></li>
    <%
        if(u != null && "ADMIN".equals(u.getRole())) {
    %>
    <li><a href="<%= request.getContextPath() %>/user?action=list">Quản lý User</a></li>
    <%
        }
    %>
</ul>
</body>
</html>
