class NetPrime {
    static String kannadaMovies[] = {"Upendra","Kabzaa","Super","H2O","Topiwala",
                                     "Aishwarya","Buddhivantha","Hollywood","Super Ranga","Parodi",
                                     "Kantara","777 Charlie","K.G.F","K.G.F-2","Kirik Party",
                                     "Yuvarathna","Vikrant Rona","Dia","Pogaru","Pailwaan",
                                     "Kranti","Robert","Ugram","Googly","Kirathaka"};

    static String tamilMovies[] = {"Vaathi","Viduthalai","Varisu","Vikram Vedha","Sardar",
                                   "Love Today","PS 1","PS 2","Nitham Oru Vaanam","Dejavu",
                                   "Vikram","Cobra","Mersal","Gilli","Youth",
                                   "Sivakasi","Thuppakki","Puli","Bhairava","Master",
                                   "Theri","Bigil","Leo","Sarkar","Jilla"};

    static String teluguMovies[] = {"Custody","Dasara","Vaathi","Virupaksha","Sita Ramam",
                                    "RRR","Ravanasura","HIT","HIT-2","Rangasthalam",
                                    "Pushpa","Evaru","Bimbisara","Dhamaka","Jersey",
                                    "Love Story","Krack","DJ Tillu","Mahanati","Arya",
                                    "Sarrainodu","Bahubali","DJ","Happy","Eega"};

    static String englishMovies[] = {"Scarface","Godfather","Godfather-2","Godfather-3","Once upon a time in America",
                                     "Fight Club","Hangover 1","Hangover 2","Hangover 3","Wolf of Wall Streer",
                                     "Fast and Furious","Hobbs and Shaw","Fast X","Drive","Creed",
                                     "Avengers","Ant Man","Iron Man","Captain America","Black Panther",
                                     "Dark Knight Rises","Flash","Home Alone","Black Adam","Hulk"};

    static String hindiMovies[] = {"Krishh 1","Krishh 2","Krishh 3","Dhoom 1","Dhoom2",
                                    "Dhoom 3","Kabir Singh","Drishyam","Drishyam 2","Badhaai Do",
                                    "Doctor G","Govinda Naam Mera","Bholla","Thappad","Bhediya",
                                    "Anek","Antim","Gully Boy","Gumraah","Jersey",
                                    "Super 30","Pathaan","Tadap","Uri","Radhe"};

