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

@WebServlet(urlPatterns = "/updateUser")
public class UpdateUserServlet extends HttpServlet {
    private static UserService service = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        UserDto dto = new UserDto();
        dto.setName(req.getParameter("name"));
        dto.setAge(Integer.parseInt(req.getParameter("age")));
        dto.setPNumber(Long.parseLong(req.getParameter("pNumber")));
        dto.setUName(req.getParameter("uName"));
        dto.setPassword(req.getParameter("password"));

        if(service.validateAndUpdateUserById(id,dto)){
//            req.setAttribute("updateMessage","Update Successful");
            String message = "Update Successful";
            resp.sendRedirect("getUsers?updateMessage=" + URLEncoder.encode(message, "UTF-8"));
//            RequestDispatcher dispatcher = req.getRequestDispatcher("adminoptions.jsp");
//            dispatcher.forward(req,resp);
        }else {
            req.setAttribute("updateMessage","Update UnSuccessful");
            RequestDispatcher dispatcher = req.getRequestDispatcher("updateUser.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
