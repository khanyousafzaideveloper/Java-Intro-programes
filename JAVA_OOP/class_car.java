public class class_car {
    public void Speed(int x)
    {
        System.out.println("The speed of the car is: " + x);
    }

    public void color(String y)
    {
        System.out.println("The color of the car is: " + y);
    }

    public static void main(String[] argv)
    {
        class_car Some_car = new class_car();
        Some_car.Speed(200);
        Some_car.color("Blue");

    }
    
}
 