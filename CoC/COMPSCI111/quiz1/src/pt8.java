import java.util.Scanner;

public class pt8 {
    private static int a50 = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input a number");
            int num = input.nextInt();
            if (num < 50) {
                System.out.println("Your number is less than 50");
            }
            if (num > 50) {
                System.out.println("Your number is greater than 50");
                a50++;
            }
            if (num == 50) {
                System.out.println("Your number is 50");
            }
            if (num == 0) {
                System.out.println("\nYou found the secret!");
                System.out.println("You entered a number >50 [" + a50 + "] times!");
                break;
            }
        } while (true);
        input.close();
    }
}
