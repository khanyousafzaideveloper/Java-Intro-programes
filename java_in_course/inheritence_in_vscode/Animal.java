public class Animal {
    private int age;
    private String group;

    Animal(int age, String group){
        this.age = age;
        this.group = group;
    }
    
    public void get_info()
    {
        System.out.println("Age: "+age);
        System.out.println("group: "+group);
    }
}
