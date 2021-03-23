package testngClass;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Login {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @Test(description = "test with login.")
    public void loginTest(){
        //Assert.fail("loginTest");
        System.out.println("test");
    }

    @Test(description = "test sendingEmail", dependsOnMethods = {"loginTest"})
    public void sendEmail(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.fail();
        softAssert.assertAll();
        System.out.println("sendEmail");

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
