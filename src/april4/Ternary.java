package src.april4;

public class Ternary {

    public static void main(String args[]) {
        int numOne = 10;
        int numTwo = 5;
        int min = (numOne < numTwo) ? numOne : numTwo;
        System.out.println(min); //Output will be 5
        int max = (numOne > numTwo) ? numOne : numTwo;
        System.out.println(max); //Output will be 10
    }

}
