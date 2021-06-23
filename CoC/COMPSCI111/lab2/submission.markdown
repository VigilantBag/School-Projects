# Lab 2

## pt 1

```java
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) throws Exception {
        //Conditioned statement for age input
        System.out.println("Ticket is $14");
        System.out.println("What is your age?");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("Discount for minors! Ticket price is only $10");
        }
        else if (age >= 65) {
            System.out.println("Discount for seniors! Ticket price is only $10");
        } else {
            System.out.println("No discount, now pay up.");
        }
        input.close();
    }
}
```

res:

```text
What is your age?
14
Discount for minors! Ticket price is only $10
```

## pt 2

```java
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
```

res:

```text
Did you fail?
Input grade number: 78
You got a C!
```

## pt 3

```java
public class pt3 {
    public static void main(String[] args) {
        int i;
        System.out.println("How");
        for (i = 0; i < 5; i++) {
            System.out.println("low");
        }
        System.out.println("can you");
        i = 0;
        while (i < 5) {
            i++;
            System.out.println("go");
        }
    }
}
```

res:

```text
How
low
low
low
low
low
can you
go
go
go
go
go
```

## pt 4

```java
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
            System.out.println(calcD);
            System.out.print("Player distance: ");
            System.out.println(calcP);
        }
        input.close();
    }
}
```

res:

```text
Enter a value between 0 and 100
50
Player wins        
Dealer distance: 52
Player distance: 29
```

## pt 5

```java
import java.util.Random;
import java.util.Scanner;

public class pt5 {
    public static int dealer;
    public static int player;
    public static int pscore = 0;
    public static int dscore = 0;
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
            System.out.println(calcP);
            dscore ++;
        }
        if (calcP < calcD) {
            System.out.println("Player wins");
            System.out.print("Dealer distance: ");
            System.out.println(calcD);
            System.out.print("Player distance: ");
            System.out.println(calcP);
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
```

res:

```text
Enter a value between 0 and 100
2
Player wins
Dealer distance: 66
Player distance: 19

Enter a value between 0 and 100
5
Player wins
Dealer distance: 34
Player distance: 16

Enter a value between 0 and 100
76
Dealer wins
Dealer distance: 42
Player distance: 55

Enter a value between 0 and 100
7
Player wins
Dealer distance: 36
Player distance: 14

Enter a value between 0 and 100
4
Player wins
Dealer distance: 68
Player distance: 17

Enter a value between 0 and 100
3
Player wins
Dealer distance: 76
Player distance: 18

Enter a value between 0 and 100
2
Player wins
Dealer distance: 43
Player distance: 19

Enter a value between 0 and 100
21
Player wins
Dealer distance: 38
Player distance: 0



You found the magic number!

Dealer won 1 times.
You won 7 times.
```
