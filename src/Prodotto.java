public class Prodotto {

    private String sku;
    private double prezzoIniziale;

    public Prodotto(String sku, double prezzo) {
        this.sku = sku;
        this.prezzoIniziale = checkPrezzo(prezzo);
    }

    public double getPrezzoIniziale() {
        return prezzoIniziale;
    }

    public void setPrezzoIniziale(double prezzoIniziale) {
        this.prezzoIniziale = checkPrezzo(prezzoIniziale);
    }

    public double checkPrezzo(double prezzoIniziale){
        if (prezzoIniziale<0) return 0;
        return prezzoIniziale;
    }

}
