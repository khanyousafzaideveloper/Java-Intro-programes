public class math {
    public static void main(String[] argv){
        
        System.out.println(Math.max(43, 65));
        System.out.println(Math.min(23,56));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.abs(-57));

        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.random());

        //if you want random number between 0 and 212, you can use the following formula:
        int randomNum = (int)(Math.random() * 211);  // 0 to 100

        System.out.println(randomNum);


    }
    
}
