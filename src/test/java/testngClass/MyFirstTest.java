package testngClass;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class MyFirstTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @Test(description = "test with hard assert.")
    public void hardAssertTest(){
        Assert.fail("hardAssertTest");
        System.out.println("test");
    }

    @Test(description = "test with hard assert.", dependsOnMethods = {"hardAssertTest"})
    public void softAssertTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.fail();
        softAssert.assertAll();
        System.out.println("prueba");

    }

    @AfterClass
    public void afterClass(){
        System.out.printf("after class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.printf("After method");
    }

}
