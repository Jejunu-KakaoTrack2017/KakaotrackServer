package kakaotrack;

import model.TranslateModel;
import model.WordListModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by replay on 2017. 2. 14..
 */

@RestController
public class WordController {

    @RequestMapping("/getmean")
    public WordListModel wordListModel(@RequestParam(value = "wordList") String wordlist){
//        WordListModel wordListModel;


        //TODO

//        return wordListModel;
    }


    @RequestMapping("/getTranslate")
    public TranslateModel translateModel(@RequestParam(value = "search") String search){
//        TranslateModel translateModel;

        //TODO

//        return translateModel;
    }
}
