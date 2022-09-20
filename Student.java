public class Student {
        int roll;
        String name;
        double cgpa;

        void set_rollNo(int r){
            roll = r;
        }
        void set_name(String n){
            name = n;
        }
        double get_rollNo(){
            return roll;
        }
        String get_name(){
            return name;
        }
    
    public static void main(String[] args){
        Student s1 = new Student();
        s1.set_rollNo(23);
        s1.name = "ALI";
        System.out.println(s1);
        System.out.println(s1.get_rollNo());
        System.out.println(s1.get_name());
        
    }
}

