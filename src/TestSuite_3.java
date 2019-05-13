import org.json.simple.JSONObject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import java.util.Collection;

//parametrized test
@RunWith(Parameterized.class)
public class TestSuite_3 {

    @Parameterized.Parameter
    public JSONObject json;

    @Parameterized.Parameters
    public static Collection data() throws IOException, ParseException {
        return Helper.data();
    }

    @Test
    public void test() {
        System.out.println("Test name :" + json.get("test_name"));
        System.out.println("Username :" + json.get("user_name"));
        System.out.println("Password :" + json.get("password"));
    }

}
