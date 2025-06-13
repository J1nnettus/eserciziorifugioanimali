package animali;

import java.util.ArrayList;

public class Rifugio {
    private ArrayList<Animale> animali;

    // costruttore
    public Rifugio() {
        animali = new ArrayList<>();
    }

    // metodo per aggiungere un animale
    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    // metodo per stampare i versi di tutti gli animali
    public void stampaVersi() {
        for (Animale animale : animali) {
            animale.emettiVerso();
        }
    }
}
