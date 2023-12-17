package com.xworkz.presentation.jpa;


import javax.persistence.*;
import java.util.List;

public class JpaOperations {

    public void addUser(UsersDto dto) {
        Persistence persistence = new Persistence();
        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
    }

    public UsersDto getUserInfoById(int id) {
        return Persistence.
                createEntityManagerFactory("jpa").
                createEntityManager().find(UsersDto.class,id);
    }

    public void updateAgeById(int age, int id) {
        EntityManager entityManager = Persistence.
                createEntityManagerFactory("jpa").
                createEntityManager();
        UsersDto dto = entityManager.find(UsersDto.class,id);{
            if (dto != null){
                dto.setAge(age);
                entityManager.getTransaction().begin();
                entityManager.merge(dto);
                entityManager.getTransaction().commit();
            }
            else {
                System.out.println("No record found");
            }
        }
    }

    public void deleteUserById(int id) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
        UsersDto dto = entityManager.find(UsersDto.class,id);
        if (dto != null){
            entityManager.getTransaction().begin();
            entityManager.remove(dto);
            entityManager.getTransaction().commit();
        }else {
            System.out.println("No record found");
        }
    }

    public List fetchAllUsers() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
        Query query = entityManager.createNamedQuery("fetchAllUsers");
        return query.getResultList();
    }

    public UsersDto fetchUserByUserName(String userName) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
        Query query = entityManager.createQuery("from UsersDto dto where dto.userName = '" + userName + "' ");
        UsersDto usersDto = (UsersDto) query.getSingleResult();
        return usersDto;
    }

}
