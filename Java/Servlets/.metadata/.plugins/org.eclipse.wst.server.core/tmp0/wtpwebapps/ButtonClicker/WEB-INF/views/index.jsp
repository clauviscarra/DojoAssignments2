
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
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

<fieldset>
	<h2>You've clicked the button <c:out value="${count}"/> times</h2>


<form action="/ButtonClicker/index" method="get">
<input type="submit" value="Increase Count">

</form>
</fieldset>
</div>
</body>
</html>