    public static void main(String[] args) {
        
        System.out.println("NetPrime");
        System.out.println("List of Kannada Movies :");
        //System.out.println("\t" + kannadaMovies[0] + ","+ kannadaMovies[1]+ ","+ kannadaMovies[2]+ ","+ kannadaMovies[3]+ ","+ kannadaMovies[4] + ",\n\t"
        //                        + kannadaMovies[5] + ","+ kannadaMovies[6]+ ","+ kannadaMovies[7]+ ","+ kannadaMovies[8]+ ","+ kannadaMovies[9] + ",\n\t"
        //                        + kannadaMovies[10] + ","+kannadaMovies[11]+ ","+kannadaMovies[12]+ ","+kannadaMovies[13]+ ","+kannadaMovies[14] + ",\n\t"
        //                        + kannadaMovies[15] + ","+kannadaMovies[16]+ ","+kannadaMovies[17]+ ","+kannadaMovies[18]+ ","+kannadaMovies[19] + ",\n\t"
        //                        + kannadaMovies[20] + ","+kannadaMovies[21]+ ","+kannadaMovies[22]+ ","+kannadaMovies[23]+ ","+kannadaMovies[24]);
        for(String kan:kannadaMovies){
            System.out.println(kan);
        }
        System.out.println("\nList of Tamil Movies :");
        //System.out.println("\t" + tamilMovies[0] + ","+ tamilMovies[1]+ ","+ tamilMovies[2]+ ","+ tamilMovies[3]+ ","+ tamilMovies[4] + ",\n\t"
        //                        + tamilMovies[5] + ","+ tamilMovies[6]+ ","+ tamilMovies[7]+ ","+ tamilMovies[8]+ ","+ tamilMovies[9] + ",\n\t"
        //                        + tamilMovies[10] + ","+tamilMovies[11]+ ","+tamilMovies[12]+ ","+tamilMovies[13]+ ","+tamilMovies[14] + ",\n\t"
        //                        + tamilMovies[15] + ","+tamilMovies[16]+ ","+tamilMovies[17]+ ","+tamilMovies[18]+ ","+tamilMovies[19] + ",\n\t"
        //                        + tamilMovies[20] + ","+tamilMovies[21]+ ","+tamilMovies[22]+ ","+tamilMovies[23]+ ","+tamilMovies[24]);
        for(String tam:tamilMovies){
            System.out.println(tam);
        }
        System.out.println("\nList of Telugu Movies :");
        //System.out.println("\t" + teluguMovies[0] + ","+ teluguMovies[1]+ ","+ teluguMovies[2]+ ","+ teluguMovies[3]+ ","+ teluguMovies[4] + ",\n\t"
        //                        + teluguMovies[5] + ","+ teluguMovies[6]+ ","+ teluguMovies[7]+ ","+ teluguMovies[8]+ ","+ teluguMovies[9] + ",\n\t"
        //                        + teluguMovies[10] + ","+teluguMovies[11]+ ","+teluguMovies[12]+ ","+teluguMovies[13]+ ","+teluguMovies[14] + ",\n\t"
        //                        + teluguMovies[15] + ","+teluguMovies[16]+ ","+teluguMovies[17]+ ","+teluguMovies[18]+ ","+teluguMovies[19] + ",\n\t"
        //                        + teluguMovies[20] + ","+teluguMovies[21]+ ","+teluguMovies[22]+ ","+teluguMovies[23]+ ","+teluguMovies[24]);
        for(String tel:teluguMovies){
            System.out.println(tel);
        }
        System.out.println("\nList of English Movies :");
        //System.out.println("\t" + englishMovies[0] + ","+ englishMovies[1]+ ","+ englishMovies[2]+ ","+ englishMovies[3]+ ","+ englishMovies[4] + ",\n\t"
        //                        + englishMovies[5] + ","+ englishMovies[6]+ ","+ englishMovies[7]+ ","+ englishMovies[8]+ ","+ englishMovies[9] + ",\n\t"
        //                        + englishMovies[10] + ","+englishMovies[11]+ ","+englishMovies[12]+ ","+englishMovies[13]+ ","+englishMovies[14] + ",\n\t"
        //                        + englishMovies[15] + ","+englishMovies[16]+ ","+englishMovies[17]+ ","+englishMovies[18]+ ","+englishMovies[19] + ",\n\t"
        //                        + englishMovies[20] + ","+englishMovies[21]+ ","+englishMovies[22]+ ","+englishMovies[23]+ ","+englishMovies[24]);
        for(String eng:englishMovies){
            System.out.println(eng);
        }
        System.out.println("\nList of Hindi Movies :");
        //System.out.println("\t" + hindiMovies[0] + ","+ hindiMovies[1]+ ","+ hindiMovies[2]+ ","+ hindiMovies[3]+ ","+ hindiMovies[4] + ",\n\t"
        //                        + hindiMovies[5] + ","+ hindiMovies[6]+ ","+ hindiMovies[7]+ ","+ hindiMovies[8]+ ","+ hindiMovies[9] + ",\n\t"
        //                        + hindiMovies[10] + ","+hindiMovies[11]+ ","+hindiMovies[12]+ ","+hindiMovies[13]+ ","+hindiMovies[14] + ",\n\t"
        //                        + hindiMovies[15] + ","+hindiMovies[16]+ ","+hindiMovies[17]+ ","+hindiMovies[18]+ ","+hindiMovies[19] + ",\n\t"
        //                        + hindiMovies[20] + ","+hindiMovies[21]+ ","+hindiMovies[22]+ ","+hindiMovies[23]+ ","+hindiMovies[24]);
        for(String hin:hindiMovies){
            System.out.println(hin);
        }
        
    }
}
