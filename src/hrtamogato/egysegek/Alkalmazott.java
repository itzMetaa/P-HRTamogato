
package hrtamogato.egysegek;

import java.util.List;


public class Alkalmazott extends Ember{
        private int promotions;

    public Alkalmazott(String fName, String lName, boolean sex, List<String> hobbies, List<String> skills, int promotions) {
        super(fName, lName, sex, hobbies, skills);
        this.promotions = promotions;
    }

    public int getPromotions() {
        return promotions;
    }

    @Override
    public int PontSzamozas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
