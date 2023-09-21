class CustomerTester {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerId(1);
        c1.setCustomerName("Ullas");
        c1.setDob("01/01/0001");
        c1.setAddress("Bengaluru");
        c1.setEmail("me@u.com");
        c1.setPhoneNumber(8904603936l);

        System.out.println(c1.getCustomerId());
        System.out.println(c1.getCustomerName());
        System.out.println(c1.getPhoneNumber());
        System.out.println(c1.getAddress());
        System.out.println(c1.getDob());
        System.out.println(c1.getEmail());
    }
}
