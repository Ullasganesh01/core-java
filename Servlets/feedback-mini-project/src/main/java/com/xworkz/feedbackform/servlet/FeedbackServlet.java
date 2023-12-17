package com.xworkz.feedbackform.servlet;

import com.xworkz.feedbackform.dto.FeedbackDto;
import com.xworkz.feedbackform.service.FeedbackService;
import com.xworkz.feedbackform.service.impl.FeedbackServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/feedbackForm")
public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        long contactNo = Long.parseLong(req.getParameter("contactno"));
        String feedback = req.getParameter("comments");

        System.out.println(name + " " + email + " " + contactNo + " " + feedback);

        FeedbackDto dto = new FeedbackDto();
        dto.setName(name);
        dto.setEmailId(email);
        dto.setContactNo(contactNo);
        dto.setFeedback(feedback);

        FeedbackService service = new FeedbackServiceImpl();

        RequestDispatcher dispatcher;
        if (service.validateAndSaveFeedback(dto)){
            String message = "Feedback has been submitted !! <br> Thank You For your response " + name;
            req.setAttribute("feedbackSubmitted",message);
            dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req,resp);
        }else {
            dispatcher = req.getRequestDispatcher("feedbackpage.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
