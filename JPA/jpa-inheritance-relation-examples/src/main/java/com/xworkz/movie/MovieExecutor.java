package com.xworkz.movie;

import com.xworkz.movie.dto.Hero;
import com.xworkz.movie.dto.Heroine;
import com.xworkz.movie.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class MovieExecutor {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        Hero hero = new Hero();
        hero.setActorName("Yash");
        hero.setGender("Male");
        hero.setEarnings(50000000);
        hero.setRole("Main");
        hero.setTimings(300);

        Heroine heroine = new Heroine();
        heroine.setActorName("Srinidhi shetty");
        heroine.setGender("Female");
        heroine.setEarnings(1000000);
        heroine.setMakeUpFees(20000);

        em.getTransaction().begin();
        em.persist(hero);
        em.persist(heroine);
        em.getTransaction().commit();

    }
}
