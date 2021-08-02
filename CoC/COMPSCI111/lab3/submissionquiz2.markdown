# Quiz 2

## Multi coin support

## Coins

* BTC
* XMR

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

       public double btcPrice() {
            CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
            Map p = client.getPrice("bitcoin",Currency.USD);
            String pString = p.toString(); 
            String psClean1 = pString.replace("{bitcoin={usd=", "");
            return Double.parseDouble(psClean1.replace("}}", ""));

        } public double xmrPrice() {
            CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
            Map p = client.getPrice("monero",Currency.USD);
            String pString = p.toString(); 
            String psClean1 = pString.replace("{monero={usd=", "");
            return Double.parseDouble(psClean1.replace("}}", ""));

        }
    }
    private static class myDate {
        //Don't have one lol.
        LocalDate date = LocalDate.now();
    }
    private static class wallet {
        private double BTC = 0;
        private double XMR = 0;
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
                        ledger.ledgerArr.add("(Type: Purchase Date: " + myDate.date + " BTC: ₿" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.btcPrice() + ") ");
                        break;
                    case "sell":
                        double sold = (Double.parseDouble(plusSplit[1]) * gL.btcPrice());
                        wallet.USD = wallet.USD + sold;
                        wallet.BTC = wallet.BTC - Double.parseDouble(plusSplit[1]);
                        ledger.ledgerArr.add("(Type: Sell Date: " + myDate.date + " BTC: ₿" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.btcPrice() + ") ");                    break;
                    case "price":
                        System.out.println("Current BTC price is: $" + gL.btcPrice());
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
                        ledger.ledgerArr.add("(Type: Purchase Date: " + myDate.date + " XMR: XMR" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.xmrPrice() + ") ");
                        break;
                    case "sell":
                        double sold = (Double.parseDouble(plusSplit[1]) * gL.xmrPrice());
                        wallet.USD = wallet.USD + sold;
                        wallet.XMR = wallet.XMR - Double.parseDouble(plusSplit[1]);
                        ledger.ledgerArr.add("(Type: Sell Date: " + myDate.date + " XMR: XMR" + Double.parseDouble(plusSplit[1]) + " at USD: $" + gL.xmrPrice() + ") ");                    break;
                    case "price":
                        System.out.println("Current XMR price is: $" + gL.xmrPrice());
                        break;
                    case "balance":
                        System.out.println("USD: $" + wallet.USD);
                        System.out.println("XMR: XMR" + wallet.XMR);
                        break;
                    case "ledger":
                        System.out.println(ledger.ledgerArr);
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
```

```text
Choose coin
Coins: BTC, XMR
BTC
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>buy 4
You have bought 4 BTC
Remaining USD balance: $-26176.0
Remaining BTC balance: ₿4.0
Choose coin
Coins: BTC, XMR
BTC
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>price
Current BTC price is: $31544.0
Choose coin
Coins: BTC, XMR
XMR
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>price
Current XMR price is: $194.27
Choose coin
Coins: BTC, XMR
BTC
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>sell 2
Choose coin
Coins: BTC, XMR
BTC
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>ledger
[(Type: Purchase Date: 2021-07-15 BTC: ₿4 at USD: $31544.0) , (Type: Sell Date: 2021-07-15 BTC: ₿2.0 at USD: $31544.0) ]
Choose coin
Coins: BTC, XMR
XMR
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>buy 5
You have bought 5 XMR
Remaining USD balance: $35940.65
Remaining XMR balance: XMR5.0
Choose coin
Coins: BTC, XMR
XMR
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>sell 2
Choose coin
Coins: BTC, XMR
XMR
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>balance
USD: $36329.19
XMR: XMR3.0
Choose coin
Coins: BTC, XMR
BTC
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>balance
USD: $36329.19
BTC: ₿2.0
Choose coin
Coins: BTC, XMR
XMR
~~Menu~~

buy
sell
price
balance
ledger
help
exit

>ledger
[(Type: Purchase Date: 2021-07-15 BTC: ₿4 at USD: $31544.0) , (Type: Sell Date: 2021-07-15 BTC: ₿2.0 at USD: $31544.0) , (Type: Purchase Date: 2021-07-15 XMR: XMR5 at USD: $194.27) , (Type: Sell Date: 2021-07-15 XMR: XMR2.0 at USD: $194.27) ]
Choose coin
Coins: BTC, XMR
BTC
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
