package es_3;
import java.util.HashMap;

public class Rubrica {
    private HashMap<String, String> rubrica;

    public Rubrica() {
        this.rubrica = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String telefono) {
        this.rubrica.put(nome, telefono);
    }

    public void rimuoviContatto(String nome) {
        this.rubrica.remove(nome);
    }

    public String trovaNomePerNumero(String numero) {
        for (String nome : this.rubrica.keySet()) {
            if (this.rubrica.get(nome).equals(numero)) {
                return nome;
            }
        }
        return "Numero non trovato.";
    }

    public String trovaNumeroPerNome(String nome) {
        return this.rubrica.getOrDefault(nome, "Nome non trovato.");
    }

    public void stampaContatti() {
        for (String nome : this.rubrica.keySet()) {
            System.out.println("Nome: " + nome + ", Numero: " + this.rubrica.get(nome));
        }
    }

    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.aggiungiContatto("Mario Rossi", "123-456-7890");
        rubrica.aggiungiContatto("Luigi Bianchi", "098-765-4321");

        rubrica.stampaContatti();

        System.out.println("Il numero di Luigi Bianchi è: " + rubrica.trovaNumeroPerNome("Luigi Bianchi"));
        System.out.println("Il nome per il numero 123-456-7890 è: " + rubrica.trovaNomePerNumero("123-456-7890"));

        rubrica.rimuoviContatto("Mario Rossi");

        rubrica.stampaContatti();
    }
}

