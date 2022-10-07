public class TestClass{
    public static void main(String[] args)
    {
        Invoice n = new Invoice(56.3, 2);
        Employee e = new Employee(1919199121, "Dhani", "Street:23, Tahkal");
        ContractEmp c =new ContractEmp(231243232, "Sajid", "Street: 2 Hayatabad" , 600, 5);
        n.getPayableAmount();
        e.get_info_Employee();
        c.get_info_Employee();

    }
}