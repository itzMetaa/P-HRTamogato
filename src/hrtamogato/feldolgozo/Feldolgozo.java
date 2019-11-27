
package hrtamogato.feldolgozo;

public class Feldolgozo {

    public void beolvas(String file){
        jelentkezok= new ArrayList<>();
        alkalmazottak= new ArrayList<>();
        try{
            FileReader f= new FileReader(file);
            BufferedReader br= new BufferedReader(f);
            String sor= br.readLine();
            int index=0;

            for (int i = 0; i < N ; i++) {
                String fname;
                String lname;
                boolean sex;
                List<String> hobbik;
                List<String> skils;
                int promotions
                while (sor != null) {
                    String[] st = sor.split(":");
                    if (st[0].eqals("First name")){
                        fname=st[1];
                    }else if (st[0].eqals("Last name")){
                        lname=st[1];
                    }else if (st[0].eqals("Sex")){
                        if (st[1].eqals("Male")){
                            sex=true;
                        }else {
                            sex=false
                        }
                    }else if (st[0].eqals("Hobbies")){
                        String[] h= st[1].split(",");
                        for (int j = 0; j < h.length; j++) {
                            hobbik.add(h[j]);
                        }
                    }else if (st[0].eqals("Skills")) {
                        String[] h = st[1].split(",");
                        for (int j = 0; j < h.length; j++) {
                            skils.add(h[j]);
                        }
                    }else if (st[0].eqals("Promotions")) {
                        promotions=Integer.parseInt(st[1]);
                    }
                    sor = br.readLine();
                }
                if (N==5){
                    jelentkezok.add(new Jelentkezo(fname,lname,sex,hobbik,skils));
                }else if (N==6){
                    alkalmazottak.add(new Alkalmazott(fname,lname,sex,hobbik,skils,promotions));
                }
            }
            br.close();
            f.close();
        }catch (FileNotFoundException e){
            System.out.println("Nem található a file");
        }catch (IOException e){
            System.out.println("Írás/olvasás/jogusulcsági hiba");
        }


    }
    
}
