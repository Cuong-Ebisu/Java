<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>
	<h2>Add Product</h2>

    <form method="post" action="${pageContext.request.contextPath}/addProduct" enctype="multipart/form-data">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br>

        <label for="description">Description:</label>
        <textarea id="description" name="description"></textarea>
        <br>

        <label for="price">Price:</label>
        <input type="text" id="price" name="price" required>
        <br>

        <label for="quantity">Quantity:</label>
        <input type="text" id="quantity" name="quantity" required>
        <br>

        <label for="manufacturer">Manufacturer:</label>
        <input type="text" id="manufacturer" name="manufacturer" required>
        <br>

        <!-- You may need to adjust the date input based on the date format expected -->
        <label for="releaseDate">Release Date:</label>
        <input type="date" id="releaseDate" name="releaseDate">
        <br>

        <!-- Assume you have a file input for uploading the image -->
        <label for="imagePath">Image:</label>
        <input type="file" id="imagePath" name="imagePath" accept="image/*" required>
        <br>

        <input type="submit" value="Add Product">
    </form>
</body>
</html>