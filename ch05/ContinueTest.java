package ch05;

/**
 * continue ve break örnekleri.
 */
public class ContinueTest {
    public static void main(String[] args) {
        System.out.print("Evens (continue ile tekleri atla): ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("1.. dur (break ile 4'te kes): ");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

