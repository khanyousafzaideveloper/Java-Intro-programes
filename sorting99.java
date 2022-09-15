public class sorting99 {
    public static void main(String[] args)
    {
        int mylist[]={32,  45, 21, 43, 56, 6, 12, 43, 21};
        
       // System.out.println(mylist.length);
        for(int x=0; x<(mylist.length-1); x++)
        {
            for(int j=0; j<=x; j++)
            { 
                if(mylist[j] > mylist[j+1])
                {
                    int temp;
                    temp = mylist[j+1];
                    mylist[j+1] = mylist[j];
                    mylist[j] = temp;
                }
            }
        }
        for(int i=0; i< (mylist.length); i++)
        {System.out.print(mylist[i] + " ");}
    }
    
}
