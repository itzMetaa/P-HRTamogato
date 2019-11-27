
package hrtamogato.egysegek;

import java.util.List;


public abstract class Ember {
    private String fName;
    private String lName;
    private boolean sex;
    private List<String> hobbies;
    private List<String> skills;
    private int promotions;

    public Ember(String fName, String lName, boolean sex, List<String> hobbies, List<String> skills, int promotions) {
        this.fName = fName;
        this.lName = lName;
        this.sex = sex;
        this.hobbies = hobbies;
        this.skills = skills;
        this.promotions = promotions;
    }

    public abstract int PontSzamozas();
}
