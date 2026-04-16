package april14;

public class Logical {

    public static void main(String args[]) {
        int numOne = 100;
        int numTwo = 20;
        int numThree = 30;
        System.out.println(numOne > numTwo && numOne > numThree); //Output will be true
        System.out.println(numOne > numTwo && numOne < numThree); // Output will be false
        System.out.println(!(numThree > numOne)); //Output will be true
    }

}
