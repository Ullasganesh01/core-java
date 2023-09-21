class BankDTO {
    // DTO -- Data transfer objects -- design patterns
    private int bankId;
    private String bankName;
    private String branch;
    private int branchCode;
    private String address;
    private long helpLineNo;
    private String bankManager;
    private String ifscCode;
    private long micrCode;
    private int noOfLockers;
    private int noOfEmployees;
    private String timings;
    private String website;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public long getHelpLineNo() {
        return helpLineNo;
    }

    public void setHelpLineNo(long helpLineNo) {
        this.helpLineNo = helpLineNo;
    }

    public String getBankManager() {
        return bankManager;
    }

    public void setBankManager(String bankManager) {
        this.bankManager = bankManager;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public long getMicrCode() {
        return micrCode;
    }

    public void setMicrCode(long micrCode) {
        this.micrCode = micrCode;
    }
    public int getNoOfLockers() {
        return noOfLockers;
    }

    public void setNoOfLockers(int noOfLockers) {
        this.noOfLockers = noOfLockers;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
