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

        //pętla zwracająca kody ASCII
        for (int licznik = 0; licznik < 256; licznik++) {
            char znakch = (char) licznik;
            System.out.println(licznik + " = " + znakch);
        }

        int speed = 10;
        if(speed >= 1 && speed < 10) {
            System.out.println("Przekroczyłeś prędkość - małe ostrzeżenie");
        } else if (speed >= 10){
            System.out.println("Duże ostrzeżenie");
        }

        //inicjalizacja tablicy i iteracja
        int [] tablica = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 1; i <= 9; i++){
            System.out.println(tablica[i]);
        }

        //deklaracja tablicy bez wartośći
        int [] nowaTablica = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println(nowaTablica[i]);
        }
            for (int i = 0; i <= 9; i++){
                nowaTablica[i] = i + 21;
                System.out.println(nowaTablica[i]);
            }
        for (int i = 0; i <= 9; i++){
            nowaTablica[i] = i + 21;
            System.out.println(nowaTablica[i]);
        }

        String[] tablicaDniTygodnia = {"poniedziałek", "wtorek", "środa", "czwartek", "piątek"};
        for (int i = 0; i < tablicaDniTygodnia.length; i++){
            System.out.println(tablicaDniTygodnia[i]);
        }

        //pętla zagnieżdżone
        //13 - nested loops
        for(int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
        System.out.println("Dla i =  " + i + ", j = " + j);
        System.out.println("A zatem " + i + " * " + j + " to " + i*j);
        }}

        //switch
        //14 - instrukcja warunkowa

        char operacja = '+';int a = 3, b = 9;
        switch (operacja) {
            case '+':
                System.out.println("Suma to " + (a + b));
                break;
                case '-':
                    System.out.println("Różnica to " + (a - b));
                    break;
                    case '*':
                        System.out.println("Iloczyn to " + (a * b));
                        break;
                        case '/':
                            System.out.println("Iloraz to " + (a/b));
                            break;
                            default:
                                System.out.println("Błędny znak lub wartość.");}

        //obiektowość
        public class Punkt{

        }




    }}



