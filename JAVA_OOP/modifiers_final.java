public class modifiers_final {

    // final: If you don't want the ability to override existing attribute values, declare attributes as final:
    final int x = 23;
    final double y = 3.14;

    public static void main(String[] argv)
   {
    modifiers_final obj1 = new modifiers_final();
    obj1.x = 43;          // will generate error can not modify final variable
    obj1.y = 45.12;           // will generate error, can not modify final variable
    System.out.println(obj1.x);
   } 
}
