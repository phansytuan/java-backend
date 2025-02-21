package vn.t3h.employeemanager.security;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.employeemanager.dao.RoleDao;
import vn.t3h.employeemanager.dao.impl.RoleDaoImpl;
import vn.t3h.employeemanager.model.RoleModel;
import vn.t3h.employeemanager.model.UserModel;
import vn.t3h.employeemanager.service.RoleService;
import vn.t3h.employeemanager.service.impl.RoleServiceImpl;
import vn.t3h.employeemanager.utils.Constants;
import java.io.IOException;

/*
    WebFilter: đánh dấu class này là 1 filter của servlet
    /* : regex để bắt tat cả các request đều phải đi qua filter này trước khi vào được đến Servlet
*/
@WebFilter("/*")
public class AuthenticationFilter implements Filter {

    private RoleService roleService;
    public AuthenticationFilter(){
        // invert of control (IOC)
        RoleDao roleDao = new RoleDaoImpl();
        this.roleService = new RoleServiceImpl(roleDao);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String url = request.getRequestURI();
        /* /cms: user muon truy cap vao cms */
        String urlRedirect = "";
        if (url.startsWith("/cms")){
            UserModel currentUser = (UserModel) request.getSession().getAttribute(Constants.SESSION_ID_CURRENT_USER);
            if (currentUser == null){
                response.sendRedirect("/login?message="+Constants.DONT_LOGIN);
            }
            else {
                // kiểm tra role của current user có phải là role admin không
                RoleModel roleCurrentUser = roleService.getRoleById(currentUser.getRoleId());
                if (!roleCurrentUser.getCode().equals(Constants.ROLE.ROLE_ADMIN.name())){
                    response.sendRedirect("/login?message="+Constants.PERMISSION_DENIED);
                }
                else {
                    filterChain.doFilter(request,response);
                }
            }
        }
        else {
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}