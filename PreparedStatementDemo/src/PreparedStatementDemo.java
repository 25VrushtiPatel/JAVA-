import java.sql.*;

public class PreparedStatementDemo {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/databl";
        String username = "root";
        String password = "12345";
        int id = 103;
        String name = "Loy";

        String query = "insert into tab values (?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1, id);
        st.setString(2, name);

        int rs = st.executeUpdate();
        System.out.println(rs + " row/s affected");

        st.close();
        con.close();
    }
}