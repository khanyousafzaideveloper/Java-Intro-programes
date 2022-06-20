public class ifElse{
    public static void main(String[] argv)
    {
        if(23>12)
        {
            System.out.println("23 is greater then 12");
        }
        else
        System.out.print("12 is greater than 23");
    
        int marks= 78;
    
        if(marks >= 85){
            System.out.println("Grade A");}
    
        else if(marks >= 75){
            System.out.println("Grade B");}
    
        else if(marks >= 65){
            System.out.println("Grade C");}
    
        else if(marks >= 50){
            System.out.println("Grade D");}
    
        else
        System.out.println("Try Again");    
    }
}