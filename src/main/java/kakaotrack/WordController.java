package kakaotrack;

import apiuse.TranslatorController;
import kakaotrackparser.RequestMsgParser;
import model.TranslateModel;
import model.WordCountModel;
import model.WordListModel;
import model.WordMeanModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by replay on 2017. 2. 14..
 */

@RestController
public class WordController {

    @RequestMapping("/getmean")
    public WordListModel wordListModel(@RequestParam(value = "wordList") String wordlist){

        List<WordCountModel> wordCountModelList;
        List<WordMeanModel> wordMeanModelList;
        WordListModel wordListModelList;

        RequestMsgParser requestMsgParser = new RequestMsgParser();
        wordCountModelList = requestMsgParser.parse(wordlist);

        TranslatorController translatorController = new TranslatorController();
        wordMeanModelList = translatorController.translateWord(wordCountModelList);

        wordListModelList = new WordListModel("1번동작", wordMeanModelList);

        return wordListModelList;
        //TODO

    }


    @RequestMapping("/getTranslate")
    public void translateModel(@RequestParam(value = "search") String search){
//        TranslateModel translateModel;

        //TODO

//        return translateModel;
    }
}
