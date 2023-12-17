package com.myworkz.java_features.default_static_inInterface;

interface AB{
    default void display(){
        System.out.println("default AB method");
    }
}

interface BA{
    default void display(){
        System.out.println("default BA method");
    }
}
class OverridingDefault implements AB,BA{
    @Override
    public void display() {
        System.out.println("Overidden Default method ");
    }
}

class Overriding implements AB,BA{
    @Override
    public void display() {
        BA.super.display();
        AB.super.display();
    }
}
public class DefaultMethods implements AB {

    public static void main(String[] args) {
        AB methods = new DefaultMethods();
        methods.display();

        BA methods1 = new OverridingDefault();
        methods1.display();

        Overriding overridingMethod = new Overriding();
        overridingMethod.display();
    }
}
