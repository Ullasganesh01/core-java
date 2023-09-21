class Login {
    static boolean isLoggedIn;
    public static boolean search(String userName, String password){
        if(userName.length()>=5 && password.length()>=5 ){
            if(userName == "admin" && password == "admin"){
                System.out.println("Logged in as : "+ userName);
                isLoggedIn = true;
                return isLoggedIn;
            }
            if(userName == "ullas" && password == "comefindme"){
                System.out.println("Logged in as : "+ userName);
                isLoggedIn = true;
                return isLoggedIn;
            }
            if(userName == "tejas" && password == "whatsurstake"){
                System.out.println("Logged in as : "+ userName);
                isLoggedIn = true;
                return isLoggedIn;
            }
            System.out.println("Invalid Username and Password");
            return isLoggedIn;
        }else{
            System.out.println("Invalid Username and Password");
            return isLoggedIn;
        }
    }

    public static boolean search(long userId, String password){
        if(userId>=1000000000 && password.length()>=5 ){
            if(userId == 1000000000 && password == "admin"){
                System.out.println("Logged in as : "+ userId);
                isLoggedIn = true;
                return isLoggedIn;
            }
            if(userId == 9842536723l && password == "comefindme"){
                System.out.println("Logged in as : "+ userId);
                isLoggedIn = true;
                return isLoggedIn;
            }
            if(userId == 3234567890l && password == "whatsurstake"){
                System.out.println("Logged in as : "+ userId);
                isLoggedIn = true;
                return isLoggedIn;
            }
            System.out.println("Invalid Username and Password");
            return isLoggedIn;
        }else{
            System.out.println("Invalid Username and Password");
            return isLoggedIn;
        }
    }
}
