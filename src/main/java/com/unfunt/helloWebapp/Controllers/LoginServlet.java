package com.unfunt.helloWebapp.Controllers;

import com.unfunt.helloWebapp.Services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Vova on 23.06.2019.
 */
@WebServlet (name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/common/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        LoginService loginService = LoginService.getInstance();
        if (loginService.checkPassword(login, password)) {
            req.getSession().setAttribute("User", login);
            resp.sendRedirect(req.getContextPath() + "/hello");
        } else {
            req.getRequestDispatcher("/jsp/common/loginError.jsp").forward(req, resp);
        }
    }
}
