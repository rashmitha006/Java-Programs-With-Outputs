//8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary into the table Emp of the database Employee by getting the fields through keyboard and Generate the report as follows

//sql
  CREATE DATABASE Employee;

USE Employee;

CREATE TABLE Emp (
    Emp_NO INTEGER PRIMARY KEY,
    Emp_Name TEXT NOT NULL,
    Basicsalary INTEGER
);

//jsp
<%@ page language="java" %>
<html>
<head><title>Employee Entry</title></head>
<body>
<h2>Enter Employee Details</h2>
<form action="insertEmp.jsp" method="post">
    Emp No: <input type="number" name="empno" required><br>
    Name: <input type="text" name="empname" required><br>
    Basic Salary: <input type="number" name="salary" required><br>
    <input type="submit" value="Add Employee">
</form>
<br>
<a href="report.jsp">View Salary Report</a>
</body>
</html>
//index
  <%@ page language="java" %>
<html>
<head><title>Employee Entry</title></head>
<body>
<h2>Enter Employee Details</h2>
<form action="insertEmp.jsp" method="post">
    Emp No: <input type="number" name="empno" required><br>
    Name: <input type="text" name="empname" required><br>
    Basic Salary: <input type="number" name="salary" required><br>
    <input type="submit" value="Add Employee">
</form>
<br>
<a href="report.jsp">View Salary Report</a>
</body>
</html>
//jdbc insertion
  <%@ page import="java.sql.*" %>
<%@ page import="com.example.DBConnection" %>

<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String name = request.getParameter("empname");
    int salary = Integer.parseInt(request.getParameter("salary"));

    try (Connection conn = DBConnection.getConnection()) {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
        ps.setInt(1, empno);
        ps.setString(2, name);
        ps.setInt(3, salary);
        int result = ps.executeUpdate();

        if (result > 0) {
            out.println("<p>Employee Added Successfully!</p>");
        } else {
            out.println("<p>Error adding employee.</p>");
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
<a href="index.jsp">Go Back</a>
//report.jsp
      <%@ page import="java.sql.*" %>
<%@ page import="com.example.DBConnection" %>

<html>
<head><title>Salary Report</title></head>
<body>
<h2>Salary Report</h2>
<table border="1">
    <tr>
        <th>Emp No</th>
        <th>Name</th>
        <th>Basic Salary</th>
    </tr>

<%
    try (Connection conn = DBConnection.getConnection()) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("Emp_NO") %></td>
        <td><%= rs.getString("Emp_Name") %></td>
        <td><%= rs.getInt("Basicsalary") %></td>
    </tr>
<%
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
</table>
</body>
</html>
//DBConnection.java
  package com.example;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        // Load driver (depends on your DB, here's for MySQL)
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";     // your username
        String pass = "password"; // your password
        return DriverManager.getConnection(url, user, pass);
    }
}
//8d. Develop a JDBC project using JSP to update the fields empno, empname and basicsalary into the table Emp of the database Employee by getting the fields through keyboard.
//updateform
<%@ page language="java" %>
<html>
<head><title>Update Employee</title></head>
<body>
<h2>Update Employee Details</h2>
<form action="updateEmp.jsp" method="post">
    Emp No (to update): <input type="number" name="empno" required><br>
    New Name: <input type="text" name="empname" required><br>
    New Basic Salary: <input type="number" name="salary" required><br>
    <input type="submit" value="Update Employee">
</form>
<br>
<a href="report.jsp">View Salary Report</a>
</body>
</html>
//updateEmp.jsp
  <%@ page import="java.sql.*" %>
<%@ page import="com.example.DBConnection" %>

<%
    int empno = Integer.parseInt(request.getParameter("empno"));
    String name = request.getParameter("empname");
    int salary = Integer.parseInt(request.getParameter("salary"));

    try (Connection conn = DBConnection.getConnection()) {
        PreparedStatement ps = conn.prepareStatement(
            "UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?"
        );
        ps.setString(1, name);
        ps.setInt(2, salary);
        ps.setInt(3, empno);
        int rows = ps.executeUpdate();

        if (rows > 0) {
            out.println("<p>Employee updated successfully.</p>");
        } else {
            out.println("<p>Employee with Emp_NO " + empno + " not found.</p>");
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
<a href="updateForm.jsp">Go Back</a>
//report.jsp
    <%@ page import="java.sql.*" %>
<%@ page import="com.example.DBConnection" %>

<html>
<head><title>Salary Report</title></head>
<body>
<h2>Salary Report</h2>
<table border="1">
    <tr>
        <th>Emp No</th>
        <th>Name</th>
        <th>Basic Salary</th>
    </tr>
<%
    try (Connection conn = DBConnection.getConnection()) {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("Emp_NO") %></td>
        <td><%= rs.getString("Emp_Name") %></td>
        <td><%= rs.getInt("Basicsalary") %></td>
    </tr>
<%
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>
</table>
</body>
</html>
//DBConnection.java
  package com.example;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root"; // your DB username
        String pass = "password"; // your DB password
        return DriverManager.getConnection(url, user, pass);
    }
}
