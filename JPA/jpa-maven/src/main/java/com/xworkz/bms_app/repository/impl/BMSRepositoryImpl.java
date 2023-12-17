package com.xworkz.bms_app.repository.impl;

import com.xworkz.bms_app.repository.BMSRepository;
import com.xworkz.bms_app.dto.MovieTicketsDto;
import com.xworkz.bms_app.singleton.EntityManagerFactorySingleton;

import javax.persistence.*;
import java.util.List;

public class BMSRepositoryImpl implements BMSRepository {

    @Override
    public void addTicket(MovieTicketsDto dto) {
        Persistence persistence = new Persistence();
        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);// to insert object into database-table as rows
        entityManager.getTransaction().commit();
        System.out.println("Record Added!!");
    }

    @Override
    public MovieTicketsDto getMovieTicketInfoById(int id) {
        return Persistence.
                createEntityManagerFactory("com.xworkz").
                createEntityManager().find(MovieTicketsDto.class,id); // to get the record
    }

    @Override
    public void updateNoOfTicketsById(int updatedNoOfTickets, int id) {
        EntityManager entityManager = Persistence.
                createEntityManagerFactory("com.xworkz").
                createEntityManager();
        MovieTicketsDto dto = entityManager.find(MovieTicketsDto.class,id);{
            if (dto != null){
                dto.setNoOfTickets(updatedNoOfTickets);
                dto.setPrice(updatedNoOfTickets*250);
                entityManager.getTransaction().begin();
                entityManager.merge(dto); // to update the record
                entityManager.getTransaction().commit();
                System.out.println("Successfully Updated!!");
            }
            else {
                System.out.println("No record found");
            }
        }
    }

    @Override
    public void deleteTicketById(int id) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        MovieTicketsDto dto = entityManager.find(MovieTicketsDto.class,id);
        if (dto != null){
            entityManager.getTransaction().begin();
            entityManager.remove(dto); // to delete the record
            entityManager.getTransaction().commit();
            System.out.println("Successfully Deleted!!");
        }else {
            System.out.println("No record found");
        }
    }
//Named Query
    @Override
    public List fetchAllTickets() {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("fetchAllTickets");
        return query.getResultList();
    }

    @Override
    public List fetchTicketsByMovieName(String movieName) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("fetchTicketsByMovieName").setParameter("movieName",movieName);
        return query.getResultList();
    }

    @Override
    public MovieTicketsDto fetchTicketByMovieName(String movieName) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("fetchTicketByMovieName").setParameter("movieName",movieName); // to fetch whole record i.e all columns
        return (MovieTicketsDto) query.getSingleResult();
    }

    @Override
    public List fetchAllTicketsInfo() {
        return EntityManagerFactorySingleton.getFactory().createEntityManager()
                .createNamedQuery("fetchAllTicketsInfo").getResultList();
    }

    @Override
    public String fetchTheatreFromMovieName(String movieName) throws NoResultException {
        return (String)EntityManagerFactorySingleton.getFactory().createEntityManager()
                .createNamedQuery("fetchTheatreFromMovieName")
                .setParameter("movieName",movieName).getSingleResult();
    }

    @Override
    public List fetchAllTheatreFromMovieName(String movieName) {
        return EntityManagerFactorySingleton.getFactory().createEntityManager()
                .createNamedQuery("fetchAllTheatreFromMovieName").setParameter("movieName",movieName)
                .getResultList();
    }

    @Override
    public List fetchAllMovieNamesByLocation(String location) {
        return EntityManagerFactorySingleton.getFactory().createEntityManager()
                .createNamedQuery("fetchAllMovieNamesByLocation").setParameter("location",location)
                .getResultList();
    }

    @Override
    public List fetchAllMovieAndTheatreByLocation(String location) {
        return EntityManagerFactorySingleton.getFactory().createEntityManager()
                .createNamedQuery("fetchAllMovieAndTheatreByLocation").setParameter("loc",location)
                .getResultList();
    }

    @Override
    public Object[] fetchMovieAndTheatreByLocation(String location) {
        return (Object[]) EntityManagerFactorySingleton.getFactory().createEntityManager()
                .createNamedQuery("fetchMovieAndTheatreByLocation").setParameter("loc",location)
                .getSingleResult();
    }

    @Override
    public int updatePriceByTheatreName(String theatreName, double price) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("updatePriceByTheatreName")
                .setParameter("price",price).setParameter("theatre",theatreName);
        entityManager.getTransaction().begin();
        int rows = query.executeUpdate();
        entityManager.getTransaction().commit();
        return rows;
    }
    //----
    @Override
    public int deleteTicketByMovieName(String movieName) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        entityManager.getTransaction().begin();
        int rows = entityManager.createNamedQuery("deleteTicketByMovieName").setParameter("movieName",movieName).executeUpdate();
        entityManager.getTransaction().commit();
        return rows;
    }
//HQL Normal Queries
/*
    @Override
    public MovieTicketsDto fetchTicketByMovieName(String movieName) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query = entityManager.createQuery("from MovieTicketsDto dto where dto.movieName = '" + movieName + "' "); // to fetch whole record i.e all columns
        MovieTicketsDto movieTicketsDto = (MovieTicketsDto) query.getSingleResult();
        return movieTicketsDto;
    }

    @Override
    public List fetchAllTicketsInfo() {
        return Persistence.createEntityManagerFactory("com.xworkz").createEntityManager()
                .createQuery("from MovieTicketsDto").getResultList();
    }

    @Override
    public String fetchTheatreFromMovieName(String movieName) throws NoResultException {
        return (String)Persistence.createEntityManagerFactory("com.xworkz").createEntityManager()
                .createQuery("select theatreName from MovieTicketsDto where movieName = '"+movieName+"'").getSingleResult();
    }

    @Override
    public List fetchAllTheatreFromMovieName(String movieName) {
        return Persistence.createEntityManagerFactory("com.xworkz").createEntityManager()
                .createQuery("select theatreName from MovieTicketsDto where movieName = '"+movieName+"'").getResultList();
    }

    @Override
    public List fetchAllMovieNamesByLocation(String location) {
        return Persistence.createEntityManagerFactory("com.xworkz").createEntityManager()
                .createQuery("select movieName from MovieTicketsDto where location = '"+location+"'").getResultList();
    }

    @Override
    public List fetchAllMovieAndTheatreByLocation(String location) {
        return Persistence.createEntityManagerFactory("com.xworkz").createEntityManager()
                .createQuery("select movieName,theatreName from MovieTicketsDto where location = '"+location+"'").getResultList();
    }

    @Override
    public Object[] fetchMovieAndTheatreByLocation(String location) {
        return (Object[]) Persistence.createEntityManagerFactory("com.xworkz").createEntityManager()
                .createQuery("select movieName,theatreName from MovieTicketsDto where location = '"+location+"'").getSingleResult();
    }

    @Override
    public int updatePriceByTheatreName(String theatreName, double price) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        Query query = entityManager.createQuery("update MovieTicketsDto dto set dto.price = '"+price+"' where dto.theatreName ='"+theatreName+"'");
        entityManager.getTransaction().begin();
        int rows = query.executeUpdate();
        entityManager.getTransaction().commit();
        return rows;
    }

    @Override
    public int deleteTicketByMovieName(String movieName) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        int rows = entityManager.createQuery("delete from MovieTicketsDto dto where dto.movieName ='"+movieName+"'").executeUpdate();
        entityManager.getTransaction().commit();
        return rows;
    }
*/
}
