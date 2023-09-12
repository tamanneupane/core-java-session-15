package oopconcept.chasebank;

public class Language {

    /*
        language id => int
        language name => String
     */

    private int languageId;
    private String languageName;

    // this = english/nepali
    public void setLanguageId(int languageId){
        this.languageId = languageId;
    }

    //this = english/nepali/french
    public int getLanguageId(){
        return this.languageId;
    }

    public String getLanguageName() {
        return this.languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}

/*
    language id - 1
    language name - English
 */

/*
    language id - 2
    language name - Nepali
 */

/*
    language id - 3
    language name - French
 */
