public class break_cont {
    public static void main(String[] args)
    {
        for(int i=0; i < 5; i++)
        {
            if(i==3)
            break;
            System.out.println(i);
        } 

        System.out.println("_______________________________________________");
        
        for(int j=0; j<8; j++)
        {
            if(j==4) 
            continue;                 // it will not print when j = 4, and continue the rest.
            System.out.println(j);

        }
    
    }
    
}
