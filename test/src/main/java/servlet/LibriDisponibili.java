package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.LibroBean;
import service.LibroService;

@WebServlet("/LibriDisponibili")
public class LibriDisponibili extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String titolo = request.getParameter("titolo");

	    // Utilizza il servizio per ottenere la lista di libri
	    LibroService libroService = new LibroService();
	    List<LibroBean> libri = libroService.visualizzaQtaDisponibile(titolo);

	    // Imposta la lista di libri come attributo della richiesta
	    request.setAttribute("libri", libri);

	    // Inoltra la richiesta alla pagina JSP per visualizzare i libri
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/libriDisponibili.jsp");
	    dispatcher.forward(request, response);
	}
}
