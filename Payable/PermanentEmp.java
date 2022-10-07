public class PermanentEmp  extends Employee{
    private int fixedSalary;

    public PermanentEmp(long cnic, String name, String address, int fixedSalary) {
        super(cnic, name, address);
        this.fixedSalary = fixedSalary;
    }

    public void get_info_Employee()
    {
        System.out.println("Name: "+ get_name() + ", Cnic: "+ get_cnic()+ ", Address: "+ get_address()+ ", Total Salary " + fixedSalary);
    }

    
    
}