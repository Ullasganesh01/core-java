class KarnatakaTester {
    public static void main(String[] args) {
        Karnataka.addCity("Bengaluru");
        Karnataka.addCity("Mysuru");
        Karnataka.addCity("Mangalore");
        Karnataka.addCity("Davangere");
        Karnataka.addCity("Dharwad");
        Karnataka.addCity("Hassan");
        Karnataka.addCity("Mandya");
        Karnataka.addCity("Mandya");

        Karnataka.getCities();

        Karnataka.updateCityName("Mysuru", "Mysore");

        Karnataka.getCities();
    }
}
