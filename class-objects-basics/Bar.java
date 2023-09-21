class Bar {
    //private String barName;
    String barName;
    String timings;
    String cuisines;
    //private String cuisines;
    String location;

    private Bar(String barName,String cuisines) {
        this.barName = barName;
        this.cuisines = cuisines;
        //System.out.println("Invoking class Bar");
    }

    public Bar() {
        System.out.println("Invoking class Bar");
    }

    public void provideAmbience(){
        System.out.println("Providing Ambience");
        System.out.println(barName + " " + cuisines);
    }

    //Bar b1 = new Bar();
    public static void main(String[] args) {
        Bar b2 = new Bar("stories","italian");
        b2.provideAmbience();
    }

}
