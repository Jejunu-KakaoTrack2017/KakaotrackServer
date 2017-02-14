package model;

import java.util.List;

/**
 * Created by replay on 2017. 2. 14..
 */
public class WordListModel {
    private final long url;
    private final List<WordListModel> wordListModel;

    public WordListModel(long url, List<WordListModel> wordListModel) {
        this.url = url;
        this.wordListModel = wordListModel;
    }

    public long getUrl() {
        return url;
    }

    public List<WordListModel> getWordListModel() {
        return wordListModel;
    }
}
