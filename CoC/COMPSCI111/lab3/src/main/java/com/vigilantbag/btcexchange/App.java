package com.vigilantbag.btcexchange;

import java.util.Map;

import com.litesoftwares.coingecko.CoinGeckoApiClient;
import com.litesoftwares.coingecko.constant.Currency;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class App {
    private static class getLive {

       private String price () {
            CoinGeckoApiClient client = new CoinGeckoApiClientImpl();
            Map p = client.getPrice("bitcoin",Currency.USD);
            String pString = p.toString(); 
            String psClean1 = pString.replace("{bitcoin={usd=", "");
            return psClean1.replace("}}", "");
        }

    }
    public static void main(String[] args) {
        getLive gL = new getLive();

        System.out.println(gL.price());
        
    }
}
