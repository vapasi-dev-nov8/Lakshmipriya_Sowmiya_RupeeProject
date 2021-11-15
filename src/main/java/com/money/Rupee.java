package com.money;

public class Rupee {
    int monetaryValue;
    public Rupee(int monetaryValue)
    {
        this.monetaryValue = monetaryValue;
    }
    public Rupee addMoney(Rupee rupee)
    {
        return new Rupee(this.monetaryValue + rupee.monetaryValue);
    }

}
