package pl.cdv;

public class Srednia {

    public static void main(String[] args) {

        int [] wartosci = {13, 12, 11, 10, 9, 8, 7};
        float arytmetyczna = policzArytmetyczna(wartosci);
        System.out.println("Srednia: " +arytmetyczna);

    }

    public static float policzArytmetyczna(int [] wartosci) {
        int suma = 0;
        for(int num : wartosci) {
            suma += num;
        }
        float srednia = suma / wartosci.length;
        return srednia;
    }

}
