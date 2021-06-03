package com.company.homework6.taxes;

public class Production extends Taxes{

    public Production(int s,int taxK) {
        super(s,taxK);
    }

    public void productionTaxes() {
        System.out.println("Production tax: " + taxes());

    }
}
