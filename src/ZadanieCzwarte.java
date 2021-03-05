public class ZadanieCzwarte {

    public static int [][] get_tab(){
        int X = 9;

        int[][] get_tab = new int[X][X];

        for (int L = 0; L < X; L++) {
            for (int K = 0; K < X; K++) {
                get_tab[L][K] = L + K;
            }
        }
        return get_tab;

    }
    public static void main(String[] args)

    {
        int[][] get_tab = get_tab();

        for (int F = 0; F < get_tab.length; F++)
        {
            for (int T = 0; T < get_tab.length; T++)
            {
                System.out.println(get_tab[F][T]+ " ");
            }
            System.out.println("");
        }
    }
}
