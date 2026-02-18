package com.sms;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("user") && password.equals("password")) {
            response.sendRedirect("student.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid Username or Password!");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.forward(request, response);
        }
    }
}
