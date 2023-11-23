package com.xworkz.user_mgmt.servlet;

import com.xworkz.user_mgmt.dto.PassportDto;
import com.xworkz.user_mgmt.service.PassportService;
import com.xworkz.user_mgmt.service.impl.PassportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

@WebServlet(urlPatterns = "/passportDetails")
public class PassportServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cpvLocation = req.getParameter("cpvLocation");
        String passportOfficeLoc = req.getParameter("passOfficeLoc");
        String firstName = req.getParameter("firstName");
        String surname = req.getParameter("surname");
        String date = req.getParameter("dob");
        Date dob = Date.valueOf(date);
        String email = req.getParameter("emailId");
        String loginId = req.getParameter("loginId");
        String password = req.getParameter("password");
        String confirmPwd = req.getParameter("confirmPwd");
        String hintQuestion = req.getParameter("hintQuestion");
        String hintAnswer = req.getParameter("hintAnswer");

        PassportDto passDto = new PassportDto();
        passDto.setCpvLocation(cpvLocation);
        passDto.setPassportOfficeLoc(passportOfficeLoc);
        passDto.setFirstName(firstName);
        passDto.setSurname(surname);
        passDto.setDob(dob);
        passDto.setEmail(email);
        passDto.setLoginId(loginId);
        passDto.setPassword(password);
        passDto.setConfirmPwd(confirmPwd);
        passDto.setHintQuestion(hintQuestion);
        passDto.setHintAnswer(hintAnswer);

        PassportService service = new PassportServiceImpl();
        PrintWriter pw = resp.getWriter();
        String validate =service.validateAddNewUserPassportDetails(passDto);
        if(validate.equals("true")){
            pw.write("Thank You : " +firstName + " for registering!!");
        }else {
            pw.write(validate);
        }
    }
}
