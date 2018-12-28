import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

    private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/dao";

    private static final String USER = "uxfac";

    private static final String PW = "uxfac";


    @Test

    public void testConnection() throws Exception {

        Class.forName(DRIVER);

        try (Connection con = DriverManager.getConnection(URL, USER, PW)) {

            System.out.println(con);


        } catch (Exception e) {

            System.err.println(e);

        }

    }

}


