<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="Cricket" method="post">
	Name : <input type="text" name="name1" placeholder="enter your name"/><br/><br/>
	Age  : <input type="number" name="age1" placeholder="enter your age"/><br/><br/>
	Role : <input type="radio" name="role1" value="batsman"/>batsman<input type="radio" name="role1" value="bowler"/>Bowler<input type="radio" name="role1" value="AllRounder" />AllRounder<br/><br/>
	Area : <select name="area1">
			<option> Limdo </option>
			<option> Pipdo </option>
			<option> pachad(school) </option>
			
			
			</select><br/><br/>
			<input type="submit" value="submit"/>
	
	</form>
</body>
</html>