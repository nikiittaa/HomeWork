package com.company.homework6.taxes;

public class Trading extends Taxes {
    int earnings;
    public Trading(int s,int taxK,int earnings) {
        super(s,taxK);
        this.earnings = earnings;
    }

    public void tradingTaxes() {
        if (earnings < 100){
            System.out.println("Trading tax: not taxes");
        }
        else {
            System.out.println("Trading tax: " + taxes());
        }

    }

}
