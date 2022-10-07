abstract class Employee {
    private long cnic;
    private String name;
    private String address;
    
    public Employee(long cnic, String name,String address)
    {
        this.cnic = cnic;
        this.address = address;
        this.name = name;
    }
    public void set_cnic(long cnic)
    {
        this.cnic = cnic;
    }
    public long get_cnic()
    {
        return cnic;
    }
    public void set_name(String name)
    {
        this.name = name;
    }
    public String get_name()
    {
        return name;
    }
    public void set_address(String address)
    {
        this.address = address;
    }
    public String get_address()
    {
        return address;
    }
    abstract void get_info_Employee();
}