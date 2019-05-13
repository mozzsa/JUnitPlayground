import org.junit.BeforeClass;
import org.junit.Test;

public class TestSuite_2 extends TestRules {

    /*
    @BeforeClass
    public static void beforeClass(){
        Skip.IF(true);//ignore all
    }*/

    @Test
    public void test1() {
        Skip.IF(true);//should be skip this method
        System.out.println("I am test 1");
    }

    @Test
    public void test2() {
        Skip.IF(false);//should run this method
        System.out.println("I am test 2");
    }

}
