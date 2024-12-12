package jdbc1;

//import java.beans.Statement;
import java.sql.*;


public class Main {
    public static void main(String[] args) {
        // String url = "jdbc:mysql://localhost:3306/k012";
        String url = "jdbc:mysql://LAPTOP-Q7EEPOJK:3306/demo_db";

        // String user = "root@localhost";
        String user = "root";
        String password = "123";
        Connection connection = null;
        Statement stmt = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            stmt = connection.createStatement();
            if (connection != null) {
                System.out.println("MySQL JDBC Driver successfully integrated!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query = "SELECT * FROM users";
        try {
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") + ",Name: " + rs.getString("name") + ",Email:" + rs.getString("email"));
        }//reached end of the result set
        
       // String insertQuery1 = "insert INTO users (name,email) VALUES ('high','bbbb@example.com')";
        String insertQuery = "INSERT INTO users (name, email) VALUES ('David', 'david@example.com')";
        stmt.executeUpdate(insertQuery);
        System.out.println("Updated TABLE");
        rs = stmt.executeQuery(query); // have to refetch 
        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") + ",Name: " + rs.getString("name") + ",Email:" + rs.getString("email"));
        }

        String deleteQuery = "delete from users where name = 'David'";
        stmt.executeUpdate(deleteQuery);
        rs = stmt.executeQuery(query); // have to refetch
        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") + ",Name: " + rs.getString("name") + ",Email:" + rs.getString("email"));
        }

        String query3 = "SELECT id, name, email FROM users WHERE email = 'bbbb@example.com'";
        rs = stmt.executeQuery(query3);
        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") + ",Name: " + rs.getString("name") + ",Email:" + rs.getString("email"));
        }

        System.out.println("446456");
        // rs = stmt.executeQuery(query);

        // String mail2 = rs.getString("email");
        // String name = rs.getString(2);
        // System.out.println(name+"\n"+mail2);
        rs = stmt.executeQuery(query);
        if (rs.next()) { // Ensure the cursor is pointing to a valid row
            String mail2 = rs.getString("email");
            String name = rs.getString("name"); // Use column name for clarity
            System.out.println(name + "\n" + mail2);
        }

        rs = stmt.executeQuery(query);


       // Product product = new Product();
       while (rs.next()) {
            
            System.out.println(
                    "ID: " + rs.getInt("id") + ",Name: " + rs.getString("name") + ",Email:" + rs.getString("email"));
        }

    } catch (SQLException e) {
    }
        
    }
}