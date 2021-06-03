package com.company.homework6.taxes;

public class TestTaxes{
    public static void main(String[] args) {
        Living living = new Living(17,11,20);
        living.livingTaxes();

        Trading trading = new Trading(100,295,29);
        trading.tradingTaxes();

        Production production = new Production(10000,500);
        production.productionTaxes();

    }

}
