package com.vigilantbag.btcexchange;

import java.util.Map;

import com.litesoftwares.coingecko.*;
import com.litesoftwares.coingecko.constant.Currency;
import com.litesoftwares.coingecko.impl.CoinGeckoApiClientImpl;

public class getLive {

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