public class TestClass{
    public static void main(String[] args)
    {
        Payable P[] = new Payable[5]; 
        P[0] = new Invoice(300, 2, "Register");
        P[1] = new Invoice(2000, 1, "Bag");
        P[2] = new ContractEmp(1938103821, "Saim", "Street 3 Tahkal", 500, 8);
        P[3] = new ContractEmp(568954365, "Faizan", "street 2, Hayatabad", 400, 12);
        P[4] = new PermanentEmp(387360764, "Haroon", "Street 8, Town", 50000);

        for(Payable i: P){ 
            System.out.println(i.getPayableAmount());
        }
    }
}