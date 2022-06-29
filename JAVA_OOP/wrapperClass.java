public class wrapperClass{
    public static void main(String[] args) {
      Integer myInt = 5;
      Double myDouble = 5.99;
      Character myChar = 'A';
      System.out.println(myInt);
      System.out.println(myDouble);
      System.out.println(myChar);


      Integer newInt = 100;
      String myString = newInt.toString();
      System.out.println(myString.length());
    }
  }