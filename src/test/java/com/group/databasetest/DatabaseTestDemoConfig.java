package com.group.databasetest;

import com.group.database.StudentDAO;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DatabaseTestDemoConfig {

    protected static StudentDAO studentDAO;

    /*@BeforeMethod*/
    @BeforeSuite
    public void setupSuite() {
        System.out.println("Setup suite");
        studentDAO = new StudentDAO();
        studentDAO.initDB();
    }

    @AfterSuite
    public void teardownSuite() {
        System.out.println("Teardown suite");
    }
}
