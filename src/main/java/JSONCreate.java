import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.PrintWriter;

public class JSONCreate {

    public JSONCreate() {
    }

    public void write2JSON(JSONObject object, String path) throws Exception {
        PrintWriter writer = new PrintWriter(new FileWriter(path));
        writer.write(object.toJSONString());
        writer.flush();
        writer.close();
    }
}
