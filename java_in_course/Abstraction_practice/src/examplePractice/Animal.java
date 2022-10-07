package examplePractice;

public class Animal extends living_things{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void move() {
		System.out.println("This is the overriden method");
	}
	
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.setName("Lion");
		a.setAge(12);
		a.setLocation("Amazon rainforest");
		System.out.println(a.getLocation()+ " " + a.getAge() + " " + a.name);
		a.move();
		
	}
	
	
}
