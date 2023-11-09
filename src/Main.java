
import java.util.ArrayList;
import java.util.List;

import static enu.EnumiPrincipioNutritivo.*;



public class Main {
    public static void main(String[] args) {

       ProdottiAlimentari prodottiAlimentari1 = new ProdottiAlimentari("1",10,GRASSI,1);
       ProdottiAlimentari prodottiAlimentari2 = new ProdottiAlimentari("2",8,LIPIDI,-2);
       ProdottiElettronici prodottoElettronico1 = new ProdottiElettronici("1",1.80,4);
        ProdottiElettronici prodottoElettronico2 = new ProdottiElettronici("3",10,20);

       Negozio negozio = new Negozio();
       negozio.aggiungiProdotto(prodottiAlimentari1);
       negozio.aggiungiProdotto(prodottiAlimentari2);
       negozio.aggiungiProdotto(prodottoElettronico1);
        negozio.aggiungiProdotto(prodottoElettronico2);


       double totale = negozio.calcolaTotale();

        System.out.println("Totale: " + totale);


    }
}