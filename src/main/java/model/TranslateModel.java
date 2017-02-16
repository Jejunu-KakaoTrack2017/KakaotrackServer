package model;

/**
 * Created by replay on 2017. 2. 14..
 */
public class TranslateModel {
    private final String action;
    private final String translate;

    public TranslateModel(String action, String translate) {
        this.action = action;
        this.translate = translate;
    }

    public String getAction() {
        return action;
    }

    public String getTranslate() {
        return translate;
    }
}
