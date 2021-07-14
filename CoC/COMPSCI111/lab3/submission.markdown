# Lab 3

```java
package com.vigilantbag.btcexchange;

import java.nio.charset.Charset;
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
            return Double.parseDouble(psClean1.replace("}}", ""));

        }
    }
    private static class myDate {
        //Don't have one lol.
        LocalDate date = LocalDate.now();
    }
    private static class wallet {
        private double BTC = 0;
        private double USD = 100000;

    }
    private static class ledger {
        ArrayList<String> ledgerArr = new ArrayList<String>();
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println(Charset.defaultCharset());
        System.setProperty("file.encoding","UTF-8");
        myDate myDate = new myDate();
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
                    System.out.println("Remaining BTC balance: ฿" + wallet.BTC);
                    ledger.ledgerArr.add("(Type: Purchase Date: " + myDate.date + " BTC: ฿" + " at USD: $" + gL.price() + ") ");
                    break;
                case "sell":
                    double sold = (Double.parseDouble(plusSplit[1]) * gL.price());
                    wallet.USD = wallet.USD + sold;
                    wallet.BTC = wallet.BTC - Double.parseDouble(plusSplit[1]);
                    ledger.ledgerArr.add("(Type: Sell Date: " + myDate.date + " BTC: ₿" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.price() + ") ");                    break;
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
        } while (run);
        input.close();
        System.exit(0);
    }
}
```

```text
~~Menu~~

buy 
sell
price
balance
ledger
help
exit

>price
Current BTC price is: $32938.0
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>buy 2
You have bought 2 BTC
Remaining USD balance: $34124.0
Remaining BTC balance: ฿2.0
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>sell 1
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>help
buy #BTC     (amount of BTC to purchase)     Buy BTC with USD
sell #BTC      (amount of BTC to sell)     Sell BTC for USD
price    Lists current BTC price in USD
balance     Displays balance of coins (USD and BTC)
ledger     Displays ledger of transactions
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>balance
USD: $67062.0
BTC: ₿1.0
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>ledger
[(Type: Purchase Date: 2021-07-14 BTC: ฿ at USD: $32938.0) , (Type: Sell Date: 2021-07-14 BTC: ₿1.0 at USD: $32938.0) ]
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>exit
```
