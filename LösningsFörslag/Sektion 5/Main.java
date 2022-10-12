import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Papper p = new Papper();
        int imgX, imgY;
        Scanner s = new Scanner(System.in);
        System.out.print("Mata in bredd: ");
        imgX = s.nextInt();
        System.out.print("Mata in höjd: ");
        imgY = s.nextInt();
        System.out.print("Bilden med måtten: " + imgX + "*" + imgY + "passar på följande format: ");
        p.imageFitPaper(imgX, imgY); 
        s.close();
    }
}