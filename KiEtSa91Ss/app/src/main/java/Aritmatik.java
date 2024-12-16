public class Aritmatik {
    public static void main(String[] args) {
        int x = 13;
        int y = 5;
        int toplam = x + y;
        int fark = x - y;
        int carpim = x * y;
        int bolme = x / y;
        int mod = x % y;
        x++;
        y--;
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);
        System.out.println("Bölme: " + bolme);
        System.out.println("Mod Alma: " + mod);
        System.out.println("Artırma: " + x);
        System.out.println("Azaltma: " + y);
    }
}
