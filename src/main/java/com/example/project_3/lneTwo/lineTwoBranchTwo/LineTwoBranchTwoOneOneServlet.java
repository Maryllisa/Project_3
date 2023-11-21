package com.example.project_3.lneTwo.lineTwoBranchTwo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LineTwoBranchTwoOneOneServlet", value = "/lineTwoBranchTwoOneOne")
public class LineTwoBranchTwoOneOneServlet extends HttpServlet {
    private int countEnd;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strJSPPath = null;
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession(); String name = (String) session.getAttribute("name");
        
        
        String option = req.getParameter("option");
        if (option.equals("yes1")) {
            strJSPPath = "lineTwo/coffeLine/coffeFirstLine.jsp";
            session.setAttribute("time", 80);
        }
        else if (option.equals("yes2")) {
            strJSPPath ="lineTwo/coffeLine/coffeLineThirdBranch(secret)/SecretLineChoose.jsp";
            session.setAttribute("time", 80);
        }
        else if (option.equals("no")) {
            boolean check = (boolean) session.getAttribute("test");
            if (check) {
                strJSPPath = "lineTwo/lineOne-BranchOne/endTwo.jsp";
                session.setAttribute("time", 100);
                this.countEnd = (int) session.getAttribute("countEnd");
                session.setAttribute("countEnd", --this.countEnd);
            }
            else {
                strJSPPath = "lineTwo/coffeLine/coffeLineThirdBranch(secret)/SecretLineChoose.jsp";
                session.setAttribute("time", 80);
            }

        }
        RequestDispatcher dispatcher = req.getRequestDispatcher(strJSPPath); dispatcher.forward(req,resp);
    }
}
