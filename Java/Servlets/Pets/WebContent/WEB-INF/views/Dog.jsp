<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dog</title>
</head>


<style>
*{
font-family:sans-serif;
text-align:center;
}

.container{
width:500px;
margin:auto;
}


</style>

<body>
<div class=container>
<h1>This your dog!!!</h1>
<c:out value="${dog.showAffection()}"/>

</div>


</body>
</html>