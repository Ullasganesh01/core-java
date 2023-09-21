class MarkerTester{
    public static void main(String[] args){
        Marker marker=new Marker("Fabercastell","Pink");
        marker.typeOfMarker="whiteboard";
        marker.price=50;
        System.out.println(marker.brandName+"    "+marker.colour+"    "+marker.typeOfMarker+"   "+marker.price);

    }
}