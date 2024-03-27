<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        /* CSS for the update form */
        form {
            width: 50%;
            margin: 20px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }

        label, input {
            display: block;
            margin: 10px 0;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
	<h2>Update Product</h2>
    <form method="post" action="${pageContext.request.contextPath}/updateProduct" enctype="multipart/form-data">
        <input type="text" name="productId" value="${product.id}" readonly ="readonly">
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${product.name}" required>
        
        <label for="description">Description:</label>
        <textarea id="description" name="description"></textarea>
        
        <label for="price">Price:</label>
        <input type="text" id="price" name="price" value="${product.price}" required>
        
        <label for="quantity">Quantity:</label>
        <input type="text" id="quantity" name="quantity" value="${product.quantity}" required>
        
        <label for="manufacturer">Manufacturer:</label>
        <input type="text" id="manufacturer" name="manufacturer" value="${product.manufacturer}" required>
        
        <label for="releaseDate">Release Date:</label>
        <input type="date" id="releaseDate" name="releaseDate" value="${product.releaseDate}" required>

        <!-- Thêm trường để tải lên tệp ảnh -->
        <label for="imagePath">Image:</label>
        <input type="file" id="imagePath" name="imagePath" accept="image/*" required>

        <br />
        <input type="submit" value="Update Product" />
    </form>
</body>
</html>