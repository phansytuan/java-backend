<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!-- CSS Styles -->
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .search-form {
            display: flex;
            flex-wrap: wrap;
            gap: 15px;
            margin-bottom: 20px;
        }
        .search-form label {
            font-weight: bold;
        }
        .search-form input[type="text"],
        .search-form input[type="date"] {
            padding: 5px;
            width: 200px;
        }
        .search-form input[type="submit"] {
            padding: 8px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        .search-form input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>

<body>
<div style="margin: 2%">
    <span>Xin chào ${username}</span><br>
    <a href="/logout">Đăng xuất</a>
</div>

<div class="row g-3">
    <div class="col-sm">
    </div>
    <div class="col-sm-9">
        <div>
            <h1>Employee List</h1>

            <!-- Form tìm kiếm với các trường hiển thị ngang -->
            <form class="search-form" action="employee" method="get">
                <div>
                    <label for="name">Name:</label>
                    <input type="text" id="name" name="name" value="${param.name}" placeholder="Search by Name"/>
                </div>

                <div>
                    <label for="salary">Salary:</label>
                    <input type="text" id="salary" name="salary" value="${param.salary}" placeholder="Search by Salary"/>
                </div>

                <div>
                    <label for="fromDate">From Hire Date:</label>
                    <input type="date" id="fromDate" name="fromDate" value="${param.fromDate}"/>
                </div>

                <div>
                    <label for="toDate">To Hire Date:</label>
                    <input type="date" id="toDate" name="toDate" value="${param.toDate}"/>
                </div>

                <div>
                    <label for="position">Position:</label>
                    <input type="text" id="position" name="position" value="${param.position}" placeholder="Search by Position"/>
                </div>

                <div>
                    <input type="submit" value="Search"/>
                </div>
            </form>
<%--            điều hướng sang url /action-employee--%>
            <form action="action-employee" method="get">
                <button type="submit" class="btn btn-outline-primary">Thêm nhân viên</button>
            </form>
            <!-- Bảng danh sách nhân viên -->
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Position</th>
                    <th>Salary</th>
                    <th>Department</th>
                    <th>Hire Date</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="employeeModel" items="${employeeData}">
                    <tr>
                        <td>${employeeModel.employeeId}</td>
                        <td>${employeeModel.name}</td>
                        <td>${employeeModel.position}</td>
                        <td>${employeeModel.salary}</td>
                        <td>${employeeModel.departmentName}</td>
                        <td>${employeeModel.hireDate}</td>
                        <td>
                            <div class="row">
                                <div class="col">
                                    <button type="button" class="btn btn-outline-danger">Delete</button>
                                </div>
                                <div class="col">
                                    <button type="button" class="btn btn-outline-warning">Edit</button>
                                </div>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
    <div class="col-sm">
    </div>
</div>


</body>
</html>
