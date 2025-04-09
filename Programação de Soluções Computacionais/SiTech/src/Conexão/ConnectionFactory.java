package Conex�o;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final String usuario = "root";
    private final String senha = "root";
    private final String host = "localhost";
    private final String porta = "3306";
    private final String bd;

    public ConnectionFactory() {
        this.bd = "sitech";
    }

    public Connection obtemConexao() throws SQLException {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd
                    + "?useTimezone=true&serverTimezone=UTC",
                    usuario, senha);
            System.out.println("Conex�o efetuada com sucesso!!");
            return c;
        } catch (SQLException e) {
            System.out.println("Erro na conex�o com o banco de dados! ALI");
            return null;
        }

    }
}
