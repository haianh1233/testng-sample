package com.group.grouptest;


import org.testng.annotations.Test;

/*@Test(groups = "group1")*/
public class GroupTestDemo1 {

    //thứ tự run dựa theo tên method cấu hình bằng priority (default = 0)

    @Test(groups = "checkLogin"/*, priority = -1*/)
    public void groupTestDemo1TestCase2() {
        System.out.println("----------------------------");
        System.out.println("Group: checkLogin");
        System.out.println("groupTestDemo1TestCase2 run");
    }


    @Test(groups = "checkLogin")
    public void groupTestDemo1TestCase1() {
        System.out.println("----------------------------");
        System.out.println("Group: checkLogin");
        System.out.println("groupTestDemo1TestCase1 run");
    }



    @Test(groups = "validate")
    public void groupTestDemo1TestCase3() {
        System.out.println("----------------------------");
        System.out.println("Group: validate");
        System.out.println("groupTestDemo1TestCase3 run");
    }

    @Test(groups = "checkLogout")
    public void groupTestDemo1TestCase4() {
        System.out.println("----------------------------");
        System.out.println("Group: checkLogout");
        System.out.println("groupTestDemo1TestCase4 run");
    }

    @Test(groups = { "checkLogin", "checkLogout" , "validate" })
    public void groupTestDemo1TestCase5() {
        System.out.println("----------------------------");
        System.out.println("Group: checkLogin , checkLogout, validate");
        System.out.println("groupTestDemo1TestCase5 run");
    }

}
