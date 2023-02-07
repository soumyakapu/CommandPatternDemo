package com.Command.Command;

import com.Command.Request.Stock;

public class SellStock implements Order{
    private Stock intell;
    public SellStock(Stock intell){
        this.intell=intell;
    }
    @Override
    public void execute() {
    intell.sell();

    }
}
