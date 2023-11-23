package com.xworkz.user_mgmt.servlet;

import com.xworkz.user_mgmt.dto.UserDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/userDetails")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String emailId = req.getParameter("emailId");
        String password = req.getParameter("password");
        String mobileNo = req.getParameter("mobileNo");
        /*System.out.println(userName);
        System.out.println(emailId);
        System.out.println(password);
        System.out.println(mobileNo);*/

        UserDto userDto = new UserDto();
        userDto.setUserName(userName);
        userDto.setEmailId(emailId);
        userDto.setMobileNo(Long.parseLong(mobileNo));
        userDto.setPassword(password);

        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        String s = "<html><head><link rel=\"stylesheet\" href=\"src/main/webapp/style.css\"/></head><body><h3>Thank You "+userName +" for having wonderful experience</h3></body></html>";
        pw.write(s);

    }
}
