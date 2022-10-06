
public class Bird extends Animal{

    private String name;
    private String color;
    Bird(int age, String group, String name, String color) {
        super(age, group);
        this.name = name;
        this.color = color;
    }
    public void set_name(String n)
    {
        name = n;
    }
    public String get_name()
    {
        return name;
    }
    public void set_color(String c)
    {
        color = c;
    }
    public String get_color()
    {
        return color;
    }
    @Override
    public void get_info()
    {
        System.out.println("name " + name );
        System.out.println("color: " + color);
    }

}
