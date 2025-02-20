import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        // System.out.println("Welcome to Java!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int value = scanner.nextInt();
        if(value < 10)
        {
            System.out.println("Value is " + value);
        }
        else{
            System.out.println("Bye");
        }
        scanner.close();
    }

}