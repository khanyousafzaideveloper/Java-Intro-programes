public class Student {
        int roll;
        String name;
        double cgpa;

        Student(){}
        Student(int r, double c, String n){
            roll = r;
            cgpa = c;
            name = n;
        }
        void show_info(){
            System.out.println(roll);
            System.out.println(cgpa);
            System.out.println(name);
        }

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
        Student s2 = new Student(4 , 3.5, "ALi");
        s2.show_info();
        System.out.println("_______________________________\n");
        s1.set_rollNo(23);
        s1.name = "ALI";
        System.out.println(s1);
        System.out.println(s1.get_rollNo());
        System.out.println(s1.get_name());

    }
}

