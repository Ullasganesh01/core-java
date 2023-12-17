package com.xworkz.book_my_hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "booking_details")
@NamedQuery(name = "getAllBookingDetails",query = "from ResortBookingDto dto")
public class ResortBookingDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private long contactNo;
    private String modeOfPayment;
    private String checkIn;
    private String checkOut;
    private int noOfAdults;
    private int noOfChild;
    private int noOfRooms;
}
