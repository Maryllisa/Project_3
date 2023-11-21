package com.example.project_3.lneTwo.coffeLine.secretLine;

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

class CoffeFirstLineServletTest {
    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse resp;
    @Mock
    RequestDispatcher disp;
    @Mock
    HttpSession session;
    private CoffeFirstLineServlet coffeFirstLineServlet;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.coffeFirstLineServlet = new CoffeFirstLineServlet();
    }

    @Test
    void doPostYes() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes");
        when(req.getParameter("name")).thenReturn("Mary");
        when(session.getAttribute("countEnd")).thenReturn(8);
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        coffeFirstLineServlet.doPost(req,resp);
        verify(req).getParameter("option");
        verify(session).getAttribute("name");
        verify(session).setAttribute("time", 100);
        verify(session).setAttribute("countEnd", 7);
        verify(req).getRequestDispatcher("lineTwo/coffeLine/coffeLineFirstBranch/endThird.jsp");
        verify(disp).forward(req, resp);

    }
    @Test
    void doPostNo() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("no");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        coffeFirstLineServlet.doPost(req,resp);
        verify(req).getParameter("option");
        verify(session).getAttribute("name");
        verify(session).setAttribute("time", 90);
        verify(req).getRequestDispatcher("lineTwo/coffeLine/coffeSecondLine.jsp");
        verify(disp).forward(req, resp);

    }
}