package model;

import java.util.List;

/**
 * Created by replay on 2017. 2. 14..
 */
public class WordListModel {
    private final long url;
    private final List<WordMeanModel> wordMeanModels;

    public WordListModel(long url, List<WordMeanModel> wordMeanModels) {
        this.url = url;
        this.wordMeanModels = wordMeanModels;
    }

    public long getUrl() {
        return url;
    }

    public List<WordMeanModel> getWordMeanModels() {
        return wordMeanModels;
    }
}
