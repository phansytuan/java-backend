<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee List (JSTL)</title>
    <style>
        /* Cấu hình hiển thị bảng */
        table {border-collapse: collapse; width: 100%; margin-top: 20px;}
        table, th, td {border: 1px solid #ccc;}
        th, td {padding: 8px; text-align: left;}
        /* Cấu hình form tìm kiếm */
        .search-form {margin-bottom: 10px;}
        .search-form label {margin-right: 8px;}
        .search-input {margin-right: 15px;}
    </style>
</head>
<body>
<h1>Employee List</h1>

<!-- Form tìm kiếm -->
<form class="search-form" action="<%= request.getContextPath() %>/employee" method="get">
    <!-- Ô nhập liệu tìm kiếm theo tên nhân viên -->
    <label>Name:</label>
    <input class="search-input" type="text" name="name"
           value="<%= request.getParameter("name") == null ? "" : request.getParameter("name") %>" />

    <!-- Ô nhập liệu tìm kiếm theo mức lương lớn hơn hoặc bằng -->
    <label>Salary (>=):</label>
    <input class="search-input" type="number" name="salary"
           value="<%= request.getParameter("salary") == null ? "" : request.getParameter("salary") %>" />

    <!-- Ô nhập liệu tìm kiếm theo ngày bắt đầu -->
    <label>From Hire Date:</label>
    <input class="search-input" type="date" name="fromHireDate"
           value="<%= request.getParameter("fromHireDate") == null ? "" : request.getParameter("fromHireDate") %>" />

    <!-- Ô nhập liệu tìm kiếm theo ngày kết thúc -->
    <label>To Hire Date:</label>
    <input class="search-input" type="date" name="toHireDate"
           value="<%= request.getParameter("toHireDate") == null ? "" : request.getParameter("toHireDate") %>" />

    <!-- Ô nhập liệu tìm kiếm theo vị trí/chức vụ -->
    <label>Position:</label>
    <input class="search-input" type="text" name="position"
           value="<%= request.getParameter("position") == null ? "" : request.getParameter("position") %>" />

    <!-- Ô chọn để tìm kiếm theo phòng ban -->
    <label>Department:</label>
    <select class="search-input" name="departmentId">
        <option value="">--All--</option>
        <!-- Dữ liệu phòng ban chúng ta hard-code hoặc load dynamic từ DB -->
        <option value="1" <%= "1".equals(request.getParameter("departmentId")) ? "selected" : "" %>>Sales</option>
        <option value="2" <%= "2".equals(request.getParameter("departmentId")) ? "selected" : "" %>>HR</option>
        <option value="3" <%= "3".equals(request.getParameter("departmentId")) ? "selected" : "" %>>IT</option>
        <option value="4" <%= "4".equals(request.getParameter("departmentId")) ? "selected" : "" %>>Finance</option>
    </select>

    <!-- Nút tìm kiếm -->
    <input type="submit" value="Search" />
</form>

<!-- Sử dụng JSTL để kiểm tra danh sách nhân viên -->
<!-- Nếu không có nhân viên nào khớp, hiển thị thông báo -->
<c:if test="${empty employeeList}">
    <h3>Không tìm thấy nhân viên phù hợp.</h3>
</c:if>

<!-- Nếu danh sách nhân viên không rỗng, hiển thị bảng -->
<c:if test="${not empty employeeList}">
    <table>
        <tr>
            <th>Employee ID</th>
            <th>Name</th>
            <th>Position</th>
            <th>Salary</th>
            <th>Department</th>
            <th>Hire Date</th>
        </tr>
        <!-- Lặp qua danh sách nhân viên bằng JSTL -->
        <c:forEach var="emp" items="${employeeList}">
            <tr>
                <td><c:out value="${emp.employeeId}" /></td>
                <td><c:out value="${emp.name}" /></td>
                <td><c:out value="${emp.position}" /></td>
                <td><c:out value="${emp.salary}" /></td>
                <td><c:out value="${emp.departmentName}" /></td>
                <td><c:out value="${emp.hireDate}" /></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
