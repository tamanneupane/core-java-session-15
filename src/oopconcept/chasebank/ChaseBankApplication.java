package oopconcept.chasebank;

public class ChaseBankApplication {

    public static void main(String[] args) {
        new Menu(); // This is object of menu

        // data_type name = value

//        Language english = new Language();
////        english.languageId = 1;
//        english.setLanguageId(1);
////        english.languageName = "English";
//        english.setLanguageName("English");

        Language english = new Language(1,"English");

        Language nepali = new Language();
//        nepali.languageId = 2;
        nepali.setLanguageId(2);
//        nepali.languageName = "Nepali";
        nepali.setLanguageName("Nepali");


        Language french = new Language();
//        french.languageId = 3;
        french.setLanguageId(3);
//        french.languageName = "French";
        french.setLanguageName("French");

        Menu personalMenu = new Menu();
        personalMenu.menuId = 1;
        personalMenu.name = "Personal";
        personalMenu.slug = "";
        personalMenu.isExternal = false;
        personalMenu.externalURL = null;
        personalMenu.isActive = true;
//        personalMenu.languageId = english.languageId;
        personalMenu.languageId = english.getLanguageId();

        personalMenu.toString();

        Menu personalNepali = new Menu();
        personalNepali.menuId = 2;
        personalNepali.name = "Personal NP";
        personalNepali.slug = "";
        personalNepali.isExternal = false;
        personalNepali.externalURL = null;
        personalNepali.isActive = true;
//        personalNepali.languageId = nepali.languageId;
        personalNepali.languageId = nepali.getLanguageId();

        personalNepali.toString();

        Menu businessMenu = new Menu();
        Menu commercialMenu = new Menu();

    }
}
