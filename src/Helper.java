import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Helper {

    public static Collection data() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        ArrayList<Object[]> data = new ArrayList<>();
        JSONObject rawJson = (JSONObject) parser.parse(new FileReader("src/resources/test.json"));
        Object[] keys = rawJson.keySet().toArray();
        for (Object key : keys) {
            JSONObject json = (JSONObject) rawJson.get(key);
            data.add(new Object[]{json});
        }
        return data;
    }

}
