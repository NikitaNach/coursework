package ru.studwork.project.server;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> parameterNames = req.getParameterNames();
        resp.setContentType("text/html");
        String html = "<html><body><h1>Parameters:<br>";
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            String value = req.getParameter(name);
            html+=name+" = "+value+"<br>";
        }
        html+="</h1></body></html>";

        PrintWriter writer = resp.getWriter();
        writer.println(html);
        writer.close();
    }
}
