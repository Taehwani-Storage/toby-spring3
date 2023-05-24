package tobyspring3.db;

import java.sql.*;

public class ConnectChecker {
    public void check() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test-db1",
                "root", "12345678");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SHOW DATABASES");
        rs = st.getResultSet();
        while (rs.next()) {
            String str = rs.getString(1);
            System.out.println(str);
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectChecker cc = new ConnectChecker();
        cc.check();
    }
}
