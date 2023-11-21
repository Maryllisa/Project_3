package com.example.project_3.lneTwo.lineTwoBranchOne.line.TwoBranchOneTwo;

import com.example.project_3.lneTwo.coffeLine.secretLine.SecretLineChooseServlet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class LineTwoBranchOneTwoServletTest {
    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse resp;
    @Mock
    RequestDispatcher disp;
    @Mock
    HttpSession session;
    @Mock
    LineTwoBranchOneTwoServlet lineTwoBranchOneTwoServlet;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.lineTwoBranchOneTwoServlet = new LineTwoBranchOneTwoServlet();
    }
    @Test
    void doPostYesOne() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes1");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchOneTwoServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 70);
        verify(req).getRequestDispatcher("lineTwo/lineTwo-BranchTwo/lineTwo-BranchTwo-1.1.jsp");

        verify(disp).forward(req, resp);

    }
    @Test
    void doPostYesTwo() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes2");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchOneTwoServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 50);
        verify(req).getRequestDispatcher("lineTwo/lineOne-BranchOne/lineTwo-BranchOne-2.jsp");

        verify(disp).forward(req, resp);

    }
    @Test
    void doPostNo() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(session.getAttribute("countEnd")).thenReturn(8);
        when(req.getParameter("option")).thenReturn("no");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchOneTwoServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 100);
        verify(session).setAttribute("countEnd", 7);
        verify(req).getRequestDispatcher("lineTwo/lineOne-BranchOne/endTwo.jsp");
        verify(disp).forward(req, resp);

    }
}