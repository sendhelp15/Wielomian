import java.util.Scanner;

import static java.lang.Math.pow;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("Podaj stopień wielomianu");
        Scanner scanner = new Scanner(System.in);
        int degree = scanner.nextInt();
        double[] arrayElements = new double[degree + 1];

        for (int i = 0; i <= degree; i++) {
            System.out.println("Wybierz współczynnik wielomianu dla stopnia " + i);
            arrayElements[i] = scanner.nextInt();
        }

        System.out.println("Podaj pierwiastek");
        double root = scanner.nextInt();

        if (isRoot(root, arrayElements)) {
            System.out.println("Pierwiastek " + root + " należy do wielomianu");
        } else {
            System.out.println("Pierwiastek " + root + " nie należy do wielomianu");
        }


    }

    public static boolean isRoot(double root, double[] arrayElements) {
        double wynik = 0;
        int sizeArray = arrayElements.length;
        for (int i = 0; i < sizeArray; i++) {
            wynik += arrayElements[i] * pow(root, sizeArray - i - 1);
        }

        if (wynik == 0) {
            return true;
        } else {
            return false;
        }

    }
}