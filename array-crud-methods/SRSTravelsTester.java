class SRSTravelsTester {
    public static void main(String[] args) {
        SRSTravels.insertToursitPlaces("Mysore");
        SRSTravels.insertToursitPlaces("Ooty");
        SRSTravels.insertToursitPlaces("Kodaikanal");
        SRSTravels.insertToursitPlaces("Coorg");
        SRSTravels.insertToursitPlaces("Goa");
        SRSTravels.insertToursitPlaces("Munnar");
        SRSTravels.insertToursitPlaces("Madurai");
        SRSTravels.insertToursitPlaces("Tekkady");

        SRSTravels.readToursitPlaces();

        SRSTravels.updateTouristPlace("Tekkady", "Chennai");

        SRSTravels.readToursitPlaces();
        
    }
}
