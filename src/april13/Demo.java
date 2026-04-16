package april13;

/*public class Demo {

    private static void main(String[] args) {
        System.out.println("Hello World");
    }
}*/
 /*Error: Main method not found in class Demo, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application */
 /*I should get the above error  for the above code cuz i have used private so that JVM Cannot access the code and I am getting that. */
//BUT THE  CORRECT CODE IS 
public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
