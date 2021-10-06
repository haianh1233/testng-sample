package com.group.parameterizedtest;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {

    @DataProvider(name = "data1")
    public static Object[][] initData1() {
        return new Object[][] {
                { 1, 1 },
                { 2, 2 },
                { 3, 6 },
                { 4, 24 },
                { 5, 120 },
                { 6, 720 },
                { 7, 5040 },
                { 8 , 40320 },
                { 9 , 362880},
                { 10 , 3628800},
                { 11 , 39916800}
        };
    }
}
