package com.example.project_3.lneTwo.coffeLine.secretLine;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "secretLineChoose", value = "/secret-line-choose")
public class SecretLineChooseServlet extends HttpServlet {
    private int countEnd;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strJSPPath = null;
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");
        
        
        String option = req.getParameter("option");
        if (option.equals("yes")) {
            strJSPPath = "lineTwo/coffeLine/coffeLineThirdBranch(secret)/secretEndOne.jsp";
            session.setAttribute("time", 100);
            this.countEnd = (int) session.getAttribute("countEnd");
            session.setAttribute("countEnd", --this.countEnd);
        }
        else if (option.equals("no")) {
            strJSPPath = "lineTwo/coffeLine/coffeLineThirdBranch(secret)/secretEndTwo.jsp";
            session.setAttribute("time", 100);
            this.countEnd = (int) session.getAttribute("countEnd");
            session.setAttribute("countEnd", --this.countEnd);

        }
        session.setAttribute("name", name);
        RequestDispatcher dispatcher = req.getRequestDispatcher(strJSPPath); 
        dispatcher.forward(req,resp);
    }
}
