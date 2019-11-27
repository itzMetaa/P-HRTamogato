
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
                while (sor != null) {
                    String[] st = sor.split(":");
                    if (N==5){
                        jelentkezok.add(new Jelentkezo());
                    }
                    sor = br.readLine();
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
