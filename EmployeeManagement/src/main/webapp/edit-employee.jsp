<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body class="container mt-4">
<h1 class="text-center mb-4">Edit Employee</h1>
<c:if test="${not empty errorMessage}">
    <div class="alert alert-danger">${errorMessage}</div>
</c:if>
<form action="${pageContext.request.contextPath}/employee-edit" method="post">
    <input type="hidden" name="employeeId" value="${employee.employeeId}" />
    <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input type="text" class="form-control" id="name" name="name" value="${employee.name}" required>
    </div>
    <div class="mb-3">
        <label for="position" class="form-label">Position</label>
        <input type="text" class="form-control" id="position" name="position" value="${employee.position}" required>
    </div>
    <div class="mb-3">
        <label for="salary" class="form-label">Salary</label>
        <input type="number" class="form-control" id="salary" name="salary" value="${employee.salary}" step="0.01" required>
    </div>
    <div class="mb-3">
        <label for="departmentId" class="form-label">Department</label>
        <select class="form-select" id="departmentId" name="departmentId" required>
            <option value="">-- Select Department --</option>
            <option value="1" <c:if test="${employee.departmentId == 1}">selected</c:if>>Sales</option>
            <option value="2" <c:if test="${employee.departmentId == 2}">selected</c:if>>HR</option>
            <option value="3" <c:if test="${employee.departmentId == 3}">selected</c:if>>IT</option>
            <option value="4" <c:if test="${employee.departmentId == 4}">selected</c:if>>Finance</option>
        </select>
    </div>
    <div class="mb-3">
        <label for="hireDate" class="form-label">Hire Date</label>
        <input type="date" class="form-control" id="hireDate" name="hireDate" value="${employee.hireDate}" required>
    </div>
    <div class="d-flex justify-content-between">
        <a href="${pageContext.request.contextPath}/employee" class="btn btn-secondary">Cancel</a>
        <button type="submit" class="btn btn-success">Update Employee</button>
    </div>
</form>
</body>
</html>
