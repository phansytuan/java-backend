package vn.t3h.employeemanager.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

//tạo ra 1 class kế thừa từ class servlet
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        String uri = req.getRequestURI();
        String param = req.getParameter("name");
        Map<String,String[]> params = req.getParameterMap();
        HttpSession session = req.getSession();
        session.setAttribute("user","Tuanphans");
        String sessionId = session.getId();

        // config kiểu dữ liệu trả về trong response là HTML/Text
        resp.setContentType("text/html");

        // ghi dữ liệu vào response
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Hello Servlet </h1>");
        out.println("<h2> method: "+method+"</h2>");
        out.println("<h2> url: "+uri+"</h2>");
        out.println("<h2> param: "+param+"</h2>");
        out.println("<h2> session id: "+sessionId+"</h2>");

        out.println("</body></html>");
    }
}
