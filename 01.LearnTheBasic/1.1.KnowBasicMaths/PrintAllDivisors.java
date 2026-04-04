import java.util.Scanner;

public class PrintAllDivisors {
    public static void printDivisors(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();


        System.out.print("Divisors: ");
        printDivisors(number);
    }
}
