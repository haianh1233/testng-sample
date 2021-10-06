package com.group.databasetest;

import com.group.database.Student;
import com.group.database.StudentDAO;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.group.databasetest.DatabaseTestDemoConfig.studentDAO;

public class DatabaseTestDemo {

    /*@BeforeClass
    public void beforeClass() {
        System.out.println("Before class beforeClass()");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Before class beforeClass()");
    }

    //run before each method
    @BeforeMethod
    public void setup() {
        System.out.println("Before method setup()");
        studentDAO.initDB();
    }

    //run after each method
    @AfterMethod
    public void restore() {
        System.out.println("After method restore()");
        studentDAO.initDB();
    }*/

    @Test
    public void showAllStudentTest() {
        studentDAO.showAllStudent();
    }

    /*@Test
    public void removeStudentTest1() {
        Assert.assertTrue(studentDAO.removeStudentByName("Trong"));
    }

    @Test
    public void removeStudentTest2() {
        Assert.assertTrue(studentDAO.removeStudentByName("Trong"));
    }
*/
}
