package org.numerology.services;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNameNumber {

    private NameNumber nameNumber;
    @Before
    public void initTest(){
        nameNumber = new NameNumber();
    }
    @Test
    public void TestNameValue(){
        Assert.assertEquals(13,nameNumber.getNameValue("SABINA"));
    }
    @Test
    public void TestFullNameCompoundValue(){
        Assert.assertEquals(10,nameNumber.getFullNameCompoundValue("SABINA YASMIN"));
    }
}
