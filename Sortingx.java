public class Sortingx {
    public static void main(String[] args){
        int mylist[] = {4, 6, 8, 2, 3, 5, 7, 1};
        for(int x=1; x< (mylist.length-1); x++){ 
            for(int y=x; y>=0; y--){
                if(mylist[y+1] < mylist[y]){
                    mylist[y+1] = mylist[y];
                    
                }
                
             }

        }
        for(int w=0; w< mylist.length; w++)
        {
        System.out.println(mylist[w]);
        }
    }
}
