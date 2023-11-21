package com.example.project_3.lneTwo.lineTwoBranchTwo;

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

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class LineTwoBranchTwoOneOneServletTest {

    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse resp;
    @Mock
    RequestDispatcher disp;
    @Mock
    HttpSession session;
    @Mock
    LineTwoBranchTwoOneOneServlet lineTwoBranchTwoOneOneServlet;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.lineTwoBranchTwoOneOneServlet = new LineTwoBranchTwoOneOneServlet();
    }
    @Test
    void doPostYesOne() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes1");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchTwoOneOneServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 80);
        verify(req).getRequestDispatcher("lineTwo/coffeLine/coffeFirstLine.jsp");

        verify(disp).forward(req, resp);

    }
    @Test
    void doPostYesTwo() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes2");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchTwoOneOneServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 80);
        verify(req).getRequestDispatcher("lineTwo/coffeLine/coffeLineThirdBranch(secret)/SecretLineChoose.jsp");

        verify(disp).forward(req, resp);

    }

    @Test
    void doPostNoOne() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(session.getAttribute("check")).thenReturn(true);
        when(session.getAttribute("countEnd")).thenReturn(8);
        when(req.getParameter("option")).thenReturn("no");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        when(session.getAttribute("test")).thenReturn(true);
        lineTwoBranchTwoOneOneServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 100);
        verify(session).setAttribute("countEnd", 7);
        verify(req).getRequestDispatcher("lineTwo/lineOne-BranchOne/endTwo.jsp");
        verify(disp).forward(req, resp);

    }
    @Test
    void doPostNoOTwo() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(session.getAttribute("test")).thenReturn(false);
        when(req.getParameter("option")).thenReturn("no");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchTwoOneOneServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 80);
        verify(req).getRequestDispatcher("lineTwo/coffeLine/coffeLineThirdBranch(secret)/SecretLineChoose.jsp");
        verify(disp).forward(req, resp);

    }
}