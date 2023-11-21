package com.example.project_3.lneTwo.lineTwoBranchTwo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LineTwoBranchTwoTwoServlet", value = "/lineTwo-BranchTwo-2")
public class LineTwoBranchTwoTwoServlet extends HttpServlet {
    private int countEnd;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strJSPPath = null;
        req.setCharacterEncoding("UTF-8");
        String option = req.getParameter("option");
        HttpSession session = req.getSession();
        if (option.equals("yes")) {
            strJSPPath = "lineTwo/lineOne-BranchOne/lineTwo-BranchOne-2.jsp";
            session.setAttribute("time", 50);
        } else if (option.equals("no")) {
            strJSPPath = "lineTwo/lineOne-BranchOne/endTwo.jsp";
            session.setAttribute("time", 100);
            this.countEnd = (int) session.getAttribute("countEnd");
            session.setAttribute("countEnd", --this.countEnd);
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher(strJSPPath);
        dispatcher.forward(req,resp);
    }
}
