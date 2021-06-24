import java.util.Random;
import java.util.Scanner;

public class pt5 {
    private static int dealer;
    private static int player;
    private static int pscore = 0;
    private static int dscore = 0;
    public static void main(String[] args) {
        final Random rand = new Random();
        final Scanner input = new Scanner(System.in);
        do {
        int rand1 = rand.nextInt(101);
        dealer = rand1;
        System.out.println("Enter a value between 0 and 100");
        player = input.nextInt();
        int compare = 21;
        long calcD = Math.abs((long) dealer - compare);
        long calcP = Math.abs((long) player - compare);
        if (calcD < calcP) {
            System.out.println("Dealer wins");
            System.out.print("Dealer distance: ");
            System.out.println(calcD);
            System.out.print("Player distance: ");
            System.out.println(calcP + "\n");
            dscore ++;
        }
        if (calcP < calcD) {
            System.out.println("Player wins");
            System.out.print("Dealer distance: ");
            System.out.println(calcD);
            System.out.print("Player distance: ");
            System.out.println(calcP + "\n");
            pscore ++;
        }
        if (calcP == 0) {
            input.close();
            System.out.println("\n\nYou found the magic number!\n");
            System.out.println("Dealer won " + dscore + " times.");
            System.out.println("You won " + pscore + " times.\n");
            break;
        }
        } while (true);
        
    }
}
