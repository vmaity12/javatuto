import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] srgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = scanner.nextInt();
        if (value % 2 == 0) {
            System.out.println(value + " is Prime");
        } else {
            System.out.println(value + " is not Prime");
        }
        scanner.close();
    }
}