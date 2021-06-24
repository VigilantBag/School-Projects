import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        //enter num and tell if >50 or not
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int num = input.nextInt();
        if (num < 50) {
            System.out.println("Your number is less than 50");
        }
        if (num > 50) {
            System.out.println("Your number is greater than 50");
        }
        if (num == 50) {
            System.out.println("Your number is 50");
        }
        input.close();
    }
}
