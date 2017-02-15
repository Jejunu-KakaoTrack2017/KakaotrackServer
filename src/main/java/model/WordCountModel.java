package model;

/**
 * Created by replay on 2017. 2. 14..
 */
public class WordCountModel {
    private final String word;
    private final int wordcount;

    public WordCountModel(String word, int wordcount) {
        this.word = word;
        this.wordcount = wordcount;
    }

    public String getWord() {
        return word;
    }

    public int getWordcount() {
        return wordcount;
    }
}
