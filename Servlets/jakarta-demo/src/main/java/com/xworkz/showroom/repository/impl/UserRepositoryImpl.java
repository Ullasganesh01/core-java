package com.xworkz.showroom.repository.impl;

import com.xworkz.showroom.dto.UserDto;
import com.xworkz.showroom.repository.UserRepository;
import com.xworkz.showroom.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    @Override
    public boolean registerNewUser(UserDto dto) {
        boolean isFound = false;
        Query query = em.createNamedQuery("getUserName");
         List<String> userlist = query.getResultList();
         if (!userlist.isEmpty()){
             for(String name:userlist){
                if (name.equals(dto.getUName())){
                    isFound = true;
                }
             }
         }
         if (isFound){
             return false;
         }else {
             em.getTransaction().begin();
             em.persist(dto);
             em.getTransaction().commit();
             return true;
         }
    }

    @Override
    public List loginUser(String uName, String password) {
        Query query = em.createNamedQuery("getUserByUserNameAndPassword");
        query.setParameter("uName",uName);
        query.setParameter("password",password);
        return query.getResultList();

    }

    @Override
    public List getAllUsers() {
        Query query = em.createNamedQuery("getAllUsers");
        return query.getResultList();
    }

    @Override
    public UserDto getUserById(int id) {
        return (UserDto) em.createNamedQuery("getUserById").setParameter("id",id).getSingleResult();
    }

    @Override
    public boolean updateUserById(int id, UserDto dto) {
        UserDto dto2 = em.find(UserDto.class,id);
        if (dto2!=null){
            em.getTransaction().begin();
            dto2.setName(dto.getName());
            dto2.setAge(dto.getAge());
            dto2.setPNumber(dto.getPNumber());
            dto2.setUName(dto.getUName());
            dto2.setPassword(dto.getPassword());
            em.merge(dto2);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUserById(int id) {
        UserDto dto = em.find(UserDto.class,id);
        if (dto!=null){
            em.getTransaction().begin();
            em.remove(dto);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }
}
