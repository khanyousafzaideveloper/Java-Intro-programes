import java.util.*;

import javax.lang.model.util.ElementScanner6;

class marking {
    
    public static void main(String[] args){
        double cgpa=0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade of Student: A, B, C, D and F");
        char grade = sc.next().charAt(0);
        grade = Character.toUpperCase(grade);
        System.out.println("+, - to change value and X for not changing it: ");
        char sign = sc.next().charAt(0);
        
        System.out.println(grade);
        if(grade=='A')
        {
            cgpa = 4;
            if(sign=='+'){
                cgpa = 4.0;
            }
            else if(sign =='-'){
                cgpa -= 0.3;
            }
            else{
                cgpa=4;
            }
        }
        else if(grade =='B'){
            cgpa = 3;
            if(sign=='+'){
                cgpa = +0.3;
            }
            else if(sign =='-'){
                cgpa -= 0.3;
            }
            else{
                cgpa=3;
            }
        }
        else if(grade =='C'){
            cgpa = 2;
            if(sign=='+'){
                cgpa = +0.3;
            }
            else if(sign =='-'){
                cgpa -= 0.3;
            }
            else{
                cgpa=2;
            }
        }
        else if(grade =='D'){
            cgpa = 1;
            if(sign=='+'){
                cgpa = +0.3;
            }
            else if(sign =='-'){
                cgpa -= 0.3;
            }
            else{
                cgpa=1;
            }
        }
        else{
            System.out.println('0');
        }
        System.out.println("CGPA: " + cgpa);
    }  
}
