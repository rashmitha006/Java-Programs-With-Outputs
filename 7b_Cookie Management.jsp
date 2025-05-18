//7b. Construct a Cookie Management program using JSP to get the fields Name, Domain and Max Expiry Age ( in sec) and press the button Add Cookie for displaying the set cookie information. Then 
 // it has to go to show the active cookie list when you press the link go to the active cookie list

<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="java.io.*" %>
<html>
<head>
    <title>Add Cookie</title>
</head>
<body>
    <h2>Cookie Management</h2>
    <form method="post">
        Name: <input type="text" name="cname" required><br><br>
        Domain: <input type="text" name="cdomain" required><br><br>
        Max Age (in seconds): <input type="number" name="cage" required><br><br>
        <input type="submit" value="Add Cookie">
    </form>

<%
    String name = request.getParameter("cname");
    String domain = request.getParameter("cdomain");
    String ageStr = request.getParameter("cage");

    if(name != null && domain != null && ageStr != null) {
        int age = Integer.parseInt(ageStr);
        Cookie cookie = new Cookie(name, domain);
        cookie.setMaxAge(age);
        response.addCookie(cookie);
%>
    <h3>Cookie Set Successfully!</h3>
    <p><strong>Name:</strong> <%= name %></p>
    <p><strong>Domain (as Value):</strong> <%= domain %></p>
    <p><strong>Max Age:</strong> <%= age %> seconds</p>
<%
    }
%>
    <br>
    <a href="showCookies.jsp">Go to the active cookie list</a>
</body>
</html>
<%@ page import="javax.servlet.http.Cookie" %>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>
    <h2>Active Cookie List</h2>
    <%
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
    %>
        <table border="1">
            <tr>
                <th>Cookie Name</th>
                <th>Value</th>
            </tr>
            <%
                for (Cookie c : cookies) {
            %>
            <tr>
                <td><%= c.getName() %></td>
                <td><%= c.getValue() %></td>
            </tr>
            <%
                }
            %>
        </table>
    <%
        } else {
    %>
        <p>No active cookies found.</p>
    <%
        }
    %>
    <br><br>
    <a href="addCookie.jsp">Back to Add Cookie</a>
</body>
</html>

//setCookie.jsp

         <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>

<head>
<title>Setting Cookie</title>
<style>
.info-box {
margin: 20px;
padding: 15px;
border: 1px solid #ddd;
border-radius: 5px;
background-color: #f9f9f9;
}
.success {
color: green;
}
</style>
</head>
<body>
<div class="info-box">
<%
// Get parameters
String name = request.getParameter("cookieName");
String domain = request.getParameter("domain");
String maxAge = request.getParameter("maxAge");
if (name != null && domain != null && maxAge != null) {
// Get or create cookie list
@SuppressWarnings("unchecked")
List<Map<String, String>> cookieList = (List<Map<String, String>>)
session.getAttribute("cookieList");
if (cookieList == null) {
cookieList = new ArrayList<>();
}
// Get current timestamp
long currentTimeSeconds = System.currentTimeMillis() / 1000;
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String timestamp = sdf.format(new Date());
// Create new cookie entry
Map<String, String> cookieEntry = new HashMap<>();
cookieEntry.put("name", name);
cookieEntry.put("domain", domain);
cookieEntry.put("maxAge", maxAge);

cookieEntry.put("setTime", String.valueOf(currentTimeSeconds));
// Create actual cookie
Cookie cookie = new Cookie(name, "value");
cookie.setMaxAge(Integer.parseInt(maxAge));
cookie.setDomain(domain);
response.addCookie(cookie);
// Add to list
cookieList.add(cookieEntry);
// Save updated list to session
session.setAttribute("cookieList", cookieList);
// Display cookie set information
%>
<h3 class="success">Cookie Set Successfully</h3>
<p><strong>Cookie Name:</strong> <%= name %></p>
<p><strong>Domain:</strong> <%= domain %></p>
<p><strong>Max Age:</strong> <%= maxAge %> seconds</p>
<p><strong>Set Time:</strong> <%= timestamp %></p>
<%
}
%>
<p><a href="index.jsp">Return to Cookie List</a></p>
</div>
</body>
</html>
