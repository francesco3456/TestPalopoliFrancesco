package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.bean.LibroBean;
import utils.DbConnection;

public class Librodao {
	
	DbConnection dbCon = new DbConnection();

	public List<LibroBean> findAll() {
		String query = "SELECT * FROM libro;";
		Connection con = dbCon.getConnection();

		Statement st = null;
		List<LibroBean> libri = new ArrayList<>();
		try {
			st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();

				libroBean.setIdLibro(rs.getLong("id_libro"));
				libroBean.setTitoloLibro(rs.getString("titolo"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setEditoreLibro(rs.getString("editore"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setDataCreazioneLibro(rs.getTimestamp("data_creazione").toLocalDateTime());
				libroBean.setDataModificaLibro(rs.getTimestamp("data_modifica").toLocalDateTime());
				libroBean.setFlgCancellatoLibro(rs.getBoolean("flg_cancellato"));
				libroBean.setDataPubblicazioneLibro(
						rs.getTimestamp("data_pubblicazione").toLocalDateTime().toLocalDate());

				libri.add(libroBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbCon.closeConnection(con);

		return libri;
	}

	public LibroBean findById(Long id) {
		String query = "SELECT * FROM libro WHERE id_libro=?";
		Connection con = dbCon.getConnection();


		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);
			ps.setLong(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ResultSet rs;
		LibroBean libroBean = new LibroBean();
		try {
			rs = ps.executeQuery();

			while (rs.next()) {

				libroBean.setIdLibro(rs.getLong("id_libro"));
				libroBean.setTitoloLibro(rs.getString("titolo"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setEditoreLibro(rs.getString("editore"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setDataCreazioneLibro(rs.getTimestamp("data_creazione").toLocalDateTime());
				libroBean.setDataModificaLibro(rs.getTimestamp("data_modifica").toLocalDateTime());
				libroBean.setFlgCancellatoLibro(rs.getBoolean("flg_cancellato"));
				libroBean.setDataPubblicazioneLibro(
						rs.getTimestamp("data_pubblicazione").toLocalDateTime().toLocalDate());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbCon.closeConnection(con);
		
		return libroBean;
	}

	public LibroBean insert(LibroBean libroBean) {
		String query = "INSERT INTO libro (titolo, autore, editore, prezzo) VALUES (?, ?, ?, ?);";
		Connection con = dbCon.getConnection();


		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, libroBean.getTitoloLibro());
			ps.setString(2, libroBean.getAutoreLibro());
			ps.setString(3, libroBean.getEditoreLibro());
			ps.setDouble(4, libroBean.getPrezzoLibro());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		int insertOutput = 0;
		try {
			insertOutput = ps.executeUpdate();
			if (insertOutput == 1) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					Long idNuovoLibro = rs.getLong(1);
					return findById(idNuovoLibro);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbCon.closeConnection(con);

		return new LibroBean();
	}

	public int update(LibroBean libroBean) {
		String query = "UPDATE libro SET nome=? WHERE id_libro=?";
		Connection con = dbCon.getConnection();


		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(query);

			ps.setString(1, libroBean.getTitoloLibro());
			ps.setString(2, libroBean.getAutoreLibro());
			ps.setString(3, libroBean.getEditoreLibro());
			ps.setDouble(4, libroBean.getPrezzoLibro());
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

	public int deleteById(Long id) {
		String query = "DELETE FROM ruolo WHERE id_libro=?";
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

	public List<LibroBean> findBooksByAuthor(String autoreLibro) {
		String query = "SELECT * FROM libro where autore = ? order by data_pubblicazione desc";
		Connection con = dbCon.getConnection();


		PreparedStatement ps = null;
		List<LibroBean> listaLibri = new ArrayList<>();

		try {
			ps = con.prepareStatement(query);
			ps.setString(1, autoreLibro);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				LibroBean libroBean = new LibroBean();
				libroBean.setTitoloLibro(rs.getString("titolo"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setEditoreLibro(rs.getString("editore"));
				libroBean.setDataPubblicazioneLibro(rs.getTimestamp("data_pubblicazione").toLocalDateTime().toLocalDate());
				libroBean.setDisponibilitaLibro(rs.getInt("disponibilità"));
				libroBean.setGenereLibro(rs.getString("genere"));

				listaLibri.add(libroBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbCon.closeConnection(con);
		}

		return listaLibri;
	}

	public List<LibroBean> findByAvailability(String titoloLibro) {
		String query = "SELECT titolo, autore, prezzo, disponibilità, genere FROM libro where titolo =?";
		Connection con = dbCon.getConnection();


		PreparedStatement ps = null;
		List<LibroBean> listaLibri = new ArrayList<>();

		try {
			ps = con.prepareStatement(query);
			ps.setString(1, titoloLibro);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ResultSet rs;
		LibroBean libroBean = new LibroBean();
		try {
			rs = ps.executeQuery();

			while (rs.next()) {
				libroBean.setTitoloLibro(rs.getString("titolo"));
				libroBean.setAutoreLibro(rs.getString("autore"));
				libroBean.setPrezzoLibro(rs.getDouble("prezzo"));
				libroBean.setDisponibilitaLibro(rs.getInt("disponibilità"));
				libroBean.setGenereLibro(rs.getString("genere"));
				
				listaLibri.add(libroBean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		dbCon.closeConnection(con);

		return listaLibri;
	}
}
