public class modifiers {
    final int x = 23;
    final double y = 3.14;

    public static void main(String[] argv)
   {
    modifiers obj1 = new modifiers();
    obj1.x = 43;          // will generate error can not modify final variable
    obj1.y = 45.12;           // will generate error, can not modify final variable
    System.out.println(obj1.x);
   } 
}
