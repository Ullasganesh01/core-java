class LoginTester {
    public static void main(String[] args) {
        Login.search("ullas", "comefindme");
        Login.search("ul", "come");
        Login.search("tejas", "comefindm");
        Login.search(1000000000, "admin");
        Login.search(10000000, "admin");
        Login.search(3234567890l, "whatsurstake");
        
    }
}
