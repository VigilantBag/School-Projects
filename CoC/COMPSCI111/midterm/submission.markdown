# MIDTERM

## Code

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class App {
    //Not my best code. This is for school.
    private static final String CLS = "\033[H\033[2J";
    private static final String BM9 = "Bet Machine 9000";
    private static final String HORSE = "horse";
    private static int choice;
    public static void main(String[] args) throws Exception{
        System.out.print(CLS);  
        System.out.flush(); 
        System.out.println(BM9);
        Thread.sleep(1000);
        System.out.print(CLS);  
        System.out.flush(); 
        Thread.sleep(1000);
        System.out.println(BM9);
        Thread.sleep(1000);
        System.out.print(CLS);  
        System.out.flush(); 
        Thread.sleep(1000);
        System.out.println(BM9);
        Thread.sleep(1000);
        System.out.print(CLS);  
        System.out.flush();
        Thread.sleep(2000);
        int winlose = 0;
        int horserun=4;
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
        int cheat=0;
        int operator=0;
        String fph = "Choose 1st Place Horse: ";
        String sph = "Choose 2nd Place Horse: ";
        String tph = "Choose 3rd Place Horse: ";
        Scanner input = new Scanner(System.in);
do {
    do {
                    System.out.println("~~Main Menu~~");
                    Integer[] arr = new Integer[horserun];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = i;
                    }
                    String hrn = "Horses: " + Arrays.toString(arr);
                    System.out.println("You have $" + money);
                    if (money <= 0) {
                        System.out.println("You have run out of money. Submitting bet.\n\n");
                        choice = 9;
                    } else {
                        System.out.println("1)    Exacta Bet ($10)");
                        System.out.println("2)    Exactabox Bet ($5)");
                        System.out.println("3)    Trifecta Bet ($25)");
                        System.out.println("4)    Trifectabox Bet ($20)");
                        System.out.println("8)    Operator Menu");
                        System.out.println("9)    SUBMIT BET");
                        choice = input.nextInt();
                    }

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
                        case 8:

                            if (cheat == 0) {
                                System.out.println("This race's results:");
                                for (int i = 0; i < arr.length; i++) {
                                    arr[i] = i;
                                }
                                Collections.shuffle(Arrays.asList(arr));
                                System.out.println(Arrays.toString(arr));
                                win1 = arr[0];
                                win2 = arr[1];
                                win3 = arr[2];
                                win4 = arr[3];
                                System.out.println("1)    Add/Subtract Contestants");
                                System.out.println("9)    Return to main menu");
                                operator = input.nextInt();
                                if (operator==1) {
                                    System.out.print("Input number of horses: ");
                                    horserun = input.nextInt();
                                    arr = new Integer[horserun];
                                    for (int i = 0; i < arr.length; i++) {
                                        arr[i] = i;
                                    }
                                }
                                break;
                            } else {
                                System.out.println("This race's results:");
                                System.out.println(Arrays.toString(arr));
                                cheat = 1;
                                break;
                            }
                            
        
                        case 9:
                        if (cheat == 0) {
                            
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
                            
                        }else{
                            racerun++;
                        }        break;
        
                        default:
                        System.out.println("Please choose a number from the list. Returning to Main Menu...");
                        Thread.sleep(5000);
                        System.out.print(CLS);  
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
            if (winlose == 0) {
                System.out.println("You lost $" + (200-money));
            }
            System.out.println("Winning positions: ");
            System.out.println("First : " + HORSE + win1);
            System.out.println("Second: " + HORSE + win2);
            System.out.println("Third: " + HORSE + win3);
            System.out.println("Fourth: " + HORSE + win4 + "\n");
            System.out.println("Final Balance: $" + money + "\n");
            if (money <= 0) {
                System.out.println("You have run out of money.");
                break;
            }
            System.out.println("Play again? (0,1)");
            play = input.nextInt();
             winlose = 0;
             racerun=0;
             efplace=0;
             esplace=0;
             ebfplace=0;
             ebsplace=0;
             tfplace=0;
             tsplace=0;
             ttplace=0;
             tbfplace=0;
             tbsplace=0;
             tbtplace=0;
             win1=5;
             win2=5;
             win3=5;
             win4=5;
             cheat=0;
            System.out.print(CLS);  
            System.out.flush();
} while (play == 1);
input.close();
    } 
}
```

## Terminal

```text
~~Main Menu~~
You have $200
1)    Exacta Bet ($10)     
2)    Exactabox Bet ($5)   
3)    Trifecta Bet ($25)   
4)    Trifectabox Bet ($20)
8)    Operator Menu        
9)    SUBMIT BET
1
Horses: [0, 1, 2, 3]    
Choose 1st Place Horse: 1
Choose 2nd Place Horse: 2
~~Main Menu~~
You have $190
1)    Exacta Bet ($10)
2)    Exactabox Bet ($5)
3)    Trifecta Bet ($25)
4)    Trifectabox Bet ($20)
8)    Operator Menu
9)    SUBMIT BET
4
Horses: [0, 1, 2, 3]
Choose 1st Place Horse: 1
Choose 2nd Place Horse: 2
Choose 3rd Place Horse: 3
~~Main Menu~~
You have $170
1)    Exacta Bet ($10)
2)    Exactabox Bet ($5)
3)    Trifecta Bet ($25)
4)    Trifectabox Bet ($20)
8)    Operator Menu
9)    SUBMIT BET
9
~~Main Menu~~
You have $320
1)    Exacta Bet ($10)
2)    Exactabox Bet ($5)
3)    Trifecta Bet ($25)
4)    Trifectabox Bet ($20)
8)    Operator Menu
9)    SUBMIT BET
8
This race's results:
[2, 1, 3, 0]
1)    Add/Subtract Contestants
9)    Return to main menu     
1
Input number of horses: 10
~~Main Menu~~
You have $320
1)    Exacta Bet ($10)
2)    Exactabox Bet ($5)
3)    Trifecta Bet ($25)
4)    Trifectabox Bet ($20)
8)    Operator Menu
9)    SUBMIT BET
8
This race's results:
[8, 7, 1, 3, 4, 0, 9, 5, 6, 2]
1)    Add/Subtract Contestants
9)    Return to main menu
9
~~Main Menu~~
You have $320
1)    Exacta Bet ($10)
2)    Exactabox Bet ($5)
3)    Trifecta Bet ($25)
4)    Trifectabox Bet ($20)
8)    Operator Menu
9)    SUBMIT BET
1
Horses: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Choose 1st Place Horse: 8
Choose 2nd Place Horse: 7
~~Main Menu~~
You have $310
1)    Exacta Bet ($10)
2)    Exactabox Bet ($5)
3)    Trifecta Bet ($25)
4)    Trifectabox Bet ($20)
8)    Operator Menu
9)    SUBMIT BET
3
Horses: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Choose 1st Place Horse: 8
Choose 2nd Place Horse: 7
Choose 3rd Place Horse: 1
~~Main Menu~~
You have $285
1)    Exacta Bet ($10)
2)    Exactabox Bet ($5)
3)    Trifecta Bet ($25)
4)    Trifectabox Bet ($20)
8)    Operator Menu
9)    SUBMIT BET
9
YOU WON THE EXACTA BET!

YOU WON THE TRIFECTA BET!

Winning positions:
First : horse 8
Second: horse 7
Third: horse 1
Fourth: horse 3

Final Balance: $585

Play again? (0,1)
0
```
