//package vn.t3h.btvn.bookshop.config;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import vn.t3h.btvn.bookshop.model.User;
//import vn.t3h.btvn.bookshop.utils.Constants;
//
//
//import java.io.IOException;
//
//// Filter:
///*
//bộ lọc bắt buộc tất cả request trước
//khi đến được class Servlet đều phải đi qua
//class Filter này trước
//- class customer bộ lọc theo ý mình
// */
//@WebFilter(urlPatterns = "/*")
//public class CharacterEncodingFilter implements Filter {
//
//    private String encoding = "UTF-8";
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        // Lấy encoding từ cấu hình nếu có
//        String encodingParam = filterConfig.getInitParameter("encoding");
//        if (encodingParam != null) {
//            encoding = encodingParam;
//        }
//        ServletContext context = filterConfig.getServletContext();
//        // Đặt giá trị baseUrl vào ServletContext cho toàn bộ ứng dụng
//        context.setAttribute("baseUrl", ConfigInit.BASE_URL);
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        // Thiết lập mã hóa utf-8 cho request và response
//        servletRequest.setCharacterEncoding(encoding);
//        servletResponse.setCharacterEncoding(encoding);
//
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//
//        User currentUser = (User) request.getSession().getAttribute(Constants.SESSION_ID_CURRENT_USER);
//        if (currentUser != null){
//            HttpServletResponse response = (HttpServletResponse) servletResponse;
//            Cookie userCookie = new Cookie("username", currentUser.getUsername());
//            userCookie.setMaxAge(60 * 60); // Cookie có hiệu lực trong 1 giờ
//            response.addCookie(userCookie); // Thêm cookie vào response
//            request.setAttribute("username", currentUser.getUsername());
//        }
//        filterChain.doFilter(servletRequest, servletResponse); // Tiếp tục chuỗi xử lý
//    }
//
//    @Override
//    public void destroy() {
//        // Cleanup nếu cần
//    }
//}