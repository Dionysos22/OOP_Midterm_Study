package ch05;

/**
 * do-while: gövde en az 1 kez çalışır, koşul sonda kontrol edilir.
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int i = 5;

        // i zaten 5, koşul i < 3 false olsa bile gövde 1 kez çalışır.
        do {
            System.out.printf("i = %d%n", i);
            i++;
        } while (i < 3);
    }
}

