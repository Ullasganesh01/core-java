class CricketMania {
    static String topBatsman[] = {"Virat Kohli","Rohit Sharma","Steve Smith","David Warner","Shubman Gill",
                                  "Glen Maxwell","Faf du Plessis","KL Rahul","Surya Kumar Yadav","Chris Gayle"};

    static String iplTeams[] = {"Royal Challengers Bengaluru","Chennai Super Kings","Mumbai Indians","Gujurat Titans","Lucknow Super Gaints",
                                "Sunrises Hyderabad","Delhi Capitals","Punjab Kings","Kolkata Knight Riders","Rajasthan Royals"};
                                
    static String topIccTeams[] = {"India " ,"Australia","England","New Zealand","Pakisthan",
                                    "South Africa","West Indies","Sri Lanka","Bngladesh","Afghanisthan"};

    public static void main(String[] args) {
        System.out.println("Top Batsmans :");
        //System.out.println("\t" + topBatsman[0] + ","+ topBatsman[1] + ","+ topBatsman[2] + ","+ topBatsman[3] + ","+ topBatsman[4] + ","
        //                   + "\n\t"+ topBatsman[5] + ","+ topBatsman[6] + ","+ topBatsman[7] + ","+ topBatsman[8] + ","+ topBatsman[9] + "\n");
        for(String bat:topBatsman){
            System.out.println(bat);
        }
        System.out.println("IPL Teams :");
        //System.out.println("\t" + iplTeams[0] + ","+ iplTeams[1] + ","+ iplTeams[2] + ","+ iplTeams[3] + ","+ iplTeams[4] + ","
        //                + "\n\t"+ iplTeams[5] + ","+ iplTeams[6] + ","+ iplTeams[7] + ","+ iplTeams[8] + ","+ iplTeams[9] + "\n");
        for(String ipl:iplTeams){
            System.out.println(ipl);
        }
        System.out.println("Top ICC Teams :");
        //System.out.println("\t" + topIccTeams[0] + ","+ topIccTeams[1] + ","+ topIccTeams[2] + ","+ topIccTeams[3] + ","+ topIccTeams[4] + ","
        //                + "\n\t"+ topIccTeams[5] + ","+ topIccTeams[6] + ","+ topIccTeams[7] + ","+ topIccTeams[8] + ","+ topIccTeams[9] + "\n");
        for(String icc:topIccTeams){
            System.out.println(icc);
        }
    }
}
