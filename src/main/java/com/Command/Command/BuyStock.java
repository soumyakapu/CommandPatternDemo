package com.Command.Command;

import com.Command.Request.Stock;

public class BuyStock implements Order{
    private Stock intell;
    public BuyStock(Stock intell){
        this.intell=intell;
    }
    @Override
    public void execute() {
    intell.buy();
    }
}
