package com.xworkz.human_heart;

import com.xworkz.human_heart.heart.Heart;
import com.xworkz.human_heart.human.Human;

public class HumanHeartTester {
    public static void main(String[] args) {
        Human human = new Human();
        Heart heart = new Heart();
        human.heart = heart;
    }
}
