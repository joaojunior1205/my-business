package com.example.mybusiness;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String title;

    public void init() {
        message = "Mensagem a ser passada do servlet para jsp";
        title = "JSP";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Chamar novo JSP (PAGE 2)
        RequestDispatcher page = request.getRequestDispatcher("/pag2.jsp");
        request.setAttribute("message", message);
        request.setAttribute("title", title);
        page.forward(request, response);
    }

    public void destroy() {
    }
}