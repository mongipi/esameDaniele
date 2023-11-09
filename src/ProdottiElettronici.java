public class ProdottiElettronici extends Prodotto{
    private int garanzia;


    public ProdottiElettronici(String sku, double prezzo, int garanzia) {
        super(sku, prezzo);
        super.setPrezzoIniziale(calcolaCosto(prezzo,garanzia));
        this.garanzia = ceckGaranzia(garanzia);
    }

    public double calcolaCosto(double prezzo, int garanzia){
        if (garanzia > 12){
            return   prezzo + (prezzo * (10 / 100.0));
        }
        return prezzo;
    }

    public int ceckGaranzia(int garanzia){
       if( !(garanzia <= 12 || garanzia >= 24)) return 2;
        return garanzia;
    }
}
