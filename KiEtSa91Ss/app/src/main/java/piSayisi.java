import java.util.Scanner;
public class piSayisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Çevreyi Gir (Yanlızca Sayı):");
        int yariCap = scanner.nextInt();
        System.out.println("Çevre" + (2*PI*yariCap));
    }
}
