package com.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RupeeTest {

    Rupee rupee1 = new Rupee(5);
    Rupee rupee2 = new Rupee(2);
    Rupee rupee3 = new Rupee(7);
    @Test
    public void  returnRupeeObjectWithAddedMonetaryValue()
    {
        assertEquals(rupee3.monetaryValue,(rupee1.addMoney(rupee2)).monetaryValue);
    }
}
