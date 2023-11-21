package com.example.project_3.lneTwo.lineTwoBranchOne.line.TwoBranchOneTwo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.IOException;

@WebServlet(name = "lineTwoBranchOneServlet", value = "/lineTwo-BranchTwo-1")
public class LineTwoBranchOneTwoServlet extends HttpServlet {
    private int countEnd;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strJSPPath = null;
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");
        
        
        String option = req.getParameter("option");
        if (option.equals("yes1")) {
            strJSPPath = "lineTwo/lineTwo-BranchTwo/lineTwo-BranchTwo-1.1.jsp";
            session.setAttribute("time", 70);
        }
        else if (option.equals("yes2")) {
            strJSPPath = "lineTwo/lineOne-BranchOne/lineTwo-BranchOne-2.jsp";
            session.setAttribute("time", 50);
        }
        else if (option.equals("no")) {
            strJSPPath = "lineTwo/lineOne-BranchOne/endTwo.jsp";
            session.setAttribute("time", 100);
            this.countEnd = (int) session.getAttribute("countEnd");
            session.setAttribute("countEnd", --this.countEnd);
        }
        session.setAttribute("test", true);
        session.setAttribute("name", name);
        RequestDispatcher dispatcher = req.getRequestDispatcher(strJSPPath);
        dispatcher.forward(req,resp);
    }
}

