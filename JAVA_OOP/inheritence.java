class inheritence {
    protected String brand = "Ford"; 
    public void color()
    {
        System.out.println("Black");
    }
}
class inheritence_2 extends inheritence{
    private String model_name = "Mustang";
    public static void main(String[] args)
    {
        inheritence_2 mycar = new inheritence_2();
        mycar.color(); //  method from the first class(inheritence)

        System.out.println(mycar.brand + " " + mycar.model_name);
    }
}
