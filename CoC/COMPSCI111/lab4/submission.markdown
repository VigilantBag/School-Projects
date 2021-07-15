# lab 4

```java
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {
    private static class horseArr {
            ArrayList<String> race1 = new ArrayList<String>();
            ArrayList<String> race2 = new ArrayList<String>();
            ArrayList<String> race3 = new ArrayList<String>();
            ArrayList<String> race = new ArrayList<String>();
            Date date = new Date();
            SimpleDateFormat time = new SimpleDateFormat("hh:mm a");    
        }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        horseArr hF = new horseArr();
        //System.out.println(hF.time.format(hF.date));
        System.out.println("~~Menu~~");
        System.out.println("add\nstop");
        String menu = input.nextLine();
        boolean add = true;
        switch (menu) {
            case "add":
            do {
                System.out.println("Enter race contestants");
                System.out.println("Type 'race' to show race schedule");
                System.out.println("Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)");
                String userInput = input.nextLine();
                String[] plusSplit = userInput.split("-");
                if (userInput.equals("race")) {
                    hF.race.add(hF.race1.toString() + hF.race2.toString() + hF.race3.toString());
                    System.out.println("Race Schedule");
                    System.out.println(hF.race);
                    break;
                }
                if (plusSplit[3].equals("1")) {
                    hF.race1.add("Race 1:" + hF.time.format(hF.date) + "\nHorse: " + plusSplit[0] + "\nJockey: " + plusSplit[1] + "\nJockey Weight: " + plusSplit[2] + "\n");
                }
                if (plusSplit[3].equals("2")) {
                    hF.race2.add("Race 2:" + hF.time.format(hF.date) + "\nHorse: " + plusSplit[0] + "\nJockey: " + plusSplit[1] + "\nJockey Weight: " + plusSplit[2] + "\n");
                }
                if (plusSplit[3].equals("3")) {
                    hF.race3.add("Race 3:" + hF.time.format(hF.date) + "\nHorse: " + plusSplit[0] + "\nJockey: " + plusSplit[1] + "\nJockey Weight: " + plusSplit[2] + "\n");
                }
            } while (add);
                break;
            case "stop":
                break;
            default:
                break;
        }
        input.close();

    }
}

```

```text
~~Menu~~
add
stop
add
Enter race contestants
Type 'race' to show race schedule
Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)
jack-russel-250-1
Enter race contestants
Type 'race' to show race schedule
Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)
huckleberry fin-not the book-300-1
Enter race contestants
Type 'race' to show race schedule
Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)
maybe it is-idk-267-2
Enter race contestants
Type 'race' to show race schedule
Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)
im not that-creative-156-2
Enter race contestants
Type 'race' to show race schedule
Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)
with this many-names-256-3
Enter race contestants
Type 'race' to show race schedule
Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)
finally-last one-310-3
Enter race contestants
Type 'race' to show race schedule
Format: Horse-Jockey-Jockey(weight)-race# where # is the race number (max and min of 3)
race
Race Schedule
[[Race 1:02:37 PM
Horse: jack
Jockey: russel
Jockey Weight: 250
, Race 1:02:37 PM
Horse: huckleberry fin
Jockey: not the book
Jockey Weight: 300
][Race 2:02:37 PM
Horse: maybe it is
Jockey: idk
Jockey Weight: 267
, Race 2:02:37 PM
Horse: im not that
Jockey: creative
Jockey Weight: 156
][Race 3:02:37 PM
Horse: with this many
Jockey: names
Jockey Weight: 256
, Race 3:02:37 PM
Horse: finally
Jockey: last one
Jockey Weight: 310
]]
```
