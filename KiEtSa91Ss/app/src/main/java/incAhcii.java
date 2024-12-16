import java.util.Scanner;
public class incAhcii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ASCII kodu giriniz (0-127): ");
        int asciiCode = scanner.nextInt();
        if (asciiCode >= 0 && asciiCode <= 127) {
            char character = (char) asciiCode;
            System.out.println("ASCII kodu " + asciiCode + " karakteri: " + character);
        } else {
            System.out.println("Geçersiz bir ASCII kodu girdiniz! 0 ile 127 arasında bir değer girin.");
        }
        scanner.close();
    }
}
