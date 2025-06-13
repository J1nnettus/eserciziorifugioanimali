package animali;

public class Main {
    public static void main(String[] args) {
        // creazione di un rifugio
        Rifugio rifugio = new Rifugio();

        // creazione di un cane e un gatto
        Animale cane = new Cane("Pippo");
        Animale gatto = new Gatto("Prospero");

        // aggiunta degli animali al rifugio
        rifugio.aggiungiAnimale(cane);
        rifugio.aggiungiAnimale(gatto);

        // stampa dei versi
        System.out.println("Versi degli animali nel rifugio:");
        rifugio.stampaVersi();
    }
}
