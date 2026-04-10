package ch04;

/**
 * ++ ve -- operatörleri: prefix vs postfix.
 */
public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int i = 5;

        int a = ++i; // önce artır, sonra ata -> i=6, a=6
        int b = i++; // önce ata, sonra artır -> b=6, i=7

        System.out.printf("i=%d, a=%d, b=%d%n", i, a, b);

        int x = 10;
        x += 5; // bileşik atama: x = x + 5
        x *= 2; // x = x * 2
        System.out.printf("x=%d%n", x);
    }
}

