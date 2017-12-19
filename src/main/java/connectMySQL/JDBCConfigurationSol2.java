package connectMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfigurationSol2 {
	
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost/BDD?user=admin&password=admin";
    static Connection connection = null;
    public static Connection getConnection(){
        try {
			Class.forName(DB_DRIVER);
            if(connection == null) {
                connection = DriverManager.getConnection(DB_CONNECTION);
            }
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
            e1.printStackTrace();
        }
        return connection;
    }
    
}
