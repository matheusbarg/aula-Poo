package Banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFabrica {
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Ana1312");
			System.out.println("Conectouuuuu!!!");
		} catch (Exception e) {
			System.out.println("Deu ruim: " + e.getMessage());
		}
		return conn;
	}

}
