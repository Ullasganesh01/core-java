class Division {
    public static void main(String[] args) {
        div(20,5);
        div(14,3);
        div(275,69);
        div(460,89 );
        div(1111,777);
        div(18,17,1 );
        div(79,65,2);
        div(871,121,3);
        div(576,48,4);
        div(9,3,5);
    }
    public static void div(float a,float b){
        System.out.println(a/b);
    }

    public static void div(float a,float b,float c){
        System.out.println(a/b/c);
    }
}
