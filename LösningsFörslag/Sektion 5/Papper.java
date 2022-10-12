public class Papper {
    public void imageFitPaper(int width, int height) {
        int w = 841, h=1189, tmp;
        for(int i = 0;i<8;i++) {
            if((width <= w && height <= h) || (height <= w && width <= h)) {
                System.out.print("A" + i + " ");
            }
            tmp = h/2;
            h = w;
            w = tmp;
        }
    }
}
