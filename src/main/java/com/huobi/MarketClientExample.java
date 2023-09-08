package com.huobi;

import com.huobi.client.MarketClient;
import com.huobi.client.req.market.*;
import com.huobi.constant.HuobiOptions;
import com.huobi.constant.enums.CandlestickIntervalEnum;
import com.huobi.constant.enums.DepthLevels;
import com.huobi.constant.enums.DepthSizeEnum;
import com.huobi.constant.enums.DepthStepEnum;
import com.huobi.model.market.*;

import java.util.List;

public class MarketClientExample {

  public static void main(String[] args) {

    MarketClient marketClient = MarketClient.create(new HuobiOptions());

    String symbol = "btcusdt";

    marketClient.subMarketTrade(SubMarketTradeRequest.builder().symbol(symbol).build(), (marketTradeEvent) -> {

      System.out.println("ch:" + marketTradeEvent.getCh());
      System.out.println("ts:" + marketTradeEvent.getTs());

      marketTradeEvent.getList().forEach(marketTrade -> {
        System.out.println(marketTrade.toString());
      });

      System.out.println("-----------------------------");
    });





//    marketClient.reqMarketTrade(ReqMarketTradeRequest.builder()
//        .symbol(symbol)
//        .build(), marketTradeReq -> {
//
//      System.out.println(marketTradeReq.toString());
//    });

//    marketClient.reqMarketDetail(ReqMarketDetailRequest.builder()
//        .symbol(symbol)
//        .build(), marketDetailReq -> {
//
//      System.out.println(marketDetailReq.toString());
//    });




  }


}
