package model;

import java.util.List;

/**
 * Created by replay on 2017. 2. 14..
 */
public class WordListModel {
    private final String action;
    private final List<WordMeanModel> wordMeanModels;

    public WordListModel(String action, List<WordMeanModel> wordMeanModels) {
        this.action = action;
        this.wordMeanModels = wordMeanModels;
    }

    public String getAction() {
        return action;
    }

    public List<WordMeanModel> getWordMeanModels() {
        return wordMeanModels;
    }
}
