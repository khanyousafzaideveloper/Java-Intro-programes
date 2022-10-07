public class TestClass{
    public static void main(String[] args)
    {
        Invoice n = new Invoice(56.3, 2);
        ContractEmp c =new ContractEmp(231243232, "Sajid", "Street: 2 Hayatabad" , 600, 5);
        PermanentEmp p = new PermanentEmp(321243211, "Kamran", "street: 8, Town" , 20000);
        //n.getPayableAmount();
        //c.get_info_Employee();
        //p.get_info_Employee();
        System.out.println(p.getPayableAmount());
        System.out.println(n.getPayableAmount());
        System.out.println(c.getPayableAmount());


    }
}