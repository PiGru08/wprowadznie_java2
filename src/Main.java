import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witaj ponownie świecie");
        int wylosowana = (int)(Math.random()*100+1);

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
        System.out.println("Zgadnij liczbę z zakresu 1-100");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();//wczytywanie z klawiatury liczby całkowitej
        System.out.println("Wpisano z klawiatury "+wpisanaLiczba);
        //instrukcja warunkowa
        if(wpisanaLiczba == wylosowana){
            System.out.println("Liczba została odgadnięta.");
        }else{
            System.out.println("Nie zgadnięto, spróbuj jeszce raz.");
        }
        //wyrażenie warunkowe
        String komunikat = wylosowana == wpisanaLiczba ? "Poprawnie":"Nie poprawnie";//jeżeli wylosowana jest taka sama jak wpisana to wypisz poprawnie, w przeciwnym wypadku nie poprawnie
        System.out.println(komunikat);

        int roznica = wylosowana>wpisanaLiczba ? wylosowana - wpisanaLiczba : wpisanaLiczba-wylosowana;
        roznica = roznica/10;//dzielenie całkowite bo wynik typu int(całkowity)
        switch (roznica){
            case 0:
                System.out.println("Brawo");
                break;
            case 1 :
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Dość blisko");
                break;
            default:
                System.out.println("Spróbuj szczęścia innym razem");
                break;
        }
    }
}