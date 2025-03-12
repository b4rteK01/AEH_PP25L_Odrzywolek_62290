package pl.pp;

import java.util.Scanner;

public class MojaDrugaAplikacja {
    public MojaDrugaAplikacja() {
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        int x = 10;
        System.out.println("x = " + x);

        int wynik = x * 2;
        System.out.println("2 * x = " + wynik);

        wynik = x * x;
        System.out.println("x ^ 2 = " + wynik);

        //2
        System.out.println("Podaj swój wiek: ");
        int wiek = scanner.nextInt();
        wiek *= 31556926;
        System.out.println("Twój wiek przeliczony na sekundy: " + wiek);
    }
}
