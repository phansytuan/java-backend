<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Form Sách</title>
</head>
<body>
<h2><c:if test="${book != null}">Sửa sách</c:if><c:if test="${book == null}">Thêm sách</c:if></h2>
<form action="${pageContext.request.contextPath}/book" method="post">
    <c:if test="${book != null}">
        <input type="hidden" name="id" value="${book.id}" />
    </c:if>
    Tiêu đề: <input type="text" name="title" value="${book.title}" /><br/>
    Giá: <input type="text" name="price" value="${book.price}" /><br/>
    Giảm giá: <input type="text" name="discount" value="${book.discount}" /><br/>
    Tác giả: <input type="text" name="author" value="${book.author}" /><br/>
    NXB: <input type="text" name="publisher" value="${book.publisher}" /><br/>
    Năm XB: <input type="text" name="publishYear" value="${book.publishYear}" /><br/>
    Số trang: <input type="text" name="pages" value="${book.pages}" /><br/>
    Số lượng: <input type="text" name="quantity" value="${book.quantity}" /><br/>
    Mô tả: <textarea name="description">${book.description}</textarea><br/>
    Ảnh: <input type="text" name="image" value="${book.image}" /><br/>
    Danh mục:
    <select name="categoryId">
        <c:forEach var="c" items="${categories}">
            <option value="${c.id}" <c:if test="${book != null && c.id == book.categoryId}">selected</c:if>>${c.name}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Lưu" />
</form>
</body>
</html>
