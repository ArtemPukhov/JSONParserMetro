import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;

public class JSONParser {
    public void getStationAmount(String path) throws Exception {
        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
        Object object = parser.parse(new FileReader(path));
        JSONObject metroJsonObject = (JSONObject) object;
        JSONObject stationsObj = (JSONObject) metroJsonObject.get("stations");
        stationsObj.keySet().forEach(k -> {
            JSONArray stationsArray = (JSONArray) stationsObj.get(k);
            System.out.println("Линия № " + k + " - " + stationsArray.size() + " станций.");
        });
    }

}
