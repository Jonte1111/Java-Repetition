public abstract class Figur {
    private Punkt startPunkt;
    public Figur(Punkt startPunkt) {
        this.startPunkt = startPunkt;
    } 
    public abstract void area();
}
