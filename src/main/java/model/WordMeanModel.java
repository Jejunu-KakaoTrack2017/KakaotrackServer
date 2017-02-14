package model;

/**
 * Created by replay on 2017. 2. 14..
 */
public class WordMeanModel {
    private final long word;
    private final long wordmean;

    public WordMeanModel(long word, long wordmean) {
        this.word = word;
        this.wordmean = wordmean;
    }

    public long getWord() {
        return word;
    }

    public long getWordmean() {
        return wordmean;
    }
}
