<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="https://localhost:8080/freemarker/login" method="post">
	<input name="name" type="text"/><br/>
	<input name="password" type="password"/><br/>
	<input type="submit" value="确定"/>
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.2.js"></script>
<script type="text/javascript">
</script>
</html>