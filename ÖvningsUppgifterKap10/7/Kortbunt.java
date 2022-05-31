import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Kortbunt {
    private List<Kort> bunten = new LinkedList<>();
    public void laggOverst(Kort k) {
        bunten.add(0, k);
    }
    public Kort taBortOversta() {
        Kort k = bunten.get(0);
        bunten.remove(0);
        return k;
    }
    public int antalKort() {
        return bunten.size();
    }
    public void slangKorten() {
        bunten.clear();
    }
    public Kort tittaPa(int nr) {
        return bunten.get(nr);
    }
    public Kort taBort(int nr) {
        Kort k = bunten.get(nr);
        bunten.remove(nr);
        return k;
    }
    public int sok(KortFarg f, KortSlag s) {
        int i = 0;
        for(Kort k : bunten) {
            if(k.farg() == f && k.slag() == s) 
                return i;
            else
                i++;
        }
        return -1;
    }
    public void nyKortLek() {
        bunten.clear();
        for(KortFarg f : KortFarg.values()) {
            for(KortSlag s : KortSlag.values()) {
                bunten.add(new Kort(f, s));
            }
        }
    }
    public void blanda() {
        Collections.shuffle(bunten);
    }
    public void slaIhop(LinkedList<Kort> bunten2) {
        for(Kort k : bunten2) {
            bunten.add(k);
        }
        bunten2.clear();
    }
}
