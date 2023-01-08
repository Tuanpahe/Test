/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s1,s2;
        s1= request.getParameter("h1").trim();
        s2= request.getParameter("h1").trim();
        int a,b,c;
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        c=a+b;
        

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s1,s2; int a,b,c;
        s1 = request.getParameter("n1").trim();
        s2 = request.getParameter("n2").trim();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        c = a+b;
        request.setAttribute("m1", a);
        request.setAttribute("m2", b);
        request.setAttribute("m3", c);
        request.getRequestDispatcher("add.jsp").forward(request, response);

    }
}