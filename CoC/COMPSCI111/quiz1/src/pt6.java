import java.util.Scanner;

public class pt6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number");
        int volt = input.nextInt();
        if (volt < 30) {
            System.out.println("Low voltage!");
        }
        else if (volt <= 60 && volt >= 30) {
            System.out.println("Nominal voltage!");
        }
        else if (volt > 60 && volt <= 100) {
            System.out.println("High voltage!");
        }
        input.close();
    }
}
