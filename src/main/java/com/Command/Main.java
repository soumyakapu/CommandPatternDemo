package com.Command;

import com.Command.Command.BuyStock;
import com.Command.Command.SellStock;
import com.Command.Invoker.Broker;
import com.Command.Request.Stock;

public class Main {
    public static void main(String[] args) {


    Stock abcStock = new Stock();

    BuyStock buyStockOrder = new BuyStock(abcStock);
    SellStock sellStockOrder = new SellStock(abcStock);

    Broker broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);
    broker.placeOrders();
}
}