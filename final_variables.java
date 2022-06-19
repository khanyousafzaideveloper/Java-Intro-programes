public class final_variables{
    public static void main(String[] arg){
        final String country = "Srilanka";
       //  country = "Iran";  --> will generate error, can not change final variable
        
        System.out.println(country); 
    }
}