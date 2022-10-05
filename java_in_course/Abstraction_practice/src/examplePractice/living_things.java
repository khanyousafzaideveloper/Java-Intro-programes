package examplePractice;

public abstract class living_things {
	private String location;


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public abstract void move();
	
}
