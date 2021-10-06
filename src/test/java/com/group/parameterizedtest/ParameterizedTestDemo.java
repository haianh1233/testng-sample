package com.group.parameterizedtest;

import com.group.parameterized.MathUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.group.parameterized.MathUtil.getFactorial;

public class ParameterizedTestDemo {

    @Test
    @Parameters({ "parameter1", "parameter2" })
    public void parameterTest(String parameter1, String parameter2) {
        System.out.println("------------");
        System.out.println(parameter1);
        System.out.println(parameter2);
        System.out.println("------------");
        Assert.assertEquals(parameter1, "This is parameter 1");
        Assert.assertEquals(parameter2, "This is parameter 2");
    }

    @Test(
            dataProvider = "data1",
            dataProviderClass = DataProviderDemo.class
    )
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected) {
        Assert.assertEquals(getFactorial(n), expected);
    }

    @Test(expectedExceptions = { IllegalArgumentException.class })
    public void testFactorialWithWrongArgumentThrowException() {
        getFactorial(-5);
    }


}
