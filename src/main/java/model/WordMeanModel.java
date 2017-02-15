package model;

/**
 * Created by replay on 2017. 2. 14..
 */
public class WordMeanModel {
    private final String word;
    private final String wordmean;

    public WordMeanModel(String word, String wordmean) {
        this.word = word;
        this.wordmean = wordmean;
    }

    public String getWord() {
        return word;
    }

    public String getWordmean() {
        return wordmean;
    }
}
