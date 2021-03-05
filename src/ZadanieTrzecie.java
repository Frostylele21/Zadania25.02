import java.util.Scanner;
import java.util.Arrays;

public class ZadanieTrzecie
{
    public static int [] get_tab() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz wielkość swojej tablicy:");
        int rozmiar;

        rozmiar = scan.nextInt();

        int[] tab1 = new int[rozmiar];

        int[] tab2 = new int[rozmiar];

        int[] tab3 = new int[rozmiar];

        for (int L = 0; L < rozmiar; L++) {
            System.out.println("Wpisz swoją liczbę " + L + " ");

            tab1[L] = scan.nextInt();
        }

        for (int L = 0; L < rozmiar; L++) {
            System.out.println("Wpisz swoją liczbę " + L + " ");

            tab2[L] = scan.nextInt();
        }

        for (int L = 0; L < rozmiar; L++) {
            tab3[L] = tab1[L] + tab2[L];
        }

        return tab3;

    }

    public static void main(String[] args)
    {
        System.out.println("Wynik zadania" + Arrays.toString(get_tab()));
    }
}
