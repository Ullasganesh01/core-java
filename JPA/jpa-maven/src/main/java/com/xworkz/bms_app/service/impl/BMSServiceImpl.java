package com.xworkz.bms_app.service.impl;

import com.xworkz.bms_app.dto.MovieTicketsDto;
import com.xworkz.bms_app.repository.BMSRepository;
import com.xworkz.bms_app.repository.impl.BMSRepositoryImpl;
import com.xworkz.bms_app.service.BMSService;
import com.xworkz.bms_app.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Arrays;
import java.util.List;

public class BMSServiceImpl implements BMSService {
    BMSRepository bmsRepository;

    public BMSServiceImpl(){
        bmsRepository = new BMSRepositoryImpl();
    }

    @Override
    public MovieTicketsDto validateGetMovieTicketInfoById(int id) {
        if (id > 0){
            return bmsRepository.getMovieTicketInfoById(id);
        }else {
            System.out.println("Incorrect Id");
        }
        return  null;
    }

    @Override
    public void validateTicketAndAdd(MovieTicketsDto dto) {
        boolean isLocationValidated = false;
        boolean isMovieNameValidated = false;
        boolean isLanguageValidated = false;
        boolean isTimingsValidated = false;
        boolean isTheatreNameValidated = false;
        boolean isNoOfTicketsValidated = false;
        //boolean isPriceValidated = false;
        if (dto != null){
            if (dto.getLocation() != null){
                isLocationValidated = true;
            }
            if (dto.getMovieName() != null){
                isMovieNameValidated = true;
            }
            if (dto.getLanguage() != null){
                isLanguageValidated = true;
            }
            if (dto.getTimings() != null){
                isTimingsValidated = true;
            }
            if (dto.getTheatreName() != null){
                isTheatreNameValidated = true;
            }
            if (dto.getNoOfTickets() > 0){
                isNoOfTicketsValidated = true;
            }
            if (isLocationValidated && isMovieNameValidated && isLanguageValidated && isTimingsValidated && isTheatreNameValidated && isNoOfTicketsValidated){
                bmsRepository.addTicket(dto);
            }else {
                System.out.println("Incorrect Details Provided");
            }
        }
        else {
            System.out.println("Incorrect Details Provided");
        }
    }

    @Override
    public void validateUpdateNoOfTicketsById(int updatedNoOfTickets, int id) {
        boolean isUpdatedNoOfTicketsValidated = false;
        boolean isIdValidated = false;
        if (updatedNoOfTickets > 0 ){
            isUpdatedNoOfTicketsValidated = true;
        }
        if (id > 0){
            isIdValidated = true;
        }
        if (isUpdatedNoOfTicketsValidated && isIdValidated){
            bmsRepository.updateNoOfTicketsById(updatedNoOfTickets,id);
        }else {
            System.out.println("Incorrect Details Provided");
        }
    }

    @Override
    public void validateDeleteTicketById(int id) {
        if (id > 0){
            bmsRepository.deleteTicketById(id);
        }else {
            System.out.println("Incorrect Id");
        }
    }

    @Override
    public void validateFetchAllTickets() {
        List<MovieTicketsDto> recordsList  = bmsRepository.fetchAllTickets();
        if(recordsList != null){
            for (MovieTicketsDto dto : recordsList){
                System.out.println(dto);
            }
            //System.out.println(recordsList);
        }
        else {
            System.out.println("No records found!!");
        }
    }

    @Override
    public void validateFetchTicketsByMovieName(String movieName) {
        List<MovieTicketsDto> recordsList  = bmsRepository.fetchTicketsByMovieName(movieName);
        if(recordsList != null){
            for (MovieTicketsDto dto : recordsList){
                System.out.println(dto);
            }
            //System.out.println(recordsList);
        }
        else {
            System.out.println("No records found!!");
        }
    }

    @Override
    public void validateFetchTicketByMovieName(String movieName) {
        if (movieName!=null){
            MovieTicketsDto movieTicketsDto = bmsRepository.fetchTicketByMovieName(movieName);
            if (movieTicketsDto!=null){
                System.out.println(movieTicketsDto);
            }else {
                System.out.println("No records found");
            }
        }else {
            System.out.println("Please provide valid movie name");
        }
    }

