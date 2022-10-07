import java.util.jar.Attributes.Name;

public class ContractEmp extends Employee implements Payable {

    private int dailywage;
    private int noOfDaysWorked;

    public ContractEmp(long cnic, String name, String address, int dailywage, int noOfDaysWorked) {
        super(cnic, name, address);
        this.dailywage = dailywage;
        this.noOfDaysWorked = noOfDaysWorked;
    }
    
    public void get_info_Employee()
    {
        System.out.println("Name: "+ get_name() + ", Cnic: "+ get_cnic()+ ", Address: "+ get_address()+ ", Total pay: " + dailywage*noOfDaysWorked);
    
    }
    public int getPayableAmount()
    {
        return (dailywage*noOfDaysWorked);
    }
}