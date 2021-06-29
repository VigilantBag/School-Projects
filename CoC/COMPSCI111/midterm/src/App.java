import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    //Not my best code. This is for school.
    static int choice;
    public static void main(String[] args) throws Exception{
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("Bet machine 9000");
        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Thread.sleep(1000);
        System.out.println("Bet machine 9000");
        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Thread.sleep(1000);
        System.out.println("Bet machine 9000");
        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Thread.sleep(2000);
        int winlose = 0;
        int money=200;
        int racerun=0;
        int efplace=0;
        int esplace=0;
        int ebfplace=0;
        int ebsplace=0;
        int tfplace=0;
        int tsplace=0;
        int ttplace=0;
        int tbfplace=0;
        int tbsplace=0;
        int tbtplace=0;
        int win1=5;
        int win2=5;
        int win3=5;
        int win4=5;
        int play=1;
        String hrn = "Horse numbers: [0,1,2,3]\n";
        String fph = "Choose 1st Place Horse: ";
        String sph = "Choose 2nd Place Horse: ";
        String tph = "Choose 3rd Place Horse: ";
        Integer[] arr = new Integer[4];
        Scanner input = new Scanner(System.in);
do {
    do {
                    System.out.println("~~Main Menu~~");
                    System.out.println("You have $" + money);
                    if (money <= 0) {
                        System.out.println("You have run out of money. Submitting bet.\n\n");
                        choice = 9;
                    } else {
                        System.out.println("1)    Exacta Bet ($10)");
                        System.out.println("2)    Exactabox Bet ($5)");
                        System.out.println("3)    Trifecta Bet ($25)");
                        System.out.println("4)    Trifectabox Bet ($20)");
                        System.out.println("9)    SUBMIT BET");
                        choice = input.nextInt();
                    }
;
                    switch (choice) {
                        case 1:
                            money = money-10;
                            System.out.println(hrn);
                            System.out.print(fph);
                            efplace = input.nextInt();
                            System.out.print(sph);
                            esplace = input.nextInt();
                                break;
        
                        case 2:
                            money = money-5;
                            System.out.println(hrn);
                            System.out.print(fph);
                            ebfplace = input.nextInt();
                            System.out.print(sph);
                            ebsplace = input.nextInt();
                                break;
        
                        case 3:
                            money = money-25;
                            System.out.println(hrn);
                            System.out.print(fph);
                            tfplace = input.nextInt();
                            System.out.print(sph);
                            tsplace = input.nextInt();
                            System.out.print(tph);
                            ttplace = input.nextInt();
                                break;
                        
                        case 4:
                            money = money-20;
                            System.out.println(hrn);
                            System.out.print(fph);
                            tbfplace = input.nextInt();
                            System.out.print(sph);
                            tbsplace = input.nextInt();
                            System.out.print(tph);
                            tbtplace = input.nextInt();
                                break;
        
                        case 9:
                            for (int i = 0; i < arr.length; i++) {
                                arr[i] = i;
                            }
                            Collections.shuffle(Arrays.asList(arr));
                            //System.out.println(Arrays.toString(arr));
                            win1 = arr[0];
                            win2 = arr[1];
                            win3 = arr[2];
                            win4 = arr[3];
                            racerun++;
                                break;
        
                        default:
                        System.out.println("Please choose a number from the list. Returning to Main Menu...");
                        Thread.sleep(5000);
                        System.out.print("\033[H\033[2J");  
                        System.out.flush();
                        Thread.sleep(500);
                            break;
                    }
    } while (racerun == 0);
    
            if (win1 == efplace && win2 == esplace) {
                System.out.println("YOU WON THE EXACTA BET!\n");
                money = money+100;
                winlose++;
            } 
            if ((win1 == ebfplace && win2 == ebsplace) || (win1 == ebsplace && win2 == ebfplace)) {
                System.out.println("YOU WON THE EXACTABOX BET!\n");
                money = money+50;
                winlose++;
            }
            if (win1 == tfplace && win2 == tsplace && win3 == ttplace){
                System.out.println("YOU WON THE TRIFECTA BET!\n");
                money = money+200;
                winlose++;
            }
            if ((win1 == tbfplace && win2 == tbsplace && win3 == tbtplace) || (win1 == tbsplace && win2 == tbfplace && win3 == tbtplace) || (win1 == tbtplace && win2 == tbfplace && win3 == tbsplace) || (win1 == tbfplace && win2 == tbtplace && win3 == tbsplace) || (win1 == tbsplace && win2 == tbtplace && win3 == tbfplace) || (win1 == tbtplace && win2 == tbsplace && win3 == tbfplace)){
                System.out.println("YOU WON THE TRIFECTA BOX BET!\n");
                money = money+150;
                winlose++;
            }
            else if (winlose == 0) {
                System.out.println("You lost $" + (200-money));
            }
            System.out.println("Winning positions: ");
            System.out.println("First : " + "Horse " + win1);
            System.out.println("Second: " + "Horse " + win2);
            System.out.println("Third: " + "Horse " + win3);
            System.out.println("Fourth: " + "Horse " + win4 + "\n");
            System.out.println("Final Balance: $" + money + "\n");
            if (money <= 0) {
                System.out.println("You have run out of money.");
                break;
            }
            System.out.println("Play again? (0,1)");
            play = input.nextInt();
            System.out.print("\033[H\033[2J");  
            System.out.flush();
} while (play == 1);
input.close();
    } 
}
