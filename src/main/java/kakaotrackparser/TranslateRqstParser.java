package kakaotrackparser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by replay on 2017. 2. 16..
 */
public class TranslateRqstParser {
    private String sentence;

    public String  parse(String request){
        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(request);
            sentence = (String) jsonObj.get("search");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return sentence;
    }
}
