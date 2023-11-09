import enu.EnumiPrincipioNutritivo;

public class ProdottiAlimentari extends Prodotto {

    private EnumiPrincipioNutritivo principioNutritivo;
    private int tempoConservazione;


    public ProdottiAlimentari(String sku, double prezzo, EnumiPrincipioNutritivo principioNutritivo, int tempoConservazione) {
        super(sku, prezzo);
        super.setPrezzoIniziale(calcolaCosto(prezzo, tempoConservazione));
        this.principioNutritivo = principioNutritivo;
        this.tempoConservazione = checkTempoConservazione(tempoConservazione);
    }

    private int checkTempoConservazione(int tempoConservazione) {
        if (tempoConservazione <1) return 1;
        return tempoConservazione;
    }

    public double calcolaCosto(double prezzo, int tempoConservazione){
        if (tempoConservazione  == 1){
            prezzo = prezzo /2;
        }
        return prezzo;
    }
}