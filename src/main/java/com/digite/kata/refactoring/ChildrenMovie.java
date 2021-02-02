package com.digite.kata.refactoring;

public class ChildrenMovie implements BillGenerator {

    @Override
    public float calculateAmount(int days) {
        float amount = (float) 1.5;
        if (days > 3)
            amount += (days - 3) * 1.5;
        return amount;
    }
}
