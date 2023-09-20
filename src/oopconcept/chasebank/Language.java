package oopconcept.chasebank;

public class Language {

    /*
        language id => int
        language name => String
     */

    private int languageId;
    private String languageName;

    // Default Constructor
    public Language(){
        this.languageId = 0;
        this.languageName = "";
    }

    //Parameterized Constructor
    public Language(int languageId, String languageName){
        this.languageId = languageId;
        this.languageName = languageName;
    }

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
