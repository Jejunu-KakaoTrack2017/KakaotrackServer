package kakaotrackparser;

import model.WordCountModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by replay on 2017. 2. 14..
 *
 *
 * 1번 기능의 리퀘스트요청을 파싱해서 WordCountModel List를 만들고 리턴한다.
 */
public class RequestMsgParser {

    List<WordCountModel> wordCountModels = new ArrayList<>();

    public List<WordCountModel> parse(String wordlist){

        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(wordlist);
            JSONArray memberArray = (JSONArray) jsonObj.get("wordlist");

            for(int i=0 ; i<memberArray.size() ; i++){
                JSONObject tempObj = (JSONObject) memberArray.get(i);
                String word = (String) tempObj.get("word");
                long S_count = (long) tempObj.get("count");
                int count = (int) S_count;

                wordCountModels.add(new WordCountModel(word, count));

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return wordCountModels;
    }

}
