/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 721292
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String logmes = request.getParameter("message");
        request.setAttribute("message", logmes);
        getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("usern");
        String pass = request.getParameter("passw");
        
        UserService us = new UserService(user,pass);
        request.setAttribute("us", us);
        
        if(user == null || pass == null || user.trim().isEmpty() || pass.trim().isEmpty())
        {
            request.setAttribute("message", "Username or password is empty.");
            getServletContext().getRequestDispatcher("/login.jsp").forward(request,response);
            
        }
        else if(!us.login(user, pass))
        {
            request.setAttribute("message", "Wrong user name or password.");
            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
            
        }
        getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
       
    }

}
