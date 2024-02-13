<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Selezione Autore</title>
</head>
<body>

<form action="LibriSingoloAutore" method="post">
    <label for="autore">Seleziona un autore:</label>
    <select name="autore">
        <option value="Italo Svevo">Italo Svevo</option>
        <option value="Charles Dickens">Charles Dickens</option>
        <option value="Lev Tolstoj">Lev Tolstoj</option>
        <option value="Stendhal">Stendhal</option>
    </select>
    <input type="submit" value="Visualizza Libri">
</form>

</body>
</html>