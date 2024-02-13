<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="model.bean.LibroBean"%>
<%@ page import="service.LibroService"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<title>libro con titolo scelto</title>
</head>
<body>
<div class="container">
	<h2>Libri dell'Autore selezionato:</h2>

	<%
	List<LibroBean> libri = (List<LibroBean>) request.getAttribute("libri");
	%>
	<table class="table">
		<tr>
			<th scope="col">Titolo</th>
			<th scope="col">Autore</th>
			<th scope="col">Prezzo</th>
			<th scope="col">Editore</th>
			<th scope="col">Genere</th>
			<th scope="col">Disponibili</th>
		</tr>
		<%
		if (libri != null && !libri.isEmpty()) {
			for (LibroBean libro : libri) {
		%>
		<tr>
			<td><%=libro.getTitoloLibro()%></td>
			<td><%=libro.getAutoreLibro()%></td>
			<td><%=libro.getPrezzoLibro()%></td>
			<td><%=libro.getEditoreLibro()%></td>
			<td><%=libro.getGenereLibro()%></td>
			<td><%=libro.getDisponibilitaLibro()%></td>
		</tr>
		<%
		int disponibilita = libro.getDisponibilitaLibro();
		if (disponibilita < 3) {
		%>
		<p style="color: red;">
			In esaurimento (libri disponibili:<%=disponibilita%>)
		</p>
		<%
		}
		%>
		<%
		}
		} else {
		%>
		<p>Nessun libro disponibile per il titolo selezionato.</p>
		<%
		}
		%>
		</table>
	</div>
</body>
</html>