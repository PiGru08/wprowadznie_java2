import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witaj ponownie świecie");
        int wylosowana = (int)(Math.random()*10+1);

        System.out.println(wylosowana);
        /*
        typy proste: zawsze z małej litert, mają tylko wartość
        logiczny: boolean
        całkowite: byte, short, int, long
        rzeczywiste: float, double
        znakowy: char
        typy złożone: pisane zawsze pisane wielką literą
        obiekty które mają własności i metody
         */
        System.out.println("Zgadnij liczbę z zakresu 1-10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();//wczytywanie z klawiatury liczby całkowitej
        System.out.println("Wpisano z klawiatury "+wpisanaLiczba);
    }
}