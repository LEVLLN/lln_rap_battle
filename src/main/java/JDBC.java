import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/battle_rap";
    static final String USER = "Lev";
    static final String PASS = "newzaliv2010";
    public JDBC()  {



    }

    Connection conn;
    Statement stmt = null;
    Connection doConnect() throws SQLException {
        try {
            Class.forName(JDBC_DRIVER).newInstance();
            System.out.println("Connected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return conn=  DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
