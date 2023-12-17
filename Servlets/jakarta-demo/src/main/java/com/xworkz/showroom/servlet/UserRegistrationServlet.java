package com.xworkz.showroom.servlet;

import com.xworkz.showroom.dto.UserDto;
import com.xworkz.showroom.service.UserService;
import com.xworkz.showroom.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/userRegistration")
public class UserRegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        long pNumber = Long.parseLong(req.getParameter("pNumber"));
        String uName = req.getParameter("uName");
        String password = req.getParameter("password");

        System.out.println(name + " " + age + " " + pNumber + " " + uName + " " + password);

        UserDto dto = new UserDto();
        dto.setName(name);
        dto.setAge(age);
        dto.setPNumber(pNumber);
        dto.setUName(uName);
        dto.setPassword(password);

        UserService service = new UserServiceImpl();

        if(service.validateAndRegisterUser(dto)){
            req.setAttribute("register","Registration Successful Please login to continue...");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req,resp);
        }else {
            req.setAttribute("register","User Registration Unsuccessful/User name already found");
            RequestDispatcher dispatcher = req.getRequestDispatcher("registration.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
