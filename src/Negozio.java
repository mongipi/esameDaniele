import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private List<Prodotto> prodotti = new ArrayList<Prodotto>();



    public Negozio(){
    }

    public void aggiungiProdotto(Prodotto prodotto){
        this.prodotti.add(prodotto);
    }

    public double calcolaTotale(){
        double totale = 0;
        for( Prodotto prodotto : prodotti ){
            totale += prodotto.getPrezzoIniziale();
        }
        return totale;
    }


}
