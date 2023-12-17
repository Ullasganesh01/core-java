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
import java.util.List;

@WebServlet(urlPatterns = "/getUsers")
public class GetAllUsersServlet extends HttpServlet {
    UserService service = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<UserDto> users = service.validateAndGetAllUsers();

        System.out.println(users);

        RequestDispatcher dispatcher;
        if (users!=null){
            req.setAttribute("users",users);
            dispatcher = req.getRequestDispatcher("userpage.jsp");
            dispatcher.forward(req,resp);
        }else {
            req.setAttribute("nousers","No Users Found");
            dispatcher = req.getRequestDispatcher("userpage.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
