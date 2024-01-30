package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.bean.LibroBean;
import model.bean.UtenteBean;
import utils.DbConnection;

public class Utentedao {

	public List<UtenteBean> findAll() {
		String query = "SELECT * FROM utente;";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		Statement st = null;
		List<UtenteBean> utenti = new ArrayList<>();
	
		try {
			st = con.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next()) {
				UtenteBean utenteBean = new UtenteBean();
				
				utenteBean.setIdUtente(rs.getLong("id_utente"));
				utenteBean.setNomeUtente(rs.getString("nome"));
				utenteBean.setCognomeUtente(rs.getString("cognome"));
				utenteBean.setEmailUtente(rs.getString("email"));
				utenteBean.setPasswordUtente(rs.getString("password"));
				utenteBean.setDataCreazioneUtente(rs.getTimestamp("data_creazione").toLocalDateTime());
				utenteBean.setDataModificaUtente(rs.getTimestamp("data_modifica").toLocalDateTime());
				utenteBean.setFlgCancellatoUtente(rs.getBoolean("flg_cancellato"));
				utenteBean.setRuoloUtente(rs.getLong("ruolo"));
				utenteBean.setLibriAcquistati(rs.getInt("libri_acquistati"));
				
				utenti.add(utenteBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbCon.closeConnection(con);
		
		return utenti;
	}
	
	public UtenteBean findById(Long id) {
		String query = "SELECT * FROM utente WHERE id_utente=?";
		
		DbConnection dbCon = new DbConnection();
		Connection con = dbCon.getConnection();
		
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ResultSet rs;
		UtenteBean utenteBean = new UtenteBean();
		try {
			rs = ps.executeQuery();

			while (rs.next()) {
				utenteBean.setIdUtente(rs.getLong("id_utente"));
				utenteBean.setNomeUtente(rs.getString("nome"));
				utenteBean.setCognomeUtente(rs.getString("cognome"));
				utenteBean.setEmailUtente(rs.getString("email"));
				utenteBean.setPasswordUtente(rs.getString("password"));
				utenteBean.setDataCreazioneUtente(rs.getTimestamp("data_creazione").toLocalDateTime());
				utenteBean.setDataModificaUtente(rs.getTimestamp("data_modifica").toLocalDateTime());
				utenteBean.setFlgCancellatoUtente(rs.getBoolean("flg_cancellato"));
				utenteBean.setRuoloUtente(rs.getLong("ruolo"));
				utenteBean.setLibriAcquistati(rs.getInt("libri_acquistati"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);
		
		return utenteBean;
	}
	
	 public UtenteBean findByEmailAndPassword(UtenteBean utenteBean) {
	        String query = "SELECT * FROM utente WHERE email=? AND password=?";
	        
	        DbConnection dbCon = new DbConnection();
	        Connection con = dbCon.getConnection();
	        
	        PreparedStatement ps = null;
	        UtenteBean loggedUtenteBean = null;
	        
	        try {
	            ps = con.prepareStatement(query);
	            ps.setString(1, utenteBean.getEmailUtente());
	            ps.setString(2, utenteBean.getPasswordUtente());
	            
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	            	loggedUtenteBean = new UtenteBean();
	            	loggedUtenteBean.setIdUtente(rs.getLong("id_utente"));
	            	loggedUtenteBean.setNomeUtente(rs.getString("nome"));
	            	loggedUtenteBean.setCognomeUtente(rs.getString("cognome"));
	            	loggedUtenteBean.setEmailUtente(rs.getString("email"));
	            	loggedUtenteBean.setPasswordUtente(rs.getString("password"));
	            	loggedUtenteBean.setDataCreazioneUtente(rs.getTimestamp("data_creazione").toLocalDateTime());
	            	loggedUtenteBean.setDataModificaUtente(rs.getTimestamp("data_modifica").toLocalDateTime());
	            	loggedUtenteBean.setFlgCancellatoUtente(rs.getBoolean("flg_cancellato"));
	            	loggedUtenteBean.setRuoloUtente(rs.getLong("ruolo"));
					loggedUtenteBean.setLibriAcquistati(rs.getInt("libri_acquistati"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            dbCon.closeConnection(con);
	        }

	        return loggedUtenteBean;
	 }
	        public UtenteBean insert(UtenteBean utenteBean) {
	    		String query = "INSERT INTO utente (nome, cognome, email, password, ruolo, data_creazione, data_modifica, flg_cancellato, libri_acquistati) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	    		
	    		DbConnection dbCon = new DbConnection();
	    		Connection con = dbCon.getConnection();
	    		
	    		PreparedStatement ps = null;
	    		try {
	    			ps = con.prepareStatement(query);
	    			
	    			ps.setString(1, utenteBean.getNomeUtente());
	    			ps.setString(2, utenteBean.getCognomeUtente());
	    			ps.setString(3, utenteBean.getEmailUtente());
	    			ps.setString(4, utenteBean.getPasswordUtente());
	    			ps.setLong(5, utenteBean.getRuoloUtente());
	    			ps.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));
	    			ps.setTimestamp(7, Timestamp.valueOf(LocalDateTime.now()));
	    			ps.setBoolean(8, utenteBean.getFlgCancellatoUtente());
	    			ps.setInt(9, utenteBean.getLibriAcquistati());
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	    		
	    		int insertOutput = 0;
	    		try {
	    			insertOutput = ps.executeUpdate();
	    			if (insertOutput == 1) {
	    			    ResultSet rs = ps.getGeneratedKeys();
	    			    if (rs.next()) {
	    			    	Long idNuovoUtente = rs.getLong(1);
	    			        return findById(idNuovoUtente);
	    			    }
	    			}
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}

	    		dbCon.closeConnection(con);
	    		
	    		return new UtenteBean();
	    	}
	    	
	    	public int update(UtenteBean utenteBean) {
	    	    String query = "UPDATE utente SET nome=?, cognome=?, ruolo=?, email=?, password=?, data_modifica=?, flg_cancellato=?, libri_acquistati=? WHERE id_utente=?";
	    	    
	    	    DbConnection dbCon = new DbConnection();
	    	    Connection con = dbCon.getConnection();
	    	    
	    	    PreparedStatement ps = null;
	    		try {
	    			ps = con.prepareStatement(query);
	    			
	    		    ps.setString(1, utenteBean.getNomeUtente());
	    	        ps.setString(2, utenteBean.getCognomeUtente());
	    	        ps.setLong(3, utenteBean.getRuoloUtente());
	    	        ps.setString(4, utenteBean.getEmailUtente());
	    	        ps.setString(5, utenteBean.getPasswordUtente());
	    	        ps.setTimestamp(6, Timestamp.valueOf(utenteBean.getDataModificaUtente()));
	    	        ps.setBoolean(7, utenteBean.getFlgCancellatoUtente());
	    	        ps.setLong(8, utenteBean.getIdUtente());
	    			ps.setInt(9, utenteBean.getLibriAcquistati());
	    			
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	            
	            int updateOutput = 0;
	    		try {
	    			updateOutput = ps.executeUpdate();
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	            
	            dbCon.closeConnection(con);
	            
	            return updateOutput;
	    	}
	    	
	    	public int trash(UtenteBean utenteBean) {
	    	    String query = "UPDATE utente SET flg_cancellato=? WHERE id_utente=?";
	    	    
	    	    DbConnection dbCon = new DbConnection();
	    	    Connection con = dbCon.getConnection();
	    	    
	    	    PreparedStatement ps = null;
	    		try {
	    			ps = con.prepareStatement(query);
	    			
	    	        ps.setBoolean(1, true);
	    	        ps.setLong(2, utenteBean.getIdUtente());
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	            
	            int trashOutput = 0;
	    		try {
	    			trashOutput = ps.executeUpdate();
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	            
	            dbCon.closeConnection(con);
	            
	            return trashOutput;
	    	}
	    	
	    	public int deleteById(Long id) {
	    		String query = "DELETE FROM utente WHERE id_utente=?";
	    		
	    	    DbConnection dbCon = new DbConnection();
	    	    Connection con = dbCon.getConnection();
	    	    
	    	    PreparedStatement ps = null;
	    		try {
	    			ps = con.prepareStatement(query);
	    			
	    		    ps.setLong(1, id);
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	    	    
	    	    int deleteOutput = 0;
	    		try {
	    			deleteOutput = ps.executeUpdate();
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}
	    	    
	    	    dbCon.closeConnection(con);
	    	    
	    	    return deleteOutput;
	    	}
	    	
	    	public UtenteBean findUtenteWithMoreFiveBooks() {
	    		String query = "SELECT nome, cognome, libri_acquistati FROM utente where libri_acquistati > 5";
	    		
	    		DbConnection dbCon = new DbConnection();
	    		Connection con = dbCon.getConnection();
	    		
				Statement st = null;

	    		ResultSet rs;
	    		UtenteBean utenteBean = new UtenteBean();
	    		try {
					st = con.createStatement();
	    			rs = st.executeQuery(query);

	    			while (rs.next()) {
	    				utenteBean.setNomeUtente(rs.getString("nome"));
	    				utenteBean.setCognomeUtente(rs.getString("cognome"));
	    				utenteBean.setLibriAcquistati(rs.getInt("libri_acquistati"));
	    			}
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}

	    		dbCon.closeConnection(con);
	    		
	    		return utenteBean;
	    	}
	    	public UtenteBean findUtentePremium() {
	    		String query = "SELECT nome, cognome, libri_acquistati, prezzo FROM utente join libro_utente l on  l.utente = utente.id_utente join libro on libro.id_libro = l.libro where libri_acquistati > 5 and prezzo >100";
	    		
	    		DbConnection dbCon = new DbConnection();
	    		Connection con = dbCon.getConnection();
	    		
				Statement st = null;

	    		ResultSet rs;
	    		UtenteBean utenteBean = new UtenteBean();
	    		try {
					st = con.createStatement();
	    			rs = st.executeQuery(query);

	    			while (rs.next()) {
	    				utenteBean.setNomeUtente(rs.getString("nome"));
	    				utenteBean.setCognomeUtente(rs.getString("cognome"));
	    				utenteBean.setLibriAcquistati(rs.getInt("libri_acquistati"));
	    			}
	    		} catch (SQLException e) {
	    			e.printStackTrace();
	    		}

	    		dbCon.closeConnection(con);
	    		
	    		return utenteBean;
	    		
	    	}
	    	
	    }
