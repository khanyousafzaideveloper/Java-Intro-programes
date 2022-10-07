public class Invoice implements Payable{
    private double unitprice;
    private int quantity;
    private String description;
    
    public Invoice(double unitprice,  int quantity )
    {
        this.unitprice = unitprice;
        this.quantity = quantity;
    }

    @Override
    public void getPayableAmount() {
        System.out.println("Total amount: " + (int)unitprice *  quantity );
        
    }
}
