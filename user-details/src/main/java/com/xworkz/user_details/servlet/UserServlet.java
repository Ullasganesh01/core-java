package com.xworkz.user_details.servlet;

import com.xworkz.user_details.dto.UserDto;
import com.xworkz.user_details.service.UserService;
import com.xworkz.user_details.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = "/userDetails")
@WebServlet(urlPatterns = "/userDetails" , loadOnStartup = +1)//to create an object before request/ on server startup
public class UserServlet extends HttpServlet {
    public UserServlet(){
        System.out.println("Servlet Object is created");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet Object is initialized");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("fname");
        String middleName = req.getParameter("mname");
        String lastName = req.getParameter("lname");
        String houseNo = req.getParameter("houseNo");
        String street = req.getParameter("street");
        String city = req.getParameter("city");
        String district = req.getParameter("district");
        String state = req.getParameter("state");
        String pinCode = req.getParameter("pincode");
        String gender = req.getParameter("gender");

        UserDto dto = new UserDto();
        dto.setFirstName(firstName);
        dto.setMiddleName(middleName);
        dto.setLastName(lastName);
        dto.setHouseNo(houseNo);
        dto.setStreet(street);
        dto.setCity(city);
        dto.setDistrict(district);
        dto.setState(state);
        int pin = Integer.parseInt(pinCode);
        dto.setPinCode(pin);
        dto.setGender(gender);

//        UserService service = new UserServiceImpl();
//        String validate = service.validateAddNewUser(dto);
//        PrintWriter pw = resp.getWriter();
//        pw.write(validate);

        req.setAttribute("firstName",firstName);
        RequestDispatcher dispatcher = req.getRequestDispatcher("response.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Servlet Object is destroyed");
    }
}

//Servlet container - it is an object which manages other objects[servlet objects] -- life cycle of servlet

/*
web.xml -- deployment descriptor searches for web startup/welcome page else index.html

  init(ServletConfig); -- only once
  service(req,resp);-- doPost doGet etc.. -- as many times the application/form is called or submitted
  destroy(); -- only once

  service method is invoked  which intern invokes respective doXX method based on the method

  servlet container is created by server before creating an servlet object
  when a client makes a request an object is created by servlet container which is created by server
  */
