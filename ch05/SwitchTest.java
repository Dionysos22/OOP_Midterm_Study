package ch05;

/**
 * switch örneği: çoklu seçim + break.
 */
public class SwitchTest {
    public static void main(String[] args) {
        int grade = 87;
        String letter;

        // grade aralığını "onlar basamağı" ile gruplayalım:
        switch (grade / 10) {
            case 10:
            case 9:
                letter = "A";
                break;
            case 8:
                letter = "B";
                break;
            case 7:
                letter = "C";
                break;
            case 6:
                letter = "D";
                break;
            default:
                letter = "F";
        }

        System.out.printf("grade=%d => %s%n", grade, letter);
    }
}

