public class Invoice implements Payable{
    private int unitprice;
    private int quantity;
    private String description;
    
    public Invoice(int unitprice,  int quantity, String description)
    {
        this.unitprice = unitprice;
        this.quantity = quantity;
        this.description = description;
    }
    public void set_unitPrice(int unitprice)
    {
        this.unitprice = unitprice;
    }
    public int get_unitPrice()
    {
        return unitprice;
    }
    public void set_quantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int get_quantity()
    {
        return quantity;
    }
    public void set_description(String description)
    {
        this.description = description;
    }
    public String get_description()
    {
        return description;
    }
    public int getPayableAmount() {
        return (unitprice *  quantity );   
    }
}
