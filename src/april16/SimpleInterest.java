package april16;

public class SimpleInterest {

    public static void main(String[] args) {
        System.out.println("Simple Interest Calculator");
        double principal = 3250;
        double rate = 7;
        double time = 3;
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Intrest: " + simpleInterest);
    }
}
