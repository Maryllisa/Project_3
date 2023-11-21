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

class LineTwoBranchTwoTwoServletTest {

    @Mock
    HttpServletRequest req;
    @Mock
    HttpServletResponse resp;
    @Mock
    RequestDispatcher disp;
    @Mock
    HttpSession session;
    @Mock
    LineTwoBranchTwoTwoServlet lineTwoBranchTwoTwoServlet;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.lineTwoBranchTwoTwoServlet = new LineTwoBranchTwoTwoServlet();
    }
    @Test
    void doPostYes() throws ServletException, IOException {
        when(req.getSession()).thenReturn(session);
        when(req.getParameter("option")).thenReturn("yes");
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchTwoTwoServlet.doPost(req,resp);
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
        when(req.getRequestDispatcher(anyString())).thenReturn(disp);
        lineTwoBranchTwoTwoServlet.doPost(req,resp);
        verify(req).getParameter("option");
        verify(session).setAttribute("time", 100);
        verify(session).setAttribute("countEnd", 7);
        verify(req).getRequestDispatcher("lineTwo/lineOne-BranchOne/endTwo.jsp");
        verify(disp).forward(req, resp);

    }
}