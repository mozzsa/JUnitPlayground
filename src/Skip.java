import org.junit.Assume;

public class Skip {
    //if condition is false we are going to continue the test but if it is true skip the test
    public static void IF(Boolean condition) {
        Assume.assumeFalse(condition);
    }

    public static void UNLESS(Boolean condition) {
        Assume.assumeTrue(condition);
    }
}
