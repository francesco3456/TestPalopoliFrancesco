<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="model.bean.LibroBean"%>
<%@ page import="service.LibroService"%>
<!DOCTYPE html>
<html>
<head>
<title>libro con titolo scelto</title>
</head>
<body>
	<h2>Libri dell'Autore selezionato:</h2>

	<%
	List<LibroBean> libri = (List<LibroBean>) request.getAttribute("libri");

	if (libri != null && !libri.isEmpty()) {
		for (LibroBean libro : libri) {
	%>
	<p><%=libro.getTitoloLibro()%></p>
	<p><%=libro.getAutoreLibro()%></p>
	<p><%=libro.getPrezzoLibro()%></p>
	<p><%=libro.getEditoreLibro()%></p>
	<p><%=libro.getGenereLibro()%></p>
	<p><%=libro.getDisponibilitaLibro()%></p>
	<%
     int disponibilita = libro.getDisponibilitaLibro();
     if (disponibilita < 3) {
 %>
     <p style="color: red;">In esaurimento (libri disponibili: <%= disponibilita %>)</p>
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
</body>
</html>