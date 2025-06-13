package animali;

public abstract class Animale {
    private String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public abstract void emettiVerso();

    public void descrizione() {
        System.out.println("Ciao, sono" + nome);
    }

    public String getNome() {
        return nome;
    }
}
