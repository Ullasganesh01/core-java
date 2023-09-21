class GardenTester {
    public static void main(String[] args) {
        Garden.plantFlowerPlants("Rose");
        Garden.plantFlowerPlants("Tulips");
        Garden.plantFlowerPlants("Hibiscus");
        Garden.plantFlowerPlants("Mariegold");
        Garden.plantFlowerPlants("Jasmine");

        Garden.getFlowerPlants();

        Garden.changeFlowerPlant("Hibiscus", "Sunflower");

        Garden.getFlowerPlants();
        
    }
}
