public class Samochod {

    private String model;
    private int rok_produkacji;
    private int ilosc_drzwi;
    private int v_max;
    private boolean czy_jedziemy = false;



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRok_produkacji() {
        return rok_produkacji;
    }

    public void setRok_produkacji(int rok_produkacji) {
        this.rok_produkacji = rok_produkacji;
    }

    public int getIlosc_drzwi() {
        return ilosc_drzwi;
    }

    public void setIlosc_drzwi(int ilosc_drzwi) {
        this.ilosc_drzwi = ilosc_drzwi;
    }

    public int getV_max() {
        return v_max;
    }

    public void setV_max(int v_max) {
        this.v_max = v_max;
    }

    boolean rusz(){
        System.out.println("Jedziemy");
        czy_jedziemy = true;
        return czy_jedziemy;
    }

    boolean zatrzymaj_sie(){
        System.out.println("Zatrzymywamy się");
        czy_jedziemy = false;
        return czy_jedziemy;
    }


}