    @Override
    public void validateFetchAllTicketsInfo() {
        List<MovieTicketsDto> recordsList  = bmsRepository.fetchAllTicketsInfo();
        if(recordsList != null){
            for (MovieTicketsDto dto : recordsList){
                System.out.println(dto);
            }
            //System.out.println(recordsList);
        }
        else {
            System.out.println("No records found!!");
        }
    }

    @Override
    public void validateFetchTheatreFromMovieName(String movieName) {
        if (movieName!= null){
            try {
                String theatreName = bmsRepository.fetchTheatreFromMovieName(movieName);
                if (theatreName!=null){
                    System.out.println(theatreName);
                }
            }catch (NoResultException e){
                System.out.println("No Theatres found for "+movieName);
            }
        }else {
            System.out.println("Enter valid movie name!!");
        }
    }

    @Override
    public void validateFetchAllTheatreFromMovieName(String movieName) {
        if (movieName!=null){
            List<String> theatres = bmsRepository.fetchAllTheatreFromMovieName(movieName);
            if (theatres!=null){
                //for (String theatre : theatres){
                    System.out.println(theatres);
                //}
            }else {
                System.out.println("No records found");
            }
        }else {
            System.out.println("Enter valid location!!");
        }
    }

    @Override
    public void validateFetchAllMovieNamesByLocation(String location) {
        if (location!=null){
            List<String> movieNames = bmsRepository.fetchAllMovieNamesByLocation(location);
            if (movieNames!=null){
                //for (String movie : movieNames){
                    System.out.println(movieNames);
                //}
            }else {
                System.out.println("No records found");
            }
        }else {
            System.out.println("Enter valid location!!");
        }
    }

    @Override
    public void validateFetchAllMovieAndTheatreByLocation(String location) {
        if (location != null){
            List<Object[]> moviesAndTheatres = bmsRepository.fetchAllMovieAndTheatreByLocation(location);
            if (moviesAndTheatres!=null){
                for (Object[] datas : moviesAndTheatres){
                    //for (Object data : datas ){
                    //    System.out.print(data);
                    //}
                    //System.out.println();
                    System.out.println(Arrays.toString(datas));
                }
            }
        }else {
            System.out.println("Enter valid location!!");
        }
    }

    @Override
    public void validateFetchMovieAndTheatreByLocation(String location) {
        if (location!=null){
            Object[] movieAndTheatre = bmsRepository.fetchMovieAndTheatreByLocation(location);
            if (movieAndTheatre!=null){
                System.out.println(Arrays.toString(movieAndTheatre));
            }else {
                System.out.println("No records found");
            }
        }else {
            System.out.println("Enter valid location!!");
        }
    }

    @Override
    public void validateUpdatePriceByTheatreName(String theatreName, double price) {
        if (theatreName != null && price > 0.0 && !theatreName.isEmpty()){
            int rows = bmsRepository.updatePriceByTheatreName(theatreName,price);
            if (rows>0){
                System.out.println("Updated : "+rows+" records/objects successfully!!");
            }else {
                System.out.println("No records found");
            }
        }else {
            System.out.println("Enter valid data");
        }
    }

    @Override
    public void validateDeleteTicketByMovieName(String movieName) {
        if (movieName!=null&&!movieName.isEmpty()){
            int rows = bmsRepository.deleteTicketByMovieName(movieName);
            if (rows>0){
                System.out.println("Deleted : "+rows+" records/objects successfully!!");
            }else {
                System.out.println("No records found");
            }
        }else {
            System.out.println("Enter valid data");
        }
    }

