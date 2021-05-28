package com.company.homework4.Homework6;

public class Living extends Taxes {

    public void livingTaxes(int subsidy, int s,int taxK) {
        double sumTax = taxes(s, taxK);
        System.out.println("Living tax: " + (sumTax - ((sumTax * subsidy) / 100)));

    }

}