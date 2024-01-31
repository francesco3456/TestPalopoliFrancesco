package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.UtenteBean;
import service.UtenteService;

@WebServlet("/LibriAcquistati")
public class LibriAcquistati extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UtenteService utenteService = new UtenteService();
        List<UtenteBean> utenti = utenteService.visualizzaUtentiConCinqueOPiuLibriAcquistati();

        request.setAttribute("utenti", utenti);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/libriAcquistati.jsp");
        dispatcher.forward(request, response);
    }
}

