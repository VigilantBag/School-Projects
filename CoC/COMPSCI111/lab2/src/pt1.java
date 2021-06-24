import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        //Conditioned statement for age input
        System.out.println("Ticket is $14");
        System.out.println("What is your age?");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("Discount for minors! Ticket price is only $10");
        }
        else if (age >= 65) {
            System.out.println("Discount for seniors! Ticket price is only $10");
        } else {
            System.out.println("No discount, now pay up.");
        }
        input.close();
    }
}
