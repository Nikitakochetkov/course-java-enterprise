package com.rakovets.course_java_enterprise.solution.filter;

import com.rakovets.course_java_enterprise.solution.entity.User;
import com.rakovets.course_java_enterprise.solution.service.ServiceAuthentication;

import javax.imageio.spi.ServiceRegistry;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/authentication")
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        User admin = new User("Tol9", "9876");
        String login = servletRequest.getParameter("login");
        String password = servletRequest.getParameter("password");
        boolean resultCheck = ServiceAuthentication.getInstance().checkNameAndPassword(login, password);
        if (resultCheck) {
            servletRequest.getRequestDispatcher("/WEB-INF/jsp/authenticationSuccess.jsp")
                    .forward(servletRequest,servletResponse);
        } else {
            servletRequest.getRequestDispatcher("/WEB-INF/jsp/authenticationFailure.jsp")
                    .forward(servletRequest,servletResponse);
        }
    }
}
