package com.xworkz.instamart;

import com.xworkz.instamart.imart.Instamart;
import com.xworkz.instamart.imart.impl.InstamartImpl;

import java.util.Scanner;

public class InstamartTester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Instamart instamart = new InstamartImpl();
        while (true){
            System.out.println("Welcome to Instamart");
            System.out.println("1.To Buy Products ");
            System.out.println("2.To get results");
            System.out.println("3.To save");
            System.out.println("4.To saveOrUpdate");
            System.out.println("5.To persist");
            System.out.println("6.To update");
            System.out.println("7.To merge");
            System.out.println("8.To delete");
            System.out.println("9.To get");
            System.out.println("10.To load");
            System.out.println("11.More Queries");
            System.out.println("12.Named Parameter Queries and more other");
            System.out.println("13.Criteria Queries");
            System.out.println("14.Projection Queries");
            System.out.println("Enter the choice : ");
            int choice = s.nextInt();
            if (choice>0 && choice <15){
                switch (choice){
                    case 1 : instamart.saveProduct(instamart.readProductDetails());
                        break;
                    case 2: instamart.getResults(s.nextInt());
                        break;
                    case 3:
                        instamart.save(instamart.readProductDetails());
                        break;
                    case 4:
                        instamart.saveOrUpdate(instamart.readProductDetails(),s.nextInt());
                        break;
                    case 5:
                        instamart.persist(instamart.readProductDetails());
                        break;
                    case 6:
                        instamart.update(instamart.readProductDetails(),s.nextInt());
                        break;
                    case 7:
                        instamart.merge(instamart.readProductDetails(),s.nextInt());
                        break;
                    case 8:
                        instamart.delete(s.nextInt());
                        break;
                    case 9:
                        System.out.println(instamart.get(s.nextInt()));
                        break;
                    case 10:
                        System.out.println(instamart.load(s.nextInt()));
                        break;
                    case 11:
                        instamart.moreQueries();
                        break;
                    case 12:
                        instamart.namedParameterQueries(s.nextInt());
                        break;
                    case 13:
                        instamart.criteriaQueries();
                        break;
                    case 14:
                        instamart.projectionQueries();
                        break;
                    default:
                        System.out.println("Enter the proper choice ");
                }
            }else {
                break;
            }
        }
    }
}
