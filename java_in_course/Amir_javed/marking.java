import java.util.*;

class marking {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade of Student: A, B, C, D and F");
        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);
        System.out.println(grade);
    
}  
}
