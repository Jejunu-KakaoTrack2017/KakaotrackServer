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
            System.out.println(resultjson);

            String mean = parse(resultjson);
            System.out.println(mean);

            wordMeanModels.add(new WordMeanModel(word, mean));
        }

        return wordMeanModels;
    }

    private String parse(String resultString) {

        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(resultString);
            JSONObject translatedInfo = (JSONObject) jsonObject.get("message");
            JSONObject translatedKorean = (JSONObject) translatedInfo.get("result");

            String mean = translatedKorean.get("translatedText").toString();

            return mean;
        } catch (ParseException e) {
            e.printStackTrace();

            return "뭐지?";
        }
    }
}
