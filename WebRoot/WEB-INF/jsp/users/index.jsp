<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta de Users</title>
</head>
<body>
	<h1>Hibernate com Memcached</h1>
	
	<table>
		<tr>
			<th>Quantidade</th>
			<th>Tempo</th>
			<th>Qtd / Tempo</th>
		</tr>
		
		<tr>
			<td>${quantidade}</td>
			<td>${tempo}</td>
			<td>${quantidadePorTempo}</td>
		</tr>
	</table>
</body>
</html>