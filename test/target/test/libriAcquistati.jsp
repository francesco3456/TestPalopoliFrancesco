<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="model.bean.UtenteBean"%>
<%@ page import="service.UtenteService"%>
<!DOCTYPE html>
<html>
<head>
    <title>Visualizza Utenti con Cinque o più Libri Acquistati</title>
</head>
<body>

<form action="LibriAcquistati" method="post">
<h2>Utenti con più di 5 libri acquistati:</h2>

	<%
	List<UtenteBean> utenti = (List<UtenteBean>) request.getAttribute("utenti");

	if (utenti != null && !utenti.isEmpty()) {
		for (UtenteBean utente : utenti) {
	%>
	<p><%=utente.getNomeUtente()%></p>
	<p><%=utente.getCognomeUtente()%></p>
	<p><%=utente.getEmailUtente()%></p>
	<p><%=utente.getLibriAcquistati()%></p>
	<p><%=utente.getRuoloUtente()%></p>
	<%
	}
	} else {
	%>
	<p>Nessun utente disponibile per il titolo selezionato.</p>
	<%
	}
	%>
</form>

</body>
</html>
