package com.xworkz.showroom.servlet;

import com.xworkz.showroom.service.UserService;
import com.xworkz.showroom.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(urlPatterns = "/loginUser")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uName = req.getParameter("uName");
        String password = req.getParameter("password");

        UserService service = new UserServiceImpl();
        if(service.validateAndLoginUser(uName,password)){
            String userMessage = "Welcome " + uName + "!!";
//            req.setAttribute("message",userMessage);
            resp.sendRedirect("getUsers?message=" + URLEncoder.encode(userMessage, "UTF-8"));
//            RequestDispatcher dispatcher = req.getRequestDispatcher("userpage.jsp");
//            dispatcher.forward(req,resp);
        }else {
            req.setAttribute("message","Login Unsuccessful");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
