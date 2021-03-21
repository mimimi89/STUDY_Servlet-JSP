<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>Java Bean</title>
</head>
<body>
	<jsp:useBean class="com.edu.beans.HelloBean" id="hello"/>
	
	<jsp:getProperty property="name" name="hello"/>	
	<jsp:getProperty property="number" name="hello"/>	
	
	<!-- 
	<jsp:setProperty property="name" name="hello" value="Amy"/>
	<jsp:setProperty property="number" name="hello" value="12345"/>
	 
	<jsp:setProperty property="name" name="hello" param="a"/>
	<jsp:setProperty property="number" name="hello" param="b"/>
	-->
	
	<jsp:setProperty property="*" name="hello"/>
	
	<hr>
	
	<jsp:getProperty property="name" name="hello"/>	
	<jsp:getProperty property="number" name="hello"/>	
	
</body>
</html>