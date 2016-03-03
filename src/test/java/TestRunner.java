import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Анна on 03.03.2016.
 */
public class TestRunner {
    @BeforeMethod
    public void ThisBeforeTestMethod(){
        System.out.println( " This is before testMethod");
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
