package oopconcept.chasebank;

public class Menu {

    /*
        menu id => int
        name => String
        slug => String
        is external => boolean
        external url => String
        is Active => boolean
        parent id => int
        is leaf => boolean
        language id => int
    */

    int menuId;
    String name;
    String slug;
    boolean isExternal;
    String externalURL;
    boolean isActive;
    int parentId;
    boolean isLeaf;
    int languageId;
}

/*
    menu id - 1
    name - Personal
    slug - ""
    is external - No
    external url - null
    is Active - Yes
    parent id - 0
    language id - 1

    menu id - 4
    name - Checking
    slug - null
    is external - No
    external url - null
    is Active - Yes
    parent id - 1
    is leaf - No
    language id - 1

    menu id - 5
    name - Choose a checking account
    slug - null
    is external - Yes
    external url - https://personal.chase.com/personal/checking
    is Active - Yes
    parent id - 4
    is leaf - Yes
     language id - 1
*/

/*
    menu id - 2
    name - Business
    slug - business
    is external - No
    external url - null
    is Active - Yes
    parent id - 0
     language id - 1
*/

/*
    menu id - 3
    name - Commercial
    slug - null
    is external - Yes
    external url - https://www.jpmorgan.com/commercial-banking
    is Active - Yes
    parent id - 0
     language id - 1
*/
