enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
  
  public class Enum_switch{
    public static void main(String[] args) {
        for (Level myVar : Level.values()) {     //This portion prints
            System.out.println(myVar);           // all the enum values, with  
          }                                      //special function values()

      Level myVar = Level.MEDIUM;
  
      switch(myVar) {
        case LOW:
          System.out.println("Low level");
          break;
        case MEDIUM:
           System.out.println("Medium level");
          break;
        case HIGH:
          System.out.println("High level");
          break;
      }
    }
  }


