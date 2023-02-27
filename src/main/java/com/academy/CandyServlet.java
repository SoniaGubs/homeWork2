package com.academy;

import com.academy.service.CandyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/candies")
public class CandyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var candyService = new CandyService();
        var candies = candyService.getCandies();

        req.setAttribute("candies", candies);

        req.getRequestDispatcher("/WEB-INF/jsp/candyList.jsp").forward(req, resp);
    }
}
