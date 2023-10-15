import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit.");
                break;
            } else {
                String invalidInput = scanner.next();
                System.out.println("No good. Please enter a valid number in celsius.");
            }
        } while (true);

        scanner.close();
    }
}