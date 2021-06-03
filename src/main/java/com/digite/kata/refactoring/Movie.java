package com.digite.kata.refactoring;

public class Movie implements PriceCalculater{
    private String _title;
    private int _priceCode;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }

    public double calculateAmt(int daysRented)
    {
        return daysRented;
    }

    public int AddBonusPoint(int a_existingBonus, int daysRented)
    {
        a_existingBonus++;
        return a_existingBonus;
    }

}