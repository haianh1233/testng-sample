package com.group.grouptest;

import org.testng.annotations.Test;

public class GroupTestDemo2 {

    @Test(groups = "validate")
    public void groupTestDemo2TestCase1() {
        System.out.println("----------------------------");
        System.out.println("Group: validate");
        System.out.println("groupTestDemo2TestCase3 run");
    }
}
