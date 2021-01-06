package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConnection() throws SQLException {

		Connection conexao = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");

			conexao = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SCHOOLTURA", "root");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conexao;
	}

	
}