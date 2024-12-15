public class Punkt {

     int x = 10; //pola klasy
     int y = 12; //pola klasy

    /*
    private int x = 10; //pola klasy

    private int y = 12; //pola klasy
    */
/*
    int pobierzX(){
        return x;
    }

    int pobierzY(){
        return y;
    }

    void ustawX(int x){
        this.x = x;
    }

    void ustawY(int y){
        this.y = y;
    }
*/

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void wyswietlWspolrzedne() {
        System.out.println("Wyświetlamy x " + x);
        System.out.println("Wyświetlamy x " + y);
    }

    static void metodaStatyczna(){
        System.out.println("Test metody statycznej - dostępnej dla klasy bez instancjonowania obiektu");
    }

    static int poleStatyczne = 123;

}


