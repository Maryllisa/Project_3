package com.example.project_3.lneTwo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="lineTwoChoose", value = "/lineTwo-choose")
public class LineTwoChooseServlet extends HttpServlet {
    private int countEnd;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String strJSPPath = null;
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession(); 
        String name = (String) session.getAttribute("name");
        String option = req.getParameter("option");
        if (option.equals("yes")) {
            strJSPPath = "lineTwo/lineTwo-BranchTwo/lineTwo-BranchTwo-1.jsp";
            session.setAttribute("time",40);
        } else if (option.equals("no")) {
            strJSPPath = "lineTwo/lineOne-BranchOne/lineTwo-BranchOne-1.jsp";
            session.setAttribute("time",30);
        }
        session.setAttribute("name",name);
        RequestDispatcher dispatcher = req.getRequestDispatcher(strJSPPath); dispatcher.forward(req,resp);
    }

}
