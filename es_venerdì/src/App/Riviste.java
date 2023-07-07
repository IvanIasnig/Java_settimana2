package App;

public class Riviste extends Catalogo {
	
     public enum Periodicita {
        SETTIMANALE,
        MENSILE,
        SEMESTRALE;
    	

    }

    private Periodicita periodicita;
	public Riviste(Integer isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.periodicita = periodicita;
	}
	
	public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
    
    @Override
    public String toString() {
        return "Titolo=" + getTitolo() +
                ", ISBN=" + getIsbn() +
                ", anno pubblicazione=" + getAnnoPubblicazione() +
                ", numero pagine=" + getNumeroPagine() +
                ", periodicita=" + getPeriodicita();
    }

	
}
