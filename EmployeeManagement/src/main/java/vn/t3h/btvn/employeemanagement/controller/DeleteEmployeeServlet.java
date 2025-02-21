package vn.t3h.btvn.employeemanagement.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.btvn.employeemanagement.dao.impl.EmployeeDaoMysqlImpl;
import vn.t3h.btvn.employeemanagement.service.IEmployeeService;
import vn.t3h.btvn.employeemanagement.service.impl.EmployeeServiceImpl;
import java.io.IOException;

@WebServlet("/employee-delete")
public class DeleteEmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService;

    @Override
    public void init() throws ServletException {
        super.init();
        this.employeeService = new EmployeeServiceImpl(new EmployeeDaoMysqlImpl());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String employeeIdStr = req.getParameter("employeeId");
        if(employeeIdStr != null){
            int employeeId = Integer.parseInt(employeeIdStr);
            employeeService.deleteEmployee(employeeId);
        }
        resp.sendRedirect(req.getContextPath() + "/employee");
    }
}

