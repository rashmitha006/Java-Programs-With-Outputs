//9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary into the table Emp of the database Employee by getting the fields through keyboard and Generate the report as follows
//DBC connection
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";         // Your MySQL username
        String password = "password"; // Your MySQL password
        return DriverManager.getConnection(url, user, password);
    }
}
//EmployeeInsert.java
import java.sql.*;
import java.util.Scanner;

public class EmployeeInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter Employee No:");
                int empno = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.println("Enter Employee Name:");
                String name = sc.nextLine();

                System.out.println("Enter Basic Salary:");
                int salary = sc.nextInt();

                ps.setInt(1, empno);
                ps.setString(2, name);
                ps.setInt(3, salary);

                ps.executeUpdate();
                System.out.println("Employee added successfully.\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//SalaryReport.java
import java.sql.*;

public class SalaryReport {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

            System.out.printf("%-10s %-20s %-10s\n", "Emp No", "Emp Name", "Basic Salary");
            System.out.println("-------------------------------------------------");

            while (rs.next()) {
                int empno = rs.getInt("Emp_NO");
                String name = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");

                System.out.printf("%-10d %-20s %-10d\n", empno, name, salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database Employee by getting the name starting with ‘S’ through keyboard and Generate the report as follows
//sql
CREATE DATABASE IF NOT EXISTS Employee;

USE Employee;

CREATE TABLE IF NOT EXISTS Emp (
    Emp_NO INT PRIMARY KEY,
    Emp_Name VARCHAR(50) NOT NULL,
    Basicsalary INT
);
//DBConnection.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";         // Your MySQL username
        String password = "password"; // Your MySQL password
        return DriverManager.getConnection(url, user, password);
    }
}
//DeleteEmployees.java
import java.sql.*;
import java.util.Scanner;

public class DeleteEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting letter of employee names to delete (e.g., S): ");
        String startLetter = sc.nextLine();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, startLetter + "%");
            int deleted = ps.executeUpdate();

            System.out.println(deleted + " employee(s) deleted whose names start with '" + startLetter + "'.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//SalaryReport.java
import java.sql.*;

public class SalaryReport {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

            System.out.printf("%-10s %-20s %-10s\n", "Emp No", "Emp Name", "Basic Salary");
            System.out.println("------------------------------------------------");

            while (rs.next()) {
                int empno = rs.getInt("Emp_NO");
                String name = rs.getString("Emp_Name");
                int salary = rs.getInt("Basicsalary");

                System.out.printf("%-10d %-20s %-10d\n", empno, name, salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
