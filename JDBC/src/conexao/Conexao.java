package conexao;

import java.sql.Connection;

public class Conexao {
	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
	}
}
