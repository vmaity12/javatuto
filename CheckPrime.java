import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] srgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = scanner.nextInt();
        int i = 2;
        boolean flag=false; 
        if (i == 0 || i == 1) {
            flag = false;
        }
        while (i <= value / 2) {
            if(value % i == 0)
            {
                flag = true;
                break;
            }
            ++i;
        }
        if(flag) {
            System.out.println(value + " is Prime");
        }
        else {
            System.out.println(value + " is not Prime");
        }
        scanner.close();
    }
}