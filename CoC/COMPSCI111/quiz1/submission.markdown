# quiz 1

## pt 1

```java
public class pt1 {
    public static void main(String[] args) {
        //print something 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("REEEEEEEEEEEEEE!");
        }
    }
}
```

```text
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
REEEEEEEEEEEEEE!
```

## pt 2

```java
import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        //enter num and tell if >50 or not
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int num = input.nextInt();
        if (num < 50) {
            System.out.println("Your number is less than 50");
        }
        if (num > 50) {
            System.out.println("Your number is greater than 50");
        }
        if (num == 50) {
            System.out.println("Your number is 50");
        }
        input.close();
    }
}
```

```text
Input a number
1
Your number is less than 50
Input a number
50
Your number is 50
Input a number
51
Your number is greater than 50
```

## pt 3

```java
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
```

```text
Enter a number
-56
The absolute value of -56 is 56
```

## pt 4

```java
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
```

```number
152
```

## pt 5

```java
public class pt5 {
    public static void main(String[] args) {
        System.out.println(Math.log(5));
    }
}
```

```number
1.6094379124341003
```

## pt 6

```java
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
```

```text
Insert a number
1
Low voltage!
Insert a number
35
Nominal voltage!
Insert a number
98
High voltage!
```

## pt 7

```java
public class pt7 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 11; i++) {
            System.out.println("REEEEEEEEEEEEEE! " + counter);
            counter++;
        }
    }
}
```

```text
REEEEEEEEEEEEEE! 0
REEEEEEEEEEEEEE! 1
REEEEEEEEEEEEEE! 2
REEEEEEEEEEEEEE! 3
REEEEEEEEEEEEEE! 4
REEEEEEEEEEEEEE! 5
REEEEEEEEEEEEEE! 6
REEEEEEEEEEEEEE! 7
REEEEEEEEEEEEEE! 8
REEEEEEEEEEEEEE! 9
REEEEEEEEEEEEEE! 10
```

## pt 8

```java
import java.util.Scanner;

public class pt8 {
    private static int a50 = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input a number");
            int num = input.nextInt();
            if (num < 50) {
                System.out.println("Your number is less than 50");
            }
            if (num > 50) {
                System.out.println("Your number is greater than 50");
                a50++;
            }
            if (num == 50) {
                System.out.println("Your number is 50");
            }
            if (num == 0) {
                System.out.println("\nYou found the secret!");
                System.out.println("You entered a number >50 [" + a50 + "] times!");
                break;
            }
        } while (true);
        input.close();
    }
}
```

```text
Input a number
50
Your number is 50
Input a number
54
Your number is greater than 50
Input a number
7
Your number is less than 50
Input a number
56
Your number is greater than 50
Input a number
78
Your number is greater than 50
Input a number
9
Your number is less than 50
Input a number
90
Your number is greater than 50
Input a number
0
Your number is less than 50

You found the secret!
You entered a number >50 [4] times!
```
