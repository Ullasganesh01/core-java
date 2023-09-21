class Customer {
    private int customerId;
    private String customerName;
    private long phoneNumber;
    private String address;
    private String email;
    private String dob;

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public int getCustomerId(){
        return customerId;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setDob(String dob){
        this.dob =dob;
    }

    public String getDob(){
        return dob;
    }
}
