package vn.t3h.employeemanager;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

// đây là annotation ở trên các servlet version mới
// nó giúp thay thế cả 2 bước khai báo servlet ở bên web.xml
@WebServlet(name = "helloServlet", value = "/hello-servlet")

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        System.out.println("HelloServlet init servlet");
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    // sử dụng để update dữ liệu trên server
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        super.doPost(request, response);
    }

    public void destroy() {
        System.out.println("HelloServlet destroy");
    }
}