package com.vigilantbag.btcexchange;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.constant.Currency;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class App {
    
    public static class getLive {

       public double price() {
            CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
            Map p = client.getPrice("bitcoin",Currency.USD);
            String pString = p.toString(); 
            String psClean1 = pString.replace("{bitcoin={usd=", "");
            double fPrice = Double.parseDouble(psClean1.replace("}}", ""));
            return fPrice;

        }
    }

    private static class wallet {
        private double BTC = 0;
        private double USD = 100000;

    }
    private static class ledger {
        ArrayList<String> ledgerArr = new ArrayList<String>();
        
    }
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.now();
        ledger ledger = new ledger();
        wallet wallet = new wallet();
        boolean run = true;
        getLive gL = new getLive();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("~~Menu~~\n");
            System.out.println("buy\nsell\nprice\nbalance\nledger\nhelp\nexit");
            System.out.print("\n>");
            //System.out.println(gL.price());
            String userInput = input.nextLine();
            String[] plusSplit = userInput.split(" ");
            switch (plusSplit[0]) {
                case "buy":
                    double purchased = (Double.parseDouble(plusSplit[1]) * gL.price());
                    wallet.USD = wallet.USD - purchased; 
                    wallet.BTC = wallet.BTC + Double.parseDouble(plusSplit[1]);
                    System.out.println("You have bought " + plusSplit[1] + " BTC");
                    System.out.println("Remaining USD balance: $" + wallet.USD);
                    System.out.println("Remaining BTC balance: ₿" + wallet.BTC);
                    ledger.ledgerArr.add("(Type: Purchase Date: " + date + " BTC: ₿" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.price() + ") ");
                    break;
                case "sell":
                    double sold = (Double.parseDouble(plusSplit[1]) * gL.price());
                    wallet.USD = wallet.USD + sold;
                    wallet.BTC = wallet.BTC - Double.parseDouble(plusSplit[1]);
                    ledger.ledgerArr.add("(Type: Sell Date: " + date + " BTC: ₿" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.price() + ") ");
                    break;
                case "price":
                    System.out.println("Current BTC price is: $" + gL.price());
                    break;
                case "balance":
                    System.out.println("USD: $" + wallet.USD);
                    System.out.println("BTC: ₿" + wallet.BTC);
                    break;
                case "ledger":
                    System.out.println(ledger.ledgerArr);
                    break;
                case "help":
                    System.out.println("buy (amount of BTC to purchase)     Buy BTC with USD\nsell (amount of BTC to sell)   Sell BTC for USD\nprice    Lists current BTC price in USD");
                    break;
                case "exit":
                    run = false;
                    break;
                default:
                System.out.println("Unknown choice. Returning to main menu.");
                Thread.sleep(2000);
                    break;
            }
        } while (run);
        input.close();
        System.exit(0);
    }
}
