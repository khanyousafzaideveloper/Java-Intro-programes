import java.util.*;

class marking {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade of Student: A, B, C, D and F");
        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);
        System.out.println("+, - to change value and X for not changing it: ");
        char sign = sc.next().charAt(0);
        
        System.out.println(grade);
        if(grade=='A')
        {
            System.out.println(4);
        }
        else if(grade =='B'){
            System.out.println(3);
        }
        else if(grade =='C'){
            System.out.println(2);
        }
        else if(grade =='D'){
            System.out.println(1);
        }
        else{
            System.out.println('0');
        }
}  
}
