package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        request.setAttribute("username", username);
        String password = request.getParameter("password");
        request.setAttribute("password", password);
        String email = request.getParameter("email");
        request.setAttribute("email", email);
        // TODO: create a new user based off of the submitted information
        User newUser = new User(username, email, password);
        DaoFactory.getUsersDao().insert(newUser);
        // TODO: if a user was successfully created, send them to their profile
        response.sendRedirect("/login");
    }
}
