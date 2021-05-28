package com.company.homework4.Homework6;

public class TestTaxes{
    public static void main(String[] args) {
        Living living = new Living();
        living.livingTaxes(20,17,11);

        Trading trading = new Trading();
        trading.tradingTaxes(29,100,295);

        Production production = new Production();
        production.productionTaxes(10000,500);

    }

}
