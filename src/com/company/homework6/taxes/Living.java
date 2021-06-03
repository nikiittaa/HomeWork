package com.company.homework6.taxes;

public class Living extends Taxes {
    int subsidy;
    public Living(int s,int taxK,int subsidy) {
        super(s,taxK);
        this.subsidy = subsidy;
    }

    @Override
    public double taxes() {
        return (super.taxes() - ((super.taxes() * subsidy) / 100));
    }

    public void livingTaxes() {
        System.out.println("Living tax: " + taxes());

    }

}