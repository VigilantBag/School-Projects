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
        long calcA = Math.abs((long) dealer - compare);
        long calcB = Math.abs((long) player - compare);
        if (calcA < calcB) {
            System.out.println("Dealer wins");
            System.out.print("Dealer distance: ");
            System.out.println(calcA);
            System.out.print("Player distance: ");
            System.out.println(calcB);
        }
        if (calcB < calcA) {
            System.out.println("Player wins");
            System.out.print("Dealer distance: ");
            System.out.println(calcA);
            System.out.print("Player distance: ");
            System.out.println(calcB);
        }
        input.close();
    }
}
