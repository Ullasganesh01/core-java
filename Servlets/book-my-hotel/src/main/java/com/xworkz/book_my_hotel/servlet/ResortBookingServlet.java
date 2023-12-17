package com.xworkz.book_my_hotel.servlet;

import com.xworkz.book_my_hotel.dto.ResortBookingDto;
import com.xworkz.book_my_hotel.service.FeedbackService;
import com.xworkz.book_my_hotel.service.impl.FeedbackServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/resortbookings")
public class ResortBookingServlet extends HttpServlet {
    private static FeedbackService service = new FeedbackServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResortBookingDto dto = new ResortBookingDto();

        dto.setFirstName(req.getParameter("name"));
        dto.setLastName(req.getParameter("lname"));
        dto.setEmailId(req.getParameter("email"));
        dto.setContactNo(Long.parseLong(req.getParameter("contactno")));
        dto.setModeOfPayment(req.getParameter("payMode"));
        dto.setCheckIn(req.getParameter("checkin"));
        dto.setCheckOut(req.getParameter("checkout"));
        dto.setNoOfAdults(Integer.parseInt(req.getParameter("adults")));
        dto.setNoOfChild(Integer.parseInt(req.getParameter("childrens")));
        dto.setNoOfRooms(Integer.parseInt(req.getParameter("rooms")));

        System.out.println(dto);

        FeedbackService service = new FeedbackServiceImpl();
        if(service.validateAndSaveBookingDetails(dto)){
            RequestDispatcher dispatcher = req.getRequestDispatcher("feedback.jsp");
            dispatcher.forward(req,resp);
        }else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ResortBookingDto> bookings = service.validateAndGetAllBookingDetails();

        System.out.println(bookings);

        RequestDispatcher dispatcher;
        if (bookings!=null){
            req.setAttribute("bookings",bookings);
            dispatcher = req.getRequestDispatcher("viewdetails.jsp");
            dispatcher.forward(req,resp);
        }else {
//            req.setAttribute("noBookings","No Users Found");
            dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req,resp);
        }
    }


}
