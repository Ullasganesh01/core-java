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
import java.net.URLEncoder;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    private  static UserService service = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("userId"));

        if(service.validateAndDeleteUserById(id)){
//            req.setAttribute("deleteMessage","Deleted Successfully");
            String message = "Deleted Successfully";
            resp.sendRedirect("getUsers?deleteMessage=" + URLEncoder.encode(message, "UTF-8"));
//            RequestDispatcher dispatcher = req.getRequestDispatcher("adminoptions.jsp");
//            dispatcher.forward(req,resp);
        }else {
            req.setAttribute("deleteMessage","Delete UnSuccessful");
            RequestDispatcher dispatcher = req.getRequestDispatcher("userpage.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
