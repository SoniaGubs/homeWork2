package com.academy;

import com.academy.model.entity.User;
import com.academy.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User(login, password);
        UserService userService = new UserService();

        if (userService.checkCredentials(login, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            req.getRequestDispatcher("/WEB-INF/jsp/helloUser.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/jsp/accessDenied.jsp").forward(req, resp);
        }
    }
}
