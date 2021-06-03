package com.company.homework6.taxes;

public class Taxes {
    int s;
    int taxK;

    public Taxes(int s,int taxK) {
        this.s = s;
        this.taxK = taxK;
    }

    public double taxes() {
        double tax = (s * taxK);
        return tax;
    }

}
