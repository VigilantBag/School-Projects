import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) throws Exception {
        //Conditioned statement for age input
        System.out.println("Ticket is $14");
        System.out.println("What is your age?");
        Scanner age = new Scanner(System.in);
        int dage = age.nextInt();
        if (dage < 18) {
            System.out.println("Discount for minors! Ticket price is only $10");
        }
        else if (dage >= 65) {
            System.out.println("Discount for seniors! Ticket price is only $10");
        } else {
            System.out.println("No discount, now pay up.");
        }
        age.close();
    }
}
