package oopconcept.chasebank;

public class ChaseBankApplication {

    public static void main(String[] args) {
        new Menu(); // This is object of menu

        // data_type name = value

        Langauge english = new Langauge();
        english.languageId = 1;
        english.languageName = "English";

        Langauge nepali = new Langauge();
        nepali.languageId = 2;
        nepali.languageName = "Nepali";

        Langauge french = new Langauge();
        french.languageId = 3;
        french.languageName = "French";

        Menu personalMenu = new Menu();
        personalMenu.menuId = 1;
        personalMenu.name = "Personal";
        personalMenu.slug = "";
        personalMenu.isExternal = false;
        personalMenu.externalURL = null;
        personalMenu.isActive = true;
        personalMenu.languageId = english.languageId;

        Menu personalNepali = new Menu();
        personalNepali.menuId = 2;
        personalNepali.name = "Personal NP";
        personalNepali.slug = "";
        personalNepali.isExternal = false;
        personalNepali.externalURL = null;
        personalNepali.isActive = true;
        personalNepali.languageId = nepali.languageId;


        Menu businessMenu = new Menu();
        Menu commercialMenu = new Menu();

    }
}
