import java.util.Scanner;
import static java.lang.Math.*;

public class ZadaniePierwsze {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");

        int rozmiar = scan.nextInt();
        double[] tab1 = new double[rozmiar];

        for (int i = 0; i < rozmiar; i++) {
            System.out.println("Wpisz liczbę" + i + " ");

            tab1[i] = scan.nextInt();
        }

        for (double T : tab1) {
            System.out.println(T);
        }
    }
}

