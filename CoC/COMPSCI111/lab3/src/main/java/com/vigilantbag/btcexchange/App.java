package com.vigilantbag.btcexchange;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class App {    


    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.now();
        System.out.println(Charset.defaultCharset());
        System.setProperty("file.encoding","UTF-8");
        ArrayList<String> ledger = new ArrayList<String>();
        wallet wallet = new wallet();
        boolean run = true;
        getLive gL = new getLive();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Choose coin");
            System.out.println("Coins: BTC, XMR");
            String coinChoice = input.nextLine();
            switch (coinChoice) {
                case "BTC":
                System.out.println("~~Menu~~\n");
                System.out.println("buy\nsell\nprice\nbalance\nledger\nhelp\nexit");
                System.out.print("\n>");
                //System.out.println(gL.price());
                String userInput = input.nextLine();
                String[] plusSplit = userInput.split(" ");
                switch (plusSplit[0]) {
                    case "buy":
                        double purchased = (Double.parseDouble(plusSplit[1]) * gL.btcPrice());
                        wallet.USD = wallet.USD - purchased; 
                        wallet.BTC = wallet.BTC + Double.parseDouble(plusSplit[1]);
                        System.out.println("You have bought " + plusSplit[1] + " BTC");
                        System.out.println("Remaining USD balance: $" + wallet.USD);
                        System.out.println("Remaining BTC balance: ₿" + wallet.BTC);
                        ledger.add("(Type: Purchase Date: " + date + " BTC: ₿" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.btcPrice() + ") ");
                        break;
                    case "sell":
                        double sold = (Double.parseDouble(plusSplit[1]) * gL.btcPrice());
                        wallet.USD = wallet.USD + sold;
                        wallet.BTC = wallet.BTC - Double.parseDouble(plusSplit[1]);
                        ledger.add("(Type: Sell Date: " + date + " BTC: ₿" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.btcPrice() + ") ");                    break;
                    case "price":
                        System.out.println("Current BTC price is: $" + gL.btcPrice());
                        break;
                    case "balance":
                        System.out.println("USD: $" + wallet.USD);
                        System.out.println("BTC: ₿" + wallet.BTC);
                        break;
                    case "ledger":
                        System.out.println(ledger);
                        break;
                    case "help":
                        System.out.println("buy #BTC     (amount of BTC to purchase)     Buy BTC with USD\nsell #BTC      (amount of BTC to sell)     Sell BTC for USD\nprice    Lists current BTC price in USD\nbalance     Displays balance of coins (USD and BTC)\nledger     Displays ledger of transactions");
                        break;
                    case "exit":
                        run = false;
                        break;
                    default:
                    System.out.println("Unknown choice. Returning to main menu.");
                    Thread.sleep(2000);
                        break;
                }
                    break;
                case "XMR":
                System.out.println("~~Menu~~\n");
                System.out.println("buy\nsell\nprice\nbalance\nledger\nhelp\nexit");
                System.out.print("\n>");
                //System.out.println(gL.price());
                userInput = input.nextLine();
                plusSplit = userInput.split(" ");
                switch (plusSplit[0]) {
                    case "buy":
                        double purchased = (Double.parseDouble(plusSplit[1]) * gL.xmrPrice());
                        wallet.USD = wallet.USD - purchased; 
                        wallet.XMR = wallet.XMR + Double.parseDouble(plusSplit[1]);
                        System.out.println("You have bought " + plusSplit[1] + " XMR");
                        System.out.println("Remaining USD balance: $" + wallet.USD);
                        System.out.println("Remaining XMR balance: XMR" + wallet.XMR);
                        ledger.add("(Type: Purchase Date: " + date + " XMR: XMR" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.xmrPrice() + ") ");
                        break;
                    case "sell":
                        double sold = (Double.parseDouble(plusSplit[1]) * gL.xmrPrice());
                        wallet.USD = wallet.USD + sold;
                        wallet.XMR = wallet.XMR - Double.parseDouble(plusSplit[1]);
                        ledger.add("(Type: Sell Date: " + date + " XMR: XMR" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.xmrPrice() + ") ");                    break;
                    case "price":
                        System.out.println("Current XMR price is: $" + gL.xmrPrice());
                        break;
                    case "balance":
                        System.out.println("USD: $" + wallet.USD);
                        System.out.println("XMR: XMR" + wallet.XMR);
                        break;
                    case "ledger":
                        System.out.println(ledger);
                        break;
                    case "help":
                        System.out.println("buy #XMR     (amount of XMR to purchase)     Buy XMR with USD\nsell #XMR      (amount of XMR to sell)     Sell XMR for USD\nprice    Lists current XMR price in USD\nbalance     Displays balance of coins (USD and XMR)\nledger     Displays ledger of transactions");
                        break;
                    case "exit":
                        run = false;
                        break;
                    default:
                    System.out.println("Unknown choice. Returning to main menu.");
                    Thread.sleep(2000);
                        break;
            }
            break;
                default:
                    break;
            }
            
        } while (run);
        input.close();
        System.exit(0);
    }
}
