import java.util.Scanner;

public class pt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int absolute = Math.abs(num);
        System.out.println("The absolute value of " + num + " is " + absolute);
        input.close();
    }
}
