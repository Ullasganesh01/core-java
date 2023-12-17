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

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
    private  static UserService service = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("userId"));

        UserDto dto = service.validateAndGetUserById(id);

        req.setAttribute("user",dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("updateUser.jsp");
        dispatcher.forward(req,resp);
    }
}
