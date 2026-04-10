package ch06;

/**
 * Method overloading (aşırı yükleme) örneği.
 *
 * Aynı isim, farklı parametre listeleri -> derleyici doğru olanı seçer.
 */
public class MethodOverloadDemo {
    public static void main(String[] args) {
        System.out.println("square(7) = " + square(7));
        System.out.println("square(7.5) = " + square(7.5));
    }

    private static int square(int x) {
        return x * x;
    }

    private static double square(double x) {
        return x * x;
    }
}

