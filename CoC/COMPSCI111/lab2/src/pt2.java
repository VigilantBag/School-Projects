import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        //Conditioned statement for grade input
        System.out.println("Did you fail?");
        System.out.print("Input grade number: ");
        Scanner input = new Scanner (System.in);
        int grade = input.nextInt();
        if (grade >= 90) {
            System.out.println("You got an A!");
        }
        else if (grade >= 80 && grade <=89) {
            System.out.println("You got a B!");
        }
        else if (grade >= 70 && grade <= 79) {
            System.out.println("You got a C!");
        }
        else if (grade >= 60 && grade <= 69) {
            System.out.println("You got a D!");
        } else {
            System.out.println("You failed!");
        }
        input.close();
    }
}
