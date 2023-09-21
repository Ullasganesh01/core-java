class PurpleLaneMetroTester {
     public static void main(String[] args) {
        PurpleLaneMetro.addMetroStations("Kengeri");
        PurpleLaneMetro.addMetroStations("Pattanagere");
        PurpleLaneMetro.addMetroStations("Jnanbharathi");
        PurpleLaneMetro.addMetroStations("Rajarajeshwari Nagar");
        PurpleLaneMetro.addMetroStations("Nayandana Halli");
        PurpleLaneMetro.addMetroStations("Mysore Road");
        PurpleLaneMetro.addMetroStations("Deepanjali Nagar");

        PurpleLaneMetro.getMetroStations();
        PurpleLaneMetro.updateMetroStation("Kengeri", "Ullal");
        PurpleLaneMetro.getMetroStations();
    }
}
