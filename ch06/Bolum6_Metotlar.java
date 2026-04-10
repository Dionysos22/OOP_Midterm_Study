import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Bölüm 6: Methods: A Deeper Look
 *
 * Bu dosyada metot kavramını derinleştiriyoruz:
 * - static metot/alan
 * - parametreler, overload (aşırı yükleme)
 * - çağrı yığını fikri (call stack) -> recursion örneği
 * - tip dönüşümleri, argument promotion
 * - SecureRandom, enum gibi örnekler
 */
public class Bolum6_Metotlar {
    // 6.3 static fields: sınıfa ait sayaç
    private static int callCount = 0;

    public static void main(String[] args) {
        intro();
        programBirimi();
        staticMethodsFieldsMath();
        cokluParametre();
        metotNotlari();
        callStackVeRecursion();
        argumentPromotionCasting();
        apiPackagesNotu();
        secureRandomCaseStudy();
        enumSansOyunu();
        scope();
        methodOverloading();
        optionalGuiNotu();
        ozet();
    }

    // 6.1 Introduction
    private static void intro() {
        System.out.println("=== Bolum 6 ===");
    }

    // 6.2 Program Units in Java
    private static void programBirimi() {
        /*
         * Java'da program birimleri:
         * - class (sınıf)
         * - methods (metotlar)
         * - fields (alanlar)
         *
         * main metodu: programın giriş noktası.
         */
        System.out.println("[6.2] Program birimleri yorumlarda.");
    }

    // 6.3 static Methods, static Fields and Class Math
    private static void staticMethodsFieldsMath() {
        /*
         * static:
         * - Nesneye değil sınıfa aittir.
         * - Sınıf adıyla çağrılabilir (Math.sqrt gibi).
         */
        callCount++;
        double x = 16.0;
        System.out.println("[6.3] sqrt(16)=" + Math.sqrt(x));
        System.out.println("[6.3] callCount=" + callCount);
    }

    // 6.4 Methods with Multiple Parameters
    private static void cokluParametre() {
        int result = clamp(15, 0, 10);
        System.out.println("[6.4] clamp(15,0,10)=" + result);
    }

    private static int clamp(int value, int min, int max) {
        // value'yu [min,max] aralığına sıkıştır.
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    // 6.5 Notes on Declaring and Using Methods
    private static void metotNotlari() {
        /*
         * Metot imzası:
         *  erişimBelirteci static? dönüşTipi ad(parametreler)
         *
         * İyi pratik:
         * - Tek iş yapan metotlar (single responsibility)
         * - Anlamlı isimler
         * - Çok uzun metotları bölmek
         */
        System.out.println("[6.5] Metot yazım notları yorumlarda.");
    }

    // 6.6 Method-Call Stack and Activation Records
    private static void callStackVeRecursion() {
        /*
         * Call stack: Metot çağrıları "üst üste" birikir.
         * Her çağrıda parametreler/yerel değişkenler için bir activation record oluşur.
         * Recursion (özyineleme): metot kendi kendini çağırır.
         *
         * Aşağıda factorial ile basit recursion gösteriyoruz.
         */
        int n = 5;
        System.out.println("[6.6] factorial(5)=" + factorial(n));
    }

    private static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n negatif olamaz");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 6.7 Argument Promotion and Casting
    private static void argumentPromotionCasting() {
        /*
         * Argument promotion:
         * - int + double => double
         * - daha "geniş" tipe yükseltme otomatik olabilir.
         *
         * Casting:
         * - (int) 3.9 => 3 (kesir atılır)
         */
        int a = 3;
        double b = 2.5;
        double sum = a + b; // a otomatik double'a yükselir
        System.out.println("[6.7] 3 + 2.5 = " + sum);

        double d = 3.9;
        int i = (int) d;
        System.out.println("[6.7] (int)3.9 = " + i);
    }

    // 6.8 Java API Packages
    private static void apiPackagesNotu() {
        /*
         * Paket (package): sınıfları gruplar.
         * Örn:
         * - java.lang (otomatik gelir: String, Math, System...)
         * - java.util (Scanner, Arrays...)
         * - java.security (SecureRandom...)
         */
        System.out.println("[6.8] API paketleri yorumlarda.");
    }

    // 6.9 Case Study: Secure Random-Number Generation
    private static void secureRandomCaseStudy() {
        /*
         * Random vs SecureRandom:
         * - SecureRandom, daha güçlü (tahmin edilmesi zor) rastgelelik sağlar.
         * Bu bölümde amaç: sınıf kullanımı ve metot çağırma pratiği.
         */
        SecureRandom rng = new SecureRandom();
        int[] freq = new int[7]; // 1..6
        for (int k = 0; k < 20; k++) {
            int die = 1 + rng.nextInt(6);
            freq[die]++;
        }
        System.out.println("[6.9] zar frekans: " + Arrays.toString(freq));
    }

    // 6.10 A Game of Chance; Introducing enum Types
    private static void enumSansOyunu() {
        /*
         * enum: sabit değer kümeleri için tip-güvenli yapı.
         * Örn: Renkler, Günler, Oyun durumları...
         *
         * Basit bir "yazı-tura" örneği.
         */
        SecureRandom rng = new SecureRandom();
        Coin result = rng.nextBoolean() ? Coin.YAZI : Coin.TURA;
        System.out.println("[6.10] Coin=" + result);
    }

    private enum Coin { YAZI, TURA }

    // 6.11 Scope of Declarations
    private static void scope() {
        /*
         * Scope (kapsam): değişkenin görünür olduğu bölge.
         * - Metot içi yerel değişken: sadece o blokta yaşar.
         * - if/while/for blokları kendi alt scope'unu oluşturur.
         */
        int x = 10;
        if (x > 5) {
            int y = 3; // y sadece bu blokta geçerli
            System.out.println("[6.11] x+y=" + (x + y));
        }
        // burada y yok
    }

    // 6.12 Method Overloading
    private static void methodOverloading() {
        /*
         * Overloading: aynı isimli metot, farklı parametre listeleri.
         * Derleyici hangi metodu çağıracağını argümanlara bakarak seçer.
         */
        System.out.println("[6.12] max(3,7)=" + max(3, 7));
        System.out.println("[6.12] max(3.2,7.1)=" + max(3.2, 7.1));
    }

    private static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    private static double max(double a, double b) {
        return (a >= b) ? a : b;
    }

    // 6.13 (Optional) GUI and Graphics Case Study
    private static void optionalGuiNotu() {
        /*
         * Bölüm 6 opsiyonel kısmında renkler ve dolu şekiller vardı.
         * Swing ile çizim için JPanel override paintComponent gibi konulara giriyor.
         * İstersen ayrı bir dosyada "renkli kareler" çizimini ekleyebiliriz.
         */
        System.out.println("[6.13] GUI/Graphics opsiyonel: not olarak geçildi.");
    }

    // 6.14 Wrap-Up
    private static void ozet() {
        System.out.println("=== Bolum 6 bitti ===");
        System.out.println();
    }
}

