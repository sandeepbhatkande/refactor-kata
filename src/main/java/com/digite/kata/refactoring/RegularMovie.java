package com.digite.kata.refactoring;

public class RegularMovie implements BillGenerator {

    @Override
    public float calculateAmount(int days) {
        float amount = 2;
        if (days > 2)
            amount += (days - 2) * 1.5;
        return amount;
    }
}
