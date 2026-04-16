package april16;

public class temparatureConversion {

    public static void main(String[] args) {
        double fahrenheit = 50;
        double celsius = ((fahrenheit - 32) * ((double) 5 / 9));
        System.out.println("The celsius value form fareheit value of " + fahrenheit + " is :" + celsius);
        double convertedfahereheit = ((celsius * ((double) 9 / 5)) + 32);
        System.out.println("The converted fahrenheit value for new celsius value is: " + convertedfahereheit);

    }
}
