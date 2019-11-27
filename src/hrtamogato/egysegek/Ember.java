
package hrtamogato.egysegek;

import java.util.List;


public abstract class Ember {
    private String fName;
    private String lName;
    private boolean sex;
    private List<String> hobbies;
    private List<String> skills;

    public Ember(String fName, String lName, boolean sex, List<String> hobbies, List<String> skills) {
        this.fName = fName;
        this.lName = lName;
        this.sex = sex;
        this.hobbies = hobbies;
        this.skills = skills;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public boolean isSex() {
        return sex;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getSkills() {
        return skills;
    }

    


    public abstract int PontSzamozas();
}
