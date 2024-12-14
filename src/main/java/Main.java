public class Main {
    public static void main(String[] args) {
        System.out.println("Java test");
        //Przekazywanie argumentu do wyświetlenia
        System.out.println(2 + 2);
        /*Zwraca wynik*/
        byte value1 = 3;
        int value3 = 300;
        byte mojazmienna = 127;
        System.out.println("zmienna mojazmianna to " + mojazmienna + " a value1 to " + value1);

        //deklaracja (bez wartości)
        int mojazmienna2;

        //inicjacja (z przypisaniem wartości)
        int mojazmienna3 = 300;

        //Rzutowanie - po przekroczeniu wartości sprawdza od -128 do 127 (dla byte). Wykonuje to w iteracji od poczaku do końca i zwraca różnicę
        byte zmienna = (byte) 333;
        System.out.println("Wartość po rzytowaniu to " + zmienna);

        //instrukcje warunkowe
        int valueToCheck = 128;
        if (valueToCheck <= 127) {
            System.out.println("The number type is byte.");
        } else {
            System.out.println("The numer in integer");
        }
        ;
        //jeżeli warunek nie jest spełniony na ma wpisu w terminalu
        // jak spełniony widać wpis w terminalu

        byte temp = 5;
        String informacjaZimno = "weź czapkę jest zimno";
        String informacjaCieplo = "jest ciepło nie bierz czapki";


        char znak = 'P';
        char znak2 = '%';
        char znak3 = 108;
        System.out.println(znak + ", " + znak2 + ", " + znak3);

        String kolor = "niebieski";

        if(kolor == "zielony") {
            System.out.println("Jedź");
        } else if (kolor == "czerowny")
        {System.out.println("Stój");}

        if(kolor == "czerowny") {
            System.out.println("Jedź");
        } else if (kolor == "czerowny")
        {System.out.println("Stój");
        }
        else {
            System.out.println("Nieokreslony sygnał");
        }

        int myVariable = 1;
        System.out.println("Wartość wyjściowa to " + myVariable);
        myVariable = myVariable +1;
        System.out.println("Wartość po zinkrementowaniu to " + myVariable);
        myVariable ++;
        System.out.println("Wartość po zinkrementowaniu to " + myVariable);
        myVariable += 1;
        System.out.println("Wartość po zinkrementowaniu to " + myVariable);
        myVariable += 10;
        System.out.println("Wartość po zinkrementowaniu to " + myVariable);

        //zasięg zmiennych
        int zmiennaGlobalna = 90;

        if(zmiennaGlobalna > 0){
            --zmiennaGlobalna;
            int zmiennaLokalna = 0;
        }
        //zmiennaLokalna++;

        //pętla for
        for (int licznik = 0; licznik < 10; licznik++) {
            System.out.println("Wpisz po raz " + licznik);
        }

        //pętla WHILE
        int liczba = 0;

       while (liczba <= 10) {
            System.out.println("Liczba to " + liczba);
            liczba++;
        }

        //pętla do while
        int liczba2 = 0;
        do {
            System.out.println("Liczba to " + liczba);
            liczba++;
        } while (liczba <= 10);

        //modulo
        int numberTocheck = 103;

        if(numberTocheck % 2 == 0){
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }

        //typ logiczny
        boolean zapory = false;
        boolean sygnalizacja = true;

        if (zapory && sygnalizacja){
            System.out.println("Można jechać");
        } else {
            System.out.println("Nie można jechać");
        }

        //Test git


    }}



