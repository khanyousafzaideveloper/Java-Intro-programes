// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
  }
  
  // Subclass (inherit from Animal)
  class dog extends Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The dogs bark");
    }
  }
  
  class abstraction9 {
    public static void main(String[] args) {
      dog mydog = new dog(); // Create a Pig object
      mydog.animalSound();
      mydog.sleep();
    }
  }