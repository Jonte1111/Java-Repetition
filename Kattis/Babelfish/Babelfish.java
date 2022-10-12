import java.util.ArrayList;
import java.util.Scanner;

public class Babelfish {
    Scanner s;
    ArrayList<Translation> words;
    public Babelfish() {
        s = new Scanner(System.in);
        words = new ArrayList<Translation>();
    }
    public void inputs() {
        boolean check = true;
        while(check) {
            String e = s.nextLine();
            if(e.equals("")) {
                String translation = checkForTranslation();
                System.out.println(translation);
                check = false;
            }
            else 
                words.add(new Translation(e, s.next()));
        }
    } 
    public String checkForTranslation() {
        String translate = s.nextLine();
        for(Translation t : words) {
            if(t.getG().equals(translate)) {
                return translate;
            }
        }
        return "eh";
    }
}
