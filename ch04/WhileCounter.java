package ch04;

/**
 * while döngüsü (counter-controlled iteration) temel örnek.
 */
public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; // başlangıç

        // koşul true kaldığı sürece tekrar eder
        while (counter <= 5) {
            System.out.printf("counter = %d%n", counter);
            counter++; // güncelleme -> sonsuz döngüyü engeller
        }
    }
}

