package com.company.homework4.Homework6;

public class Trading extends Taxes {

    public void tradingTaxes(int earnings,int s, int taxK) {
        if (earnings < 100){
            System.out.println("Trading tax: not taxes");
        }
        else {
            System.out.println("Trading tax: " + taxes(s, taxK));
        }

    }

}
