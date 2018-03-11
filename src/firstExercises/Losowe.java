package firstExercises;

import java.util.Random;
import java.util.Scanner;

public class Losowe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int proba = 0;
        int strzal = 0;
        int wylosowanaLiczba = generator.nextInt(101);
        System.out.println("Losuje liczbe z zakresu od 0 do 100 ");
        while (strzal != wylosowanaLiczba) {
            System.out.println("Zgadnij jaka to liczba: ");
            strzal = input.nextInt();
            proba++;
            if (strzal < wylosowanaLiczba) {
                System.out
                        .println("Niestety, to za malo. Podaj wieksza liczbe");
            } else if (strzal > wylosowanaLiczba) {
                System.out.println(
                        "Podana liczba to za duzo. Podaj mniejsza liczbe");
            } else if (strzal == wylosowanaLiczba) {
                System.out.println("Cool! Zgadles w probie: " + proba);
            }
        }
    }
}
