public class invoce implements Payable{
    private double unitprice;
    private int quantity;
    private String description;
    
    public invoce(double unitprice,  int quantity )
    {
        this.unitprice = unitprice;
        this.quantity = quantity;
    }

    @Override
    public void getPayableAmount(double unitprice, int quantity) {
        System.out.println("Total amount: " + (int)unitprice *  quantity );
        
    }
}
