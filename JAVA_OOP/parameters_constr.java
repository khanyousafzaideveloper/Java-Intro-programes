public class parameters_constr {
    int modelYear;
    String modelName;
  
    public parameters_constr(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      parameters_constr mobile = new parameters_constr(2020, "S1" );
      System.out.println(mobile.modelYear + " " + mobile.modelName);
    }
  }
  