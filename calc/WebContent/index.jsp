<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/index.css"/>
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="Result" method="POST">
			<div class="display">
				<input class="text" type="text" name="firstValue" value="${masterValue} ${action}" disabled="disabled">
				<input class="text" type="text" name="vlueText" value="${counter}" disabled="disabled"> 
			</div>
			<table>
				<tr>
					<td><input type="button" value="/" onclick="location.href='ButtonAction?ab=/'"></td>
					<td><input type="button" value="*" onclick="location.href='ButtonAction?ab=*'"></td>
					<td><input type="button" value="-" onclick="location.href='ButtonAction?ab=-'"></td>
					<td rowspan="2"><input class="vetical" type="button" value="+" onclick="location.href='ButtonAction?ab='"></td>
				</tr>
				<tr>
					<td><input type="button" value="7" onclick="location.href='NumberButton?value=7'"></td>
					<td><input type="button" value="8" onclick="location.href='NumberButton?value=8'"></td>
					<td><input type="button" value="9" onclick="location.href='NumberButton?value=9'"></td>
				</tr>
				<tr>
					<td><input type="button" value="4" onclick="location.href='NumberButton?value=4'"></td>
					<td><input type="button" value="5" onclick="location.href='NumberButton?value=5'"></td>
					<td><input type="button" value="6" onclick="location.href='NumberButton?value=6'"></td>
					<td rowspan="3"><input class="equally" type="submit" value="="></td>
				</tr>
				<tr>
					<td><input type="button" value="1" onclick="location.href='NumberButton?value=1'"></td>
					<td><input type="button" value="2" onclick="location.href='NumberButton?value=2'"></td>
					<td><input type="button" value="3" onclick="location.href='NumberButton?value=3'"></td>
				</tr>
				<tr>
					<td><input type="button" value="0" onclick="location.href='NumberButton?value=0'"></td>
					<td colspan="2"><input class="horizontal" type="button" onclick="location.href='Reset'" value="C"></td>
				</tr>
			</table>
			
		</form>
	</div>
</body>
</html>