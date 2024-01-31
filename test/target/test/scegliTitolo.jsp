<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Selezione Libro</title>
</head>
<body>

<form action="LibriDisponibili" method="post">
    <label for="titolo">Seleziona un titolo di un libro:</label>
    <select name="titolo">
        <option value="Cent'anni di solitudine">Cent'anni di solitudine</option>
        <option value="Il Rosso e il Nero">Il Rosso e il Nero</option>
        <option value="Il Conte di Montecristo">Il Conte di Montecristo</option>
        <option value="La coscienza di Zeno">La coscienza di Zeno</option>
    </select>
    <input type="submit" value="Visualizza Libri">
</form>

</body>
</html>