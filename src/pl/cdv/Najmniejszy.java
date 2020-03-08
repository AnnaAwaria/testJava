package pl.cdv;

public class Najmniejszy {

    public static void main(String[] args) {

        int[] wartosci = { 52, 2, 28, -35, 45, 34, 8, 18, -23, 4, 6, -45, 55, 3, -2, -21, 5, -5 };
        int wynik = liczenieTablicy(wartosci);
        System.out.println(wynik);

    }

    public static int liczenieTablicy(int[] wartosci) {

            int dlugosc = wartosci.length;
            int min = wartosci[0];
            for (int i = 0; i < dlugosc; i++) {
                if (wartosci[i] < min)
                    min = wartosci[i];
            }
            return min;
    }

}
