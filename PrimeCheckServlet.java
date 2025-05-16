//6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PrimeCheckServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("number"));
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        out.println("<html><body>");
        if (isPrime)
            out.println("<h2>" + num + " is a Prime Number</h2>");
        else
            out.println("<h2>" + num + " is Not a Prime Number</h2>");
        out.println("</body></html>");
    }
}
<!DOCTYPE html>
<html>
<head>
    <title>Prime Number Check</title>
</head>
<body>
    <h2>Check Prime Number</h2>
    <form action="PrimeCheckServlet" method="post">
        Enter a number: <input type="text" name="number">
        <input type="submit" value="Check">
    </form>
</body>
</html>
