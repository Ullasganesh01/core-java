package com.xworkz.bms_app.dto;

import com.xworkz.bms_app.constants.Languages;
import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.annotation.Generated;
import javax.persistence.*;
@Data // getter,setter,requiredConstructor,toString,equalsHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie_tickets")
@Builder // to create object without new keyword
@NamedQueries({
        @NamedQuery(name = "fetchAllTickets",query = "select dto from MovieTicketsDto as dto"), //use className instead of tableName- for custom queries
        @NamedQuery(name = "fetchTicketsByMovieName",query = "select dto from MovieTicketsDto as dto where movie_name =:movieName"),
        @NamedQuery(name = "fetchTicketByMovieName",query = "from MovieTicketsDto dto where dto.movieName =:movieName"),
        @NamedQuery(name = "fetchAllTicketsInfo",query = "from MovieTicketsDto"),
        @NamedQuery(name = "fetchTheatreFromMovieName",query = "select theatreName from MovieTicketsDto where movieName =:movieName"),
        @NamedQuery(name = "fetchAllTheatreFromMovieName",query = "select theatreName from MovieTicketsDto where movieName =:movieName"),
        @NamedQuery(name = "fetchAllMovieNamesByLocation", query = "select dto.movieName from MovieTicketsDto dto where dto.location =:location"),
        @NamedQuery(name = "fetchAllMovieAndTheatreByLocation", query = "select movieName,theatreName from MovieTicketsDto where location =:loc"),
        @NamedQuery(name = "fetchMovieAndTheatreByLocation", query = "select movieName,theatreName from MovieTicketsDto dto where location =:loc"),
        @NamedQuery(name = "updatePriceByTheatreName", query = "update MovieTicketsDto dto set dto.price =:price where dto.theatreName =:theatre"),
        @NamedQuery(name = "deleteTicketByMovieName", query = "delete from MovieTicketsDto dto where dto.movieName =:movieName")
})

public class MovieTicketsDto {
    @Id
    @Column(name = "id")
    //@GenericGenerator(name = "ref",strategy = "increment")
    //@GeneratedValue(generator = "ref")//auto-increment of ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // same as above
    private int id;
    @Column(name = "location")
    private String location;
    @Column(name = "movie_name")
    private String movieName;
    @Column(name = "language")
    @Enumerated(EnumType.STRING) // to make ordinal value starting from 1
    private Languages language;
    @Column(name = "timings")
    private String timings;
    @Column(name = "theatre_name")
    private String theatreName;
    @Column(name = "no_of_tickets")
    private int noOfTickets;
    @Column(name = "price")
    private double price;
}
