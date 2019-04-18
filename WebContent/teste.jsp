<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
	<table class="table">
		<tr>
			<th>Nome</th>
			<th>Senha</th>
			<th>E-mail</th>
			<th>Telefone</th>
			<th>Endereço</th>
		</tr>

		<c:forEach var="pessoa" items="${contatos}">
			<tr>
				<td>${pessoa.nome}</td>
				<td>${pessoa.senha}</td>
				<td>${pessoa.email}</td>
				<td>${pessoa.telefone}</td>
				<td>${pessoa.endereco}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>