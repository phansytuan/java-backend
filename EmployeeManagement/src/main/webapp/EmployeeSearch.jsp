<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/15/2025
  Time: 8:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List, vn.t3h.btvn.employeemanagement.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        .search-form {
            margin-bottom: 10px;
        }
        .search-form label {
            margin-right: 8px;
        }
        .search-input {
            margin-right: 15px;
        }
    </style>
</head>
<body>
<h1>Employee List</h1>

<!-- Form tìm kiếm -->
<form class="search-form" action="<%= request.getContextPath() %>/EmployeeSearchServlet" method="get">
    <label>Name:</label>
    <input class="search-input" type="text" name="name"
           value="<%= request.getParameter("name") == null ? "" : request.getParameter("name") %>" />

    <label>Salary (>=):</label>
    <input class="search-input" type="number" name="salary"
           value="<%= request.getParameter("salary") == null ? "" : request.getParameter("salary") %>" />

    <label>From Hire Date:</label>
    <input class="search-input" type="date" name="fromHireDate"
           value="<%= request.getParameter("fromHireDate") == null ? "" : request.getParameter("fromHireDate") %>" />

    <label>To Hire Date:</label>
    <input class="search-input" type="date" name="toHireDate"
           value="<%= request.getParameter("toHireDate") == null ? "" : request.getParameter("toHireDate") %>" />

    <label>Position:</label>
    <input class="search-input" type="text" name="position"
           value="<%= request.getParameter("position") == null ? "" : request.getParameter("position") %>" />

    <label>Department:</label>
    <select class="search-input" name="departmentId">
        <option value="">--All--</option>
        <!-- Hard-code ví dụ, hoặc bạn có thể load dynamic từ DB -->
        <option value="1" <%= "1".equals(request.getParameter("departmentId")) ? "selected" : "" %>>Sales</option>
        <option value="2" <%= "2".equals(request.getParameter("departmentId")) ? "selected" : "" %>>HR</option>
        <option value="3" <%= "3".equals(request.getParameter("departmentId")) ? "selected" : "" %>>IT</option>
        <option value="4" <%= "4".equals(request.getParameter("departmentId")) ? "selected" : "" %>>Finance</option>
    </select>

    <input type="submit" value="Search" />
</form>

<!-- Hiển thị kết quả -->
<%
    List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
    if (employeeList != null) {
        if (employeeList.isEmpty()) {
%>
<h3>Không tìm thấy nhân viên phù hợp.</h3>
<%
} else {
%>
<table>
    <tr>
        <th>Employee ID</th>
        <th>Name</th>
        <th>Position</th>
        <th>Salary</th>
        <th>Department</th>
        <th>Hire Date</th>
    </tr>
    <%
        for (Employee emp : employeeList) {
    %>
    <tr>
        <td><%= emp.getEmployeeId() %></td>
        <td><%= emp.getName() %></td>
        <td><%= emp.getPosition() %></td>
        <td><%= emp.getSalary() %></td>
        <td><%= emp.getDepartmentName() %></td>
        <td><%= emp.getHireDate() %></td>
    </tr>
    <%
        }
    %>
</table>
<%
        }
    }
%>
</body>
</html>

