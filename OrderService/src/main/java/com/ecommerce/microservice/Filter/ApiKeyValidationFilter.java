//package com.ecommerce.microservice.Filter;
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//@Component
//public class ApiKeyValidationFilter implements Filter {
//
//    private static final String SECRET_KEY = "MySecretKey123";
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, jakarta.servlet.ServletException {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//        HttpServletResponse httpResponse = (HttpServletResponse) response;
//
//        String secretKey = httpRequest.getHeader("Secret-Key");
//
//        if (secretKey == null || !secretKey.equals(SECRET_KEY)) {
//            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            httpResponse.getWriter().write("Unauthorized: Invalid Secret Key");
//            return;
//        }
//
//        chain.doFilter(request, response);
//    }
//}
