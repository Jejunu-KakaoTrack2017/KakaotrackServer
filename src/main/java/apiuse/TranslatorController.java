package apiuse;

import model.WordCountModel;
import model.WordMeanModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by replay on 2017. 2. 15..
 * <p>
 * 단어 뜻 찾기
 */
public class TranslatorController {
    List<WordMeanModel> wordMeanModels = new ArrayList<>();

    public List<WordMeanModel> translateWord(List<WordCountModel> wordCountModels) {
        NaverTranslator naverTranslator = new NaverTranslator();

        for (int i = 0; i < wordCountModels.size(); i++) {
            String word = wordCountModels.get(i).getWord();

            String resultjson = naverTranslator.getNaverTranslate(word);

            String mean = parse(resultjson);

            wordMeanModels.add(new WordMeanModel(word, mean));

        }

        return wordMeanModels;
    }

    private String parse(String resultString) {
//        String resultString1 = " {\"message\":{\"@type\":\"response\",\"@service\":\"naverservice.labs.api\",\"@version\":\"1.0.0\",\"result\":{\"translatedText\":\" 때 패배를 알고 있었던 승리는 더욱 달콤하다.\"}}}";

        String mean = null;

        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = null;

            jsonObj = (JSONObject) jsonParser.parse(resultString);
            JSONObject jsontmp = (JSONObject) jsonObj.get("message");
            JSONObject jsonresult = (JSONObject) jsontmp.get("result");


            mean = (String) jsonresult.get("translatedText");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return mean;
    }
}
