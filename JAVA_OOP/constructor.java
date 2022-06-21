public class constructor{
    int x;

    constructor(){
        x=5;
    }
    public static void main(String[] argv)
    {
        constructor obj1 = new constructor();
        System.out.println(obj1.x);
    }
} 