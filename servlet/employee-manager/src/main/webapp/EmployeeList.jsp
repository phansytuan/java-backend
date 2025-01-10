<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/10/2025
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Danh Sách Nhân Viên</h1>
<table>
    <thead>
        <tr>
            <th>Employee ID</th>
            <th>Name</th>
            <th>Position</th>
            <th>Salary</th>
            <th>Department name</th>
            <th>Hire Date</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="employee" items="${employeesData}">
            <tr>
                <td>${employee.employeeId}</td>
                <td>${employee.name}</td>
                <td>${employee.position}</td>
                <td>${employee.salary}</td>
                <td>${employee.departmentName}</td>
                <td>${employee.hireDate}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
