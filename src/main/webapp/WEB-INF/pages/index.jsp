<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
"Hello World"
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.12.2.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			type : "get",
			url : "getMessage",
			contentType : "json",
			success : function(data){
				alert(data);
			}
		});
	});
</script>
</html>