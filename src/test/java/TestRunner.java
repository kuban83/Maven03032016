import org.testng.annotations.*;

/**
 * Created by Анна on 03.03.2016.
 */
public class TestRunner {
@BeforeTest
public void ThisIsBeforeTest(){
    System.out.println("This is out test case (before)");
}
    @BeforeMethod
    public void ThisBeforeTestMethod(){
        System.out.println( " This is before testMethod");
    }

    @AfterTest
    public void ThisIsAfterTest(){
        System.out.println("This is our test case (after");
    }
    @AfterMethod
    public void ThisAfterTestMethod (){
        System.out.println("   This is after test method");
    }

    @Test

    public void ThisIsTestMethod1 (){
        System.out.println("This Is Test Method 1");
    }

    @Test
    public void ThisIsTestMethod2 (){
        System.out.println("This Is Test Method 2");
    }
    @Test
    public void ThisIsTestMethod3 (){
        System.out.println("This Is Test Method 3");
    }


}
