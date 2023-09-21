class PassportApplication{
    private int applicationId;
    private String firstName;
    private String lastName;
    private String dob;
    private String pob;
    private String gender;
    private long phoneNumber;
    private String address;
    private String panCard;
    static double fees=1500.00;

    public void setApplicationId(int applicationId){
        this.applicationId=applicationId;
    }
    public int getApplicationId(){
        return applicationId;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setDob(String dob){
        this.dob=dob;
    }
    public String getDob(){
        return dob;
    }

    public void setPob(String pob){
        this.pob=pob;
    }
    public String getPob(){
        return pob;
    }

    public void setgender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    
    public void setPanCard(String panCard){
        this.panCard=panCard;
    }
    public String getPanCard(){
        return panCard;
    } 
}
