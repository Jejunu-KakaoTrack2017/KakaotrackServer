package kakaotrack;

import kakaotrackparser.RequestMsgParser;
import model.TranslateModel;
import model.WordCountModel;
import model.WordListModel;
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
    public List<WordCountModel> wordListModel(@RequestParam(value = "wordList") String wordlist){

        List<WordCountModel> wordCountModelList;
        RequestMsgParser requestMsgParser = new RequestMsgParser();
        wordCountModelList = requestMsgParser.parse(wordlist);
        return  wordCountModelList;


        //TODO

    }


    @RequestMapping("/getTranslate")
    public void translateModel(@RequestParam(value = "search") String search){
//        TranslateModel translateModel;

        //TODO

//        return translateModel;
    }
}
