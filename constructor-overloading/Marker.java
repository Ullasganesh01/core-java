class Marker{
    String brandName;
    String colour;
    int price;
    String typeOfMarker;

    public Marker(){
        System.out.println("default value");
    }

    public Marker(String brandName,String colour){
        this.brandName=brandName;
        this.colour=colour;
    }

    public Marker(int price,String typeOfMarker){
        this.price=price;
        this.typeOfMarker=typeOfMarker;
    }
}