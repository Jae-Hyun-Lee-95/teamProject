<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 나의 페이지 </title>
</head>
<body>

[ ${ sessionScope.logname } ] 님이 로그인을 한 후에 볼 수 있는 페이지입니다.

<% response.sendRedirect("../home-pages/home-01.do"); %>

</body>
</html>