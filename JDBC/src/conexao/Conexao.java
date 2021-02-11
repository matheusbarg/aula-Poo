package AtvidadeAvaliativa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexao {
	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		
		String comando = "CREATE TABLE IF NOT EXISTS CLIENTE("
		+"id serial not null,"+
		"nome Varchar(45) not null,"+
		"email Varchar(60) not null);";
		
		try {
		Statement statement = conn.createStatement();
		statement.execute(comando);
		
		String update = "UPDATE CLIENTE SET nome='Matheus' where id=5";
		statement.execute(update);
		update = "UPDATE CLIENTE SET nome='Jose' where id=4";
		statement.execute(update);
		String delete = "DELETE FROM CLIENTE where nome ='Carlos'";
		statement.execute(delete);
		
		String select = "SELECT *FROM CLIENTE";
		ResultSet resultSet=statement.executeQuery(select);
		
		while(resultSet.next()) {
			System.out.println("id: "+resultSet.getInt("id"));
			System.out.println("Nome: "+resultSet.getString("nome"));
			System.out.println("Email: "+resultSet.getString("email"));
		}
		
		
		
	
		} catch (SQLException e ) {
			System.out.println("Deu ruim:"+e.getMessage());
			e.printStackTrace();
			
		}
		
		
		
	}
	
}
