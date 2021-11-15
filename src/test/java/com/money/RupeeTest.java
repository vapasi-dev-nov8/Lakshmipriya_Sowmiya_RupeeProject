package com.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RupeeTest {

    Rupee rupee1 = new Rupee(5);
    Rupee rupee2 = new Rupee(2);
    Rupee rupee3 = new Rupee(7);
    @Test
    public void  checkMoneyValueEqualsToTheSummedUpValue()
    {
        assertEquals(rupee3.monetaryValue,(rupee1.addMoney(rupee2)).monetaryValue);
    }
    @Test
    public void  checkMoneyValueNotEqualsToTheSummedUpValue()
    {
        assertNotEquals(new Rupee(17).monetaryValue,(rupee1.addMoney(rupee2)).monetaryValue);
    }

    @Test
    public void checkTwoRupeeObjectsAreEqualBasedOnMonetaryValue(){
        assertTrue(new Rupee(5).equals(rupee1));
    }

    @Test
    public void checkTwoRupeeObjectsAreNotEqualBasedOnMonetaryValue(){
        assertFalse(new Rupee(6).equals(rupee1));
    }
}
