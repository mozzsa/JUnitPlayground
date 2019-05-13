import org.junit.runner.Description;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.rules.TestRule;

public class TestRules {
    @Rule
    public Retry retry = new Retry(3); // How many times it is going to try if test failed.
    @Rule
    public TestRule listen = new TestWatcher() {
        @Override
        public void failed(Throwable t, Description description) {
            // Logic for handling failed tests
            System.out.println("Test" + description.getMethodName() + "FAILED");
        }

        @Override
        public void succeeded(Description description) {
            // Logic for handling passed tests
            System.out.println("Test" + description.getMethodName() + "PASSED");
        }

    };

    //must be static method
    @BeforeClass
    public static void beforeClass() {
        System.out.println("1 I am beforeClass method ");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("1 I am afterClass method");
    }

    @Before
    public void before() {
        System.out.println("1 I am before");
    }

    @After
    public void after() {
        System.out.println("1 I am after");
    }
}
