import java.util.Scanner;

public class pt6 {
    public static void main(String[] args) {
        //Have user enter a number, then double it
        System.out.println("Enter a number");
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        System.out.println("Double " + number + " = " + (number * 2));
        input.close();
    }    
}