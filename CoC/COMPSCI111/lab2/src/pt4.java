import java.util.Random;
import java.util.Scanner;

public class pt4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int dealer;
        int player;
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
            System.out.println(calcP);
        }
        if (calcP < calcD) {
            System.out.println("Player wins");
            System.out.print("Dealer distance: ");
            System.out.println(calcP);
            System.out.print("Player distance: ");
            System.out.println(calcP);
        }
        input.close();
    }
}
