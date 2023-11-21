package com.example.project_3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "indexServlet", value = "/index")
public class IndexServlet extends HttpServlet {
    private int countEnd;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strJSPPath = null;
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        this.countEnd = 8;

        String option = req.getParameter("option");
        strJSPPath = "start.jsp";
        session.setAttribute("countEnd", this.countEnd);
        session.setAttribute("time", 10);
        session.setAttribute("name", name);
        RequestDispatcher dispatcher = req.getRequestDispatcher(strJSPPath);
        dispatcher.forward(req,resp);
    }
}
