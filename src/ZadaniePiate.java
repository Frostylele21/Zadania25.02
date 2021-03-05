public class ZadaniePiate {

    public static int Dzielniki(int p, int d) {
        while (p != 1) {
            if (p > 1) {
                p -= 1;
            } else {
                d -= p;
            }
        }
        return p;
    }
    public static void main(String[] args)
    {
    System.out.println("Wynikiem są " + Dzielniki(12,14));
    }
}