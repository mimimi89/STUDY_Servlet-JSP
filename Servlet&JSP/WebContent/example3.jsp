<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<title>예외상황 처리</title>
</head>
<body>
	<h4>다음과 같은 에러가 발생했습니다.</h4>
	에러 타입 : 
	<%=exception.getClass().getName()%><br>
	에러 메세지 : 
	<%=exception.getMessage() %>
</body>
</html>