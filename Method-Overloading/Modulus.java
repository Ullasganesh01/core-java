class Modulus {
    public static void main(String[] args) {
        mod(2,10);
        mod(10,2);
        mod(275,5);
        mod(46,4);
        mod(333,3);
        mod(180,9,5 );
        mod(794,65,8);
        mod(831,511,3);
        mod(57,7,3);
        mod(66,96,2);
    }
    public static void mod(float a,float b){
        System.out.println(a%b);
    }

    public static void mod(float a,float b,float c){
        System.out.println(a%b%c);
    }
}
