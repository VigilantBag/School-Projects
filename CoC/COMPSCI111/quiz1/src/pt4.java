import java.util.Random;

public class pt4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 200;
        int min = 100;
        int range = rand.nextInt(max + 1 - min) + min;
        System.out.println(range);
    }
}
