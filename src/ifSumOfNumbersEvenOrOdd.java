import java.util.Scanner;

public class ifSumOfNumbersEvenOrOdd {
    public static void main(String[] args) {
        int constant = 100;
        int sum = 0;
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        while (x <= constant) {
            System.out.println("Wprowadź liczbę: ");
            x = scanner.nextInt();
            if (x > constant) {
                if (sum % 2 == 0) {
                    System.out.println("Suma liczb jest parzysta");
                } else
                    System.out.println("Suma liczb jest nieparzysta");
            } else {
                sum += x;
            }
        }
    }
}
