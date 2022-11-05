//Outer class
public class MainClass {
    int x = 23;
    public int  add(int x, int y){
        return x+y;
    }
    public void show(){
        System.out.println("This is Outer class");
    }
    // inner class
    class inner{ 
        int y = 21;
        public int multiply(int x, int y){
            return x*y;
        }
    }

}
