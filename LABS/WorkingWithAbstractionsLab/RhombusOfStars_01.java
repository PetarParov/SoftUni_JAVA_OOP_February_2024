package WorkingWithAbstractionLab;

import java.util.Scanner;

public class RhombusOfStars_01 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());

        firstPart(n);
        secondPart(n);
    }

    private static void secondPart(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(repeater(" ", n - (n - i)) + repeater("* ", n - i));
        }
    }

    private static void firstPart(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(repeater(" ", n - i) + repeater("* ", n - (n - i)));
        }
    }

    static String repeater(String symbol, int times) {
        StringBuilder rep = new StringBuilder();
        for (int i = 0; i < times; i++) {
            rep.append(symbol);
        }
        return rep.toString();
    }

}