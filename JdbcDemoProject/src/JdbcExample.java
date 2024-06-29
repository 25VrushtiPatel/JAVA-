//JDBC - Steps to follow

/* 1. import the package ---->phone ----->SQL package ---->completed
* 2. load or Register the driver ----> sim card ------>"com.mysql.cj.jdbc.Driver" --------->forName();
* 3. Establish the connection ----> call the particular person ----->static method - getConnection(parameters);
* 4. create the statement ---> prepare the question -----> createStatement();//Three types - statement,prepared statement & callable statement
* 5. Execute the query -----> ask the question ------> executeQuery();
* 6. process the result ------> person response
* 7. close the connection -----> hang up the call //close()
* 
* */

import java.sql.*;
public class JdbcExample {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/######";
        String username = "root";
        String password = "";
        String query = "select empName from employee where empId = 2;";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);

        rs.next();

        String name = rs.getString("empName");
        System.out.println(name);

        st.close();
        con.close();
    }
}