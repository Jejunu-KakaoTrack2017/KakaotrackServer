package model;

/**
 * Created by replay on 2017. 2. 14..
 */
public class WordCountModel {
    private final long word;
    private final int wordcount;

    public WordCountModel(long word, int wordcount) {
        this.word = word;
        this.wordcount = wordcount;
    }

    public long getWord() {
        return word;
    }

    public int getWordcount() {
        return wordcount;
    }
}
