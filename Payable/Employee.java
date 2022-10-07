public class Employee {
    private long cnic;
    private String name;
    private String address;
    
    public Employee(long cnic, String name,String address)
    {
        this.cnic = cnic;
        this.address = address;
        this.name = name;
    }
    public void get_info_Employee()
    {
        System.out.println("Name: "+name+", Cnic: "+cnic+", Address: "+address);
    }
}
