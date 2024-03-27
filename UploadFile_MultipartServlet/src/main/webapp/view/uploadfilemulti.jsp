<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload Example</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/uploadmulti" enctype="multipart/form-data">
        Select file to upload:
        <br />
        <input type="file" name="image" />
        <br />
        Name:
        <br />
        <input type="text" name="name" size="100" />
        <br />
        <br />
        <input type="submit" value="Upload" />
    </form>
</body>
</html>