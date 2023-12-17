package com.xworkz.instamart.imart.impl;


import com.xworkz.instamart.dto.ProductDto;
import com.xworkz.instamart.imart.Instamart;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InstamartImpl implements Instamart {
    Scanner s = new Scanner(System.in);
    @Override
    public ProductDto readProductDetails() {
        int id = 0;
        System.out.println("Enter the product name : ");
        String productName = s.next();
        System.out.println("Enter the price : ");
        double price = s.nextDouble();
        System.out.println("Enter the quantity : ");
        int quantity = s.nextInt();

        ProductDto dto = ProductDto.
                builder().
                id(id).
                productName(productName).
                price(price).
                quantity(quantity).
                build();
        return dto;
    }

    @Override
    public void saveProduct(ProductDto dto) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(dto);
        session.getTransaction().commit();
    }

    public void getResults(int id){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Query query =session.createQuery("from ProductDto where id="+id+" ");
        Object o = query.uniqueResult();
        System.out.println(o);
    }

    public void save(ProductDto dto){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        int i = (int) session.save(dto);
        System.out.println(i);
        session.getTransaction().commit();
    }

    public void saveOrUpdate(ProductDto dto,int id){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        dto.setId(id);
        session.saveOrUpdate(dto);
        session.getTransaction().commit();
    }

    public void persist(ProductDto dto){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(dto);
        session.getTransaction().commit();
    }

    public void update(ProductDto dto,int id){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        dto.setId(id);
        session.update(dto);
        session.getTransaction().commit();
    }

    public void merge(ProductDto dto,int id){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        dto.setId(id);
        System.out.println(session.merge(dto));
        session.getTransaction().commit();
    }

    public void delete(int i){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.delete(get(i));
        session.getTransaction().commit();
    }

    public ProductDto get(int i){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session.get(ProductDto.class,i);
    }

    public ProductDto load(int i){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session.load(ProductDto.class,i);
    }

    public void moreQueries(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println(session.createQuery("from ProductDto where id =5").uniqueResult());
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(session.createQuery("from ProductDto where price =35").uniqueResult());
        System.out.println("-------------------------------------------------------------------------------------------------");
        session.createQuery("select productName from ProductDto").list().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------------");
        ((List<Object[]>)session.createQuery("select productName,price from ProductDto").list()).forEach(objects -> System.out.println(Arrays.toString(objects)));
//                .forEach(object -> {
//                    for (Object o:
//                        object) {
//                            System.out.println(o);
//                        }
//
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(session.createQuery("select avg(price) from ProductDto").uniqueResult());
        System.out.println("-------------------------------------------------------------------------------------------------");
        ((List<Object[]>)session.createQuery("select sum(price),productName from ProductDto group by productName").list()).forEach(objects -> System.out.println(Arrays.toString(objects)));
        System.out.println("-------------------------------------------------------------------------------------------------");
        session.createQuery("from ProductDto where id > 4 order by productName asc").list().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------------");
        session.createQuery("select productName from ProductDto").setFirstResult(3).setMaxResults(3).list().forEach(System.out::println);//page nation
    }

    public void namedParameterQueries(int id){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(session.createQuery("Update ProductDto set productName ='veggies' where id =:id").setParameter("id",id).executeUpdate());
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(session.createQuery("delete ProductDto where id=:id").setParameter("id",id).executeUpdate());
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(session.createQuery("delete ProductDto where id="+id+" ").executeUpdate());
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(session.createQuery("Update ProductDto set productName ='veggies' where id ="+id+" ").executeUpdate());
        System.out.println("-------------------------------------------------------------------------------------------------");
        session.getTransaction().commit();
        session.createQuery("from ProductDto where id=:id").setParameter("id",id).list().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public void criteriaQueries(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria c;
        c = session.createCriteria(ProductDto.class);//Use class name.class
        c.list().forEach(System.out::println);//All records
        System.out.println("-------------------------------------------------------------------------------------------------");
        Criterion cr = Restrictions.eq("id",3);
        c.add(cr);
        System.out.println(c.uniqueResult());// single query result object
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.gt("price",50.0)).list().forEach(System.out::println);//greater than
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.lt("price",50.0)).list().forEach(System.out::println);//lesser than
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.ge("price",45.0)).list().forEach(System.out::println);//greater than equal
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.le("price",45.0)).list().forEach(System.out::println);//lesser than equal
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.like("productName","%gg%")).list().forEach(System.out::println);//like
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.between("price",30.0,80.0)).list().forEach(System.out::println);//between
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.eq("price",90.0)).list().forEach(System.out::println);//equals
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.ne("price",90.0)).list().forEach(System.out::println);//not equals
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.isNull("price")).list().forEach(System.out::println);// is null
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.isNotNull("price")).list().forEach(System.out::println);// is not null
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        System.out.println(c.list().add(Restrictions.isEmpty("price")));//is empty
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        System.out.println(c.list().add(Restrictions.isNotEmpty("price")));//is not empty
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.or(Restrictions.gt("price",45.0),Restrictions.like("productName","%gg%"))).list().forEach(System.out::println); //To use OR
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.add(Restrictions.and(Restrictions.gt("price",45.0),Restrictions.like("productName","%gg%"))).list().forEach(System.out::println);//To use AND
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.addOrder(Order.asc("price")).list().forEach(System.out::println); // ASC order
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.addOrder(Order.desc("quantity")).addOrder(Order.asc("price")).list().forEach(System.out::println); // DESC order
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    public void projectionQueries(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria c ;
        c = session.createCriteria(ProductDto.class);
        Projection p = Projections.property("productName");//to select productName
        c.setProjection(p).list().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.setProjection(Projections.property("price")).list().forEach(System.out::println);// to select price
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.setProjection(Projections.avg("price")).list().forEach(System.out::println); // to get avg
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.setProjection(Projections.sum("price")).list().forEach(System.out::println); // to get sum
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.setProjection(Projections.max("price")).list().forEach(System.out::println); // to get max
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.setProjection(Projections.min("price")).list().forEach(System.out::println); // to get min
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.setProjection(Projections.countDistinct("quantity")).list().forEach(System.out::println); // to get distinct row count in column
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        c.setProjection(Projections.count("price")).list().forEach(System.out::println); // to count of rows in column
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        System.out.println(c.setProjection(Projections.rowCount()).uniqueResult()); // to rows count
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        List<Object[]> list = c.setProjection(Projections.projectionList().add(Projections.property("productName")).add(Projections.property("quantity"))).list(); // to get more columns
        for(Object[] objects : list){System.out.println(Arrays.toString(objects));}
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        List<Object[]> list1 = c.setProjection(Projections.projectionList().add(Projections.property("productName")).add(Projections.property("quantity"))).add(Restrictions.gt("price",45.0)).addOrder(Order.desc("quantity")).list(); // to get more columns by condition and order
        for(Object[] objects : list1){System.out.println(Arrays.toString(objects));}
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        ((List<Object[]>)c.setProjection(Projections.projectionList().add(Projections.property("productName")).add(Projections.property("quantity"))).add(Restrictions.gt("price",45.0)).addOrder(Order.desc("quantity")).list()).forEach(objects -> System.out.println(Arrays.toString(objects))); // to get more columns by condition and order same as above
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        List<Object[]> list2 = c.setProjection(Projections.projectionList().add(Projections.property("productName")).add(Projections.property("quantity"))).add(Restrictions.gt("price",45.0)).addOrder(Order.desc("quantity")).setFirstResult(0).setMaxResults(1).list(); // to select more columns by condition and order and limit
        for(Object[] objects : list2){System.out.println(Arrays.toString(objects));}
        System.out.println("-------------------------------------------------------------------------------------------------");
        c = session.createCriteria(ProductDto.class);
        List<Object[]> list3 = c.setProjection(Projections.projectionList().add(Projections.count("quantity")).add(Projections.groupProperty("quantity"))).add(Restrictions.gt("quantity",2)).addOrder(Order.desc("quantity")).list(); // to get more columns by condition and group by and order --to get the details having count >2 and group by quantity and order by quantity
        for(Object[] objects : list3){System.out.println(Arrays.toString(objects));}
        System.out.println("-------------------------------------------------------------------------------------------------");


    }
}
