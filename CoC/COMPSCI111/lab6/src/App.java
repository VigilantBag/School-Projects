import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            File file = new File("memes.txt");
            if (file.createNewFile()) {
              System.out.println("File created: " + file.getName());
            } else {
              System.out.println("File already exists. Writing message to file...");
              FileWriter write = new FileWriter("memes.txt", true);
              BufferedWriter bw = new BufferedWriter(write);
              bw.write("File already exists, stupid.");
              bw.newLine();
              bw.close();
              Scanner read = new Scanner(file);
              String info = read.nextLine();
              System.out.print("File text: " + info);
              read.close();
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
