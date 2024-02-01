<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="model.bean.UtenteBean"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>Pagina dell'esercizio 1</h2>
		<%
		List<UtenteBean> utenti = (List<UtenteBean>) request.getAttribute("risultato");
		%>
		<table  class="table">
			<tr>
				<th scope="col">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>
				<th scope="col">Libri acquistati</th>
				<th scope="col">è premium</th>
			</tr>
			
				<%
				for (UtenteBean utente : utenti) {
				%>
				<tr>
				<td>
					<%=utente.getNomeUtente()%>
				</td>
				<td>
					<%=utente.getCognomeUtente()%>
				</td>
				<td>
					<%=utente.getEmailUtente()%>
				</td>
				<td>
					<%=utente.getLibriAcquistati()%>
				</td>
				<td>
					<%=utente.isPremium()%>
				</td>
				</tr>
				<%}%>
			
		</table>



	</div>
</body>
</html>
