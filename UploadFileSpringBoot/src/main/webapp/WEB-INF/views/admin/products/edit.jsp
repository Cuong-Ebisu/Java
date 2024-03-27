<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
</head>
<body>
<h2>Add Product</h2>
<form action="<c:url value="/products/add"/>" method="post" enctype="multipart/form-data">
    <label>Name:</label>
    <input type="text" name="name" required><br>

    <label>Description:</label>
    <textarea name="description" required></textarea><br>

    <label>Price:</label>
    <input type="number" name="price" step="0.01" required><br>

    <label>Quantity:</label>
    <input type="number" name="quantity" required><br>

    <label>Manufacturer:</label>
    <input type="text" name="manufacturer" required><br>

    <label>Release Date:</label>
    <input type="date" name="releaseDate" required><br>

    <label>Image:</label>
    <input type="file" name="file" accept="image/*" required><br>

    <input type="submit" value="Add">
</form>
</body>
</html>
