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
public class LibriAcquistati extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            UtenteService utenteService = new UtenteService();
            
            List<UtenteBean> utentiPrimoEs = utenteService.firstQueryExam();
            for (UtenteBean ut : utentiPrimoEs) {
    			System.out.println(ut);
    		}
            
            request.setAttribute("risultato", utentiPrimoEs);
            
            RequestDispatcher rd = request.getRequestDispatcher("/libriAcquistati.jsp");
            rd.forward(request, response);
        }
    
}

