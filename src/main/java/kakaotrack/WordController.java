package kakaotrack;

import apiuse.TranslatorController;
import kakaotrackparser.RequestMsgParser;
import kakaotrackparser.TranslateRqstParser;
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
    }


    @RequestMapping("/getTranslate")
    public TranslateModel translateModel(@RequestParam(value = "search") String search){
        TranslateModel translateModel;


        TranslateRqstParser translateRqstParser = new TranslateRqstParser();
        String rqst = translateRqstParser.parse(search);

        TranslatorController translatorController = new TranslatorController();
        String mean = translatorController.translateSentence(rqst);

        translateModel = new TranslateModel("2번동작", mean);

        return translateModel;
    }
}
