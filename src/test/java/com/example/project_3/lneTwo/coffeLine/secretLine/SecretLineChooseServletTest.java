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

class SecretLineChooseServletTest {

    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse resp;
    @Mock
    RequestDispatcher disp;
    @Mock
    HttpSession session;
    @Mock
    SecretLineChooseServlet secretLineChooseServlet;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.secretLineChooseServlet = new SecretLineChooseServlet();
    }
    @Test
    void doPostYes() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes");
        when(req.getParameter("name")).thenReturn("Mary");
        when(session.getAttribute("countEnd")).thenReturn(8);
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        secretLineChooseServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 100);
        verify(session).setAttribute("countEnd", 7);
        verify(req).getRequestDispatcher("lineTwo/coffeLine/coffeLineThirdBranch(secret)/secretEndOne.jsp");
        verify(disp).forward(req, resp);

    }
    @Test
    void doPostNo() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(session.getAttribute("countEnd")).thenReturn(8);
        when(req.getParameter("option")).thenReturn("no");
        when(req.getParameter("name")).thenReturn("Mary");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        secretLineChooseServlet.doPost(req,resp);
        verify(session).getAttribute("name");
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 100);
        verify(session).setAttribute("countEnd", 7);
        verify(req).getRequestDispatcher("lineTwo/coffeLine/coffeLineThirdBranch(secret)/secretEndTwo.jsp");
        verify(disp).forward(req, resp);

    }
}