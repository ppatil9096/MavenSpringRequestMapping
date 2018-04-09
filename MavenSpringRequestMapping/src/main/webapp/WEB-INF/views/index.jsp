<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 4 MVC - @RequestMapping Example!</title>
<style type="text/css">
form {
	display: inline-block;
}
</style>
</head>
<body>
	<h1>Spring 4 MVC - @RequestMapping example</h1>
	<h4>Server current time is : ${date}</h4>

	<form action="/one">
		<input type="submit" value="one">
	</form>
	<form action="/two" method="post">
		<input type="submit" value="two">
	</form>
	<form action="/three" method="get">
		<input type="submit" value="three">
	</form>
	<form action="/four" method="post">
		<input type="submit" value="four">
	</form>
	<form action="/five" method="post">
		<input type="submit" value="five">
	</form>
	<form action="/six" method="post">
		<input type="submit" value="six">
	</form>
	<form action="/seven" method="get">
		<input type="submit" value="seven">
	</form>
	<form action="/eight" method="post">
		<input type="submit" value="eight">
	</form>
</body>
</html>