    public void selectNormalQueries(){
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();
        em.createQuery("select upper(location) from MovieTicketsDto").getResultList().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(em.createQuery("select max(price) from MovieTicketsDto").getSingleResult());
        System.out.println("---------------------------------------------------------------------------------------");
        em.createQuery("select dto from MovieTicketsDto dto where dto.price between 1000 and 2000 ").getResultList().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        em.createQuery("select dto from MovieTicketsDto dto where dto.location like '%ore'").getResultList().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        em.createQuery("select dto from MovieTicketsDto dto order by dto.movieName asc").getResultList().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        em.createQuery("select dto from MovieTicketsDto dto where dto.price in(500,1500)").getResultList().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(em.createQuery("select count(dto) from MovieTicketsDto dto").getSingleResult());
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public void selectCriteriaQueries(){
        EntityManager em = EntityManagerFactorySingleton.getFactory().createEntityManager();

        CriteriaBuilder cb  = em.getCriteriaBuilder();

        CriteriaQuery<Object> cq = cb.createQuery();
        Root<MovieTicketsDto> movies = cq.from(MovieTicketsDto.class);

        CriteriaQuery<Object> se = cq.select(movies);
        TypedQuery<Object> tq = em.createQuery(se);

        List<Object> list = tq.getResultList();
        list.forEach(System.out::println);//to get all records
        System.out.println("----------------------------------------------------------------------------");
        CriteriaQuery<Object> se1 = cq.select(movies);
        se1.orderBy(cb.asc(movies.get("movieName")));//to order
        em.createQuery(se1).getResultList().forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
        em.createQuery(cq.select(movies.get("location")).orderBy()).getResultList().forEach(System.out::println);//to get location
        System.out.println("----------------------------------------------------------------------------");
        em.createQuery(cq.select(movies.get("location")).orderBy(cb.desc(movies.get("location")))).getResultList().forEach(System.out::println);//to get location by desc
        System.out.println("----------------------------------------------------------------------------");
//        List<Object> objects  = em.createQuery(cq.multiselect(movies.get("location"),movies.get("price"),movies.get("timings")).orderBy()).getResultList();
//        for (Object o : objects) {
//            System.out.println(o);
//        }
        System.out.println("----------------------------------------------------------------------------");
        em.createQuery(cq.select(movies).where(cb.greaterThan(movies.get("price"),1200))).getResultList().forEach(System.out::println);//where gt
        System.out.println("----------------------------------------------------------------------------");
        em.createQuery(cq.select(movies).where(cb.between(movies.get("price"),1200,1800))).getResultList().forEach(System.out::println);// between
        System.out.println("----------------------------------------------------------------------------");
        em.createQuery(cq.select(movies).where(cb.like(movies.get("location"),"%ore"))).getResultList().forEach(System.out::println); // like
        System.out.println("----------------------------------------------------------------------------");
        em.createQuery(cq.select(movies).where(cb.in(movies.get("timings")).value("2pm").value("12pm"))).getResultList().forEach(System.out::println); //in
        System.out.println("----------------------------------------------------------------------------");

        CriteriaQuery<Object[]> cq1 = cb.createQuery(Object[].class);
        Root<MovieTicketsDto> movies1 = cq1.from(MovieTicketsDto.class);

        em.createQuery(cq1.multiselect(movies1.get("location"),cb.count(movies1)).groupBy(movies1.get("location"))).getResultList().forEach(obj -> System.out.println(Arrays.toString(obj)));//group by
        System.out.println("-----------------------------------------------------------------------------");
        em.createQuery(cq1.multiselect(movies1.get("location"),movies1.get("price"),movies1.get("timings")).groupBy().orderBy()).getResultList().forEach(obj -> System.out.println(Arrays.toString(obj)));//multiple columns
        System.out.println("------------------------------------------------------------------------------");
        em.createQuery(cq1.multiselect(movies1.get("location"),cb.count(movies1)).groupBy(movies1.get("location")).having(cb.gt(cb.count(movies1.get("location")),1)).orderBy(cb.desc(movies1.get("location")))).getResultList().forEach(obj -> System.out.println(Arrays.toString(obj)));//having
    }

    //    public MovieTicketsDto readTicketDetails(){
//        int id = 0;
//        System.out.println("Enter the location : ");
//        String loc = s.next();
//        System.out.println("Enter the movie name : ");
//        String movName = s.next();
//        System.out.println("Enter the language :");
//        for (Languages languages : Languages.values()){
//            System.out.print(languages + ", ");
//        }
//        System.out.println();
//        Languages lang = Languages.valueOf(s.next().toUpperCase());
//        //String language = lang.name();
//        System.out.println("Enter the timings : ");
//        String timings = s.next();
//        System.out.println("Enter the theatre name : ");
//        String theatre =s.next();
//        System.out.println("Enter the no of tickets : ");
//        int tickets = s.nextInt();
//        double price = tickets*250;
//
//        MovieTicketsDto dto = MovieTicketsDto.
//                builder().
//                id(id).
//                location(loc).
//                movieName(movName).
//                language(lang).
//                timings(timings).
//                theatreName(theatre).
//                noOfTickets(tickets).
//                price(price).
//                build();
//        return dto;
//    }
}
