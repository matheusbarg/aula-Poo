package AtividadeAvaliativa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionFactory {
	Connection conn = new ConnectionFactory().getConnection();
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Ana1312");
			System.out.println("Conectouuuuu!!!");
		} catch (Exception e) {
			System.out.println("Deu ruim: " + e.getMessage());
		}
		return conn;
	}
	
	
	
	
}
