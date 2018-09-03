package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Data.Person;

public class PersonDAO {
	public int insertPersonDB(Person user) {
		int insertedRows = 0;
		Connection con = null;
		PreparedStatement userInsert = null;
		try {
			con = DatabaseConnection.createConnection();
			con.setAutoCommit(false);
			String sql = "INSERT INTO users (user_id, username, name, surname, gender, pass, email, telephone, city, country) VALUES(?,?,?,?,?,?,?,?,?,?)";
			userInsert = con.prepareStatement(sql);
			userInsert.setInt(1, user.getId());
			userInsert.setString(2, user.getUsername());
			userInsert.setString(3, user.getName());
			userInsert.setString(4, user.getSurname());
			userInsert.setBoolean(5, user.getSex());
			userInsert.setString(6, user.getPassword());
			userInsert.setString(7, user.getEmail());
			userInsert.setString(6, user.getTelephone());
			userInsert.setString(6, user.getCity());
			userInsert.setString(6, user.getCountry());
			insertedRows = userInsert.executeUpdate();
			con.commit();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			Utility.close(con);
			Utility.close(userInsert);
		}
		return insertedRows;
	}
}
