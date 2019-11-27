
package hrtamogato.egysegek;

import java.util.List;


public class Jelentkezo extends Ember{

    public Jelentkezo(String fName, String lName, boolean sex, List<String> hobbies, List<String> skills) {
        super(fName, lName, sex, hobbies, skills);
    }

    @Override
    public int PontSzamozas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
