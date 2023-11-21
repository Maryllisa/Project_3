package com.example.project_3.lneTwo;

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

class LineTwoChooseServletTest {

    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse resp;
    @Mock
    RequestDispatcher disp;
    @Mock
    HttpSession session;
    @Mock
    LineTwoChooseServlet lineTwoChooseServlet;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.lineTwoChooseServlet = new LineTwoChooseServlet();
    }
    @Test
    void doPostYes() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoChooseServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 40);
        verify(req).getRequestDispatcher("lineTwo/lineTwo-BranchTwo/lineTwo-BranchTwo-1.jsp");
        verify(disp).forward(req, resp);

    }
    @Test
    void doPostNo() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("no");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoChooseServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 30);
        verify(req).getRequestDispatcher("lineTwo/lineOne-BranchOne/lineTwo-BranchOne-1.jsp");
        verify(disp).forward(req, resp);

    }
}