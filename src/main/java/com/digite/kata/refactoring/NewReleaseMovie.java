package com.digite.kata.refactoring;

public class NewReleaseMovie implements BillGenerator {
    @Override
    public float calculateAmount(int days) {
        return  days * 3;
    }
}
