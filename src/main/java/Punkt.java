public class Punkt {

    private int x = 10; //pola klasy
    private int y = 12; //pola klasy
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
}


