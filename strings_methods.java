public class strings_methods {
    public static void main(String[] argv){
        String myString = "Hi, I am learning Java.";

        System.out.println("length of the string is: " + myString.length());
        System.out.println("The string in upper case is: " + myString.toUpperCase());
        System.out.println("The string in lower case is: " + myString.toLowerCase());
        System.out.println("The index of \"learning\" in string is: " + myString.indexOf("learning"));
    }
    
}
 