import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/######";
        String username = "root";
        String password = "";
        String query = "select * from employee";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String table = "";
            table = rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getInt(4);
            System.out.println(table);
        }

        st.close();
        con.close();
    }
}