package Application;

import model.dao.Utentedao;

public class App {

	public static void main(String[] args) {

		
		Utentedao u = new Utentedao() ;
		
		u.findUtenteWithMoreFiveBooks();
		System.out.println(u);
	}

}
