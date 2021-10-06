package com.group.dependencytest;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardDependencyDemo {

    @Test(testName = "HardDependencyTestCase1")
    public void HardDependencyTestCase1() {
        System.out.println("------------");
        System.out.println("HardDependencyTestCase1 run");
        Assert.assertTrue(false);
    }

    //Depend on method , always run = true => soft dependency
    @Test(testName = "HardDependencyTestCase2", dependsOnMethods = { "HardDependencyTestCase1" } , alwaysRun = true )
    public void HardDependencyTestCase2() {
        System.out.println("------------");
        System.out.println("HardDependencyTestCase2 run");
    }

    @Test(groups = { "HardDependencyGroupTest" })
    public void HardDependencyTestCase3() {
        System.out.println("------------");
        System.out.println("HardDependencyTestCase3 run");
    }

    @Test(groups = { "HardDependencyGroupTest" })
    public void HardDependencyTestCase4() {
        System.out.println("------------");
        System.out.println("HardDependencyTestCase4 run");
        Assert.assertTrue(false);
    }

    //Depend on group
    @Test(dependsOnGroups = { "HardDependencyGroupTest" })
    public void HardDependencyTestCase5() {
        System.out.println("------------");
        System.out.println("HardDependencyTestCase5 run");
    }

}
