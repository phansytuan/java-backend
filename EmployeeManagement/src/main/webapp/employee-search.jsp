<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee List (JSTL)</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container mt-4">

<h1 class="text-center mb-4">Employee List</h1>

<!-- Add Employee Button -->
<div class="d-flex justify-content-end mb-3">
    <a href="${pageContext.request.contextPath}/employee-add" class="btn btn-success">Add Employee</a>
</div>

<!-- Search Form -->
<form class="row g-3 mb-4" action="<%= request.getContextPath() %>/employee" method="get">
    <div class="col-md-3">
        <label class="form-label">Name</label>
        <input type="text" class="form-control" name="name"
               value="<%= request.getParameter("name") == null ? "" : request.getParameter("name") %>">
    </div>

    <div class="col-md-3">
        <label class="form-label">Salary (>=)</label>
        <input type="number" class="form-control" name="salary"
               value="<%= request.getParameter("salary") == null ? "" : request.getParameter("salary") %>">
    </div>

    <div class="col-md-3">
        <label class="form-label">From Hire Date</label>
        <input type="date" class="form-control" name="fromHireDate"
               value="<%= request.getParameter("fromHireDate") == null ? "" : request.getParameter("fromHireDate") %>">
    </div>

    <div class="col-md-3">
        <label class="form-label">To Hire Date</label>
        <input type="date" class="form-control" name="toHireDate"
               value="<%= request.getParameter("toHireDate") == null ? "" : request.getParameter("toHireDate") %>">
    </div>

    <div class="col-md-3">
        <label class="form-label">Position</label>
        <input type="text" class="form-control" name="position"
               value="<%= request.getParameter("position") == null ? "" : request.getParameter("position") %>">
    </div>

    <div class="col-md-3">
        <label class="form-label">Department</label>
        <select class="form-select" name="departmentId">
            <option value="">--All--</option>
            <option value="1" <%= "1".equals(request.getParameter("departmentId")) ? "selected" : "" %>>Sales</option>
            <option value="2" <%= "2".equals(request.getParameter("departmentId")) ? "selected" : "" %>>HR</option>
            <option value="3" <%= "3".equals(request.getParameter("departmentId")) ? "selected" : "" %>>IT</option>
            <option value="4" <%= "4".equals(request.getParameter("departmentId")) ? "selected" : "" %>>Finance</option>
        </select>
    </div>

    <div class="col-md-3 d-flex align-items-end">
        <button type="submit" class="btn btn-primary w-100">Search</button>
    </div>
</form>

<!-- If no employees found -->
<c:if test="${empty employeeList}">
    <h3 class="text-center text-danger">Không tìm thấy nhân viên phù hợp.</h3>
</c:if>

<!-- Employee Table -->
<c:if test="${not empty employeeList}">
    <div class="table-responsive">
        <table class="table table-striped table-hover table-bordered">
            <thead class="table-primary">
            <tr>
                <th>Employee ID</th>
                <th>Name</th>
                <th>Position</th>
                <th>Salary</th>
                <th>Department</th>
                <th>Hire Date</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="emp" items="${employeeList}">
                <tr>
                    <td><c:out value="${emp.employeeId}" /></td>
                    <td><c:out value="${emp.name}" /></td>
                    <td><c:out value="${emp.position}" /></td>
                    <td><c:out value="${emp.salary}" /></td>
                    <td><c:out value="${emp.departmentName}" /></td>
                    <td><c:out value="${emp.hireDate}" /></td>
                    <td>
                        <a href="${pageContext.request.contextPath}/employee-edit?employeeId=${emp.employeeId}"
                           class="btn btn-warning btn-sm me-2">Edit</a>
                        <a href="${pageContext.request.contextPath}/employee-delete?employeeId=${emp.employeeId}"
                           class="btn btn-danger btn-sm"
                           onclick="return confirm('Are you sure you want to delete this employee?');">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</c:if>

</body>
</html>
