class TelecomTester {
    public static void main(String[] args) {
        Telecom.insertSimCard("Jio");
        Telecom.insertSimCard("Airtel");
        Telecom.insertSimCard("Idea");
        Telecom.insertSimCard("Vadafone");
        Telecom.insertSimCard("Bsnl");
        Telecom.insertSimCard("TataDocomo");
        //Telecom.insertSimCard("Aircel");

        Telecom.getSimCards();

        Telecom.updateSimCard("TataDocomo", "Aircel");

        Telecom.getSimCards();
    }
}
