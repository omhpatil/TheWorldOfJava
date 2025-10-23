package JDBC;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            // 1️⃣ DriverManager — loads the JDBC driver and gets connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");

            System.out.println("✅ Connected to database");

            // 2️⃣ Statement — execute simple SQL query
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO students VALUES (1, 'Om', 85)");
            System.out.println("✅ Record inserted using Statement");

            // 3️⃣ PreparedStatement — query with placeholders
            PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");
            ps.setInt(1, 2);
            ps.setString(2, "Patil");
            ps.setInt(3, 90);
            ps.executeUpdate();
            System.out.println("✅ Record inserted using PreparedStatement");

            // 4️⃣ CallableStatement — call stored procedure
            // Suppose we created a stored procedure:
            // CREATE PROCEDURE getMarks(IN sid INT) SELECT * FROM students WHERE id = sid;
            CallableStatement cs = con.prepareCall("{call getMarks(?)}");
            cs.setInt(1, 1);
            ResultSet rs1 = cs.executeQuery();
            System.out.println("✅ Stored procedure called using CallableStatement");

            // 5️⃣ ResultSet — stores result of SQL query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("\n🎓 Student Table Data:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("marks"));
            }

            // 6️⃣ ResultSetMetaData — to get info about columns
            ResultSetMetaData meta = rs.getMetaData();
            System.out.println("\n🧾 Table Metadata:");
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.println(meta.getColumnName(i) + " - " + meta.getColumnTypeName(i));
            }

            // 7️⃣ Close everything
            rs.close();
            rs1.close();
            stmt.close();
            ps.close();
            cs.close();
            con.close();
            System.out.println("\n✅ All resources closed successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
