package App;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Set<Libri> libri = new HashSet<>();
		Set<Riviste> riviste = new HashSet<>();
		
		libri.add(new Libri(1, "Lotr", 2000, 1000, "Tolkien", "Fantasy"));
		libri.add(new Libri(2, "Guerra e Pace", 1900, 200, "Marietto", "Romanzo storico"));
		libri.add(new Libri(3, "Peppa Pig", 2017, 900, "Kafka", "Fantasy"));
		
		riviste.add(new Riviste(1001, "Solo", 2000, 100, Riviste.Periodicita.SETTIMANALE));
		riviste.add(new Riviste(1002, "Tu", 2001, 200, Riviste.Periodicita.MENSILE));
		riviste.add(new Riviste(1003, "Ciao", 2002, 3000, Riviste.Periodicita.SEMESTRALE));

		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Scegli un'opzione: ");
			System.out.println("0. Esci");
			System.out.println("1. Aggiungi un libro");
			System.out.println("2. Rimuovi un libro o una rivista per ISBN");
			System.out.println("3. Cerca un libro o una rivista per ISBN");
			System.out.println("4. Cerca un libro o una rivista per anno di pubblicazione");


			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					// Aggiugni libro
					System.out.println("Inserisci i dettagli del nuovo libro: ");
					
					System.out.print("Inserisci ISBN: ");
					int isbn = scanner.nextInt();
					
					System.out.print("Inserisci titolo: ");
					String titolo = scanner.next();
					
					System.out.print("Inserisci anno di pubblicazione: ");
					int annoPubblicazione = scanner.nextInt();

					System.out.print("Inserisci numero di pagine: ");
					int numeroPagine = scanner.nextInt();
					
					System.out.print("Inserisci autore: ");
					String autore = scanner.next();
					
					System.out.print("Inserisci genere: ");
					String genere = scanner.next();

					Libri nuovoLibro = new Libri(isbn, titolo, annoPubblicazione, numeroPagine, autore, genere);
					libri.add(nuovoLibro);
					
					System.out.println("Nuovo libro aggiunto: " + nuovoLibro);
					break;

				case 2:
					// Rimozione
					System.out.println("Inserisci l'ISBN dell' elemento da rimuovere: ");
					int isbnRimuovere = scanner.nextInt();

					libri = libri.stream()
							.filter(libro -> libro.getIsbn() != isbnRimuovere)
							.collect(Collectors.toSet());

					riviste = riviste.stream()
							.filter(rivista -> rivista.getIsbn() != isbnRimuovere)
							.collect(Collectors.toSet());

					System.out.println("Rimosso il ibro o la rivista con ISBN: " + isbnRimuovere);
					break;

				case 3:
					//ricerca per IBSN
					System.out.println("Inserisci l'ISBN del libro o rivista da cercare: ");
					int isbnCercare = scanner.nextInt();

					Libri libroCercato = libri.stream()
							.filter(libro -> libro.getIsbn() == isbnCercare)
							.findAny()
							.orElse(null);

					Riviste rivistaCercata = riviste.stream()
							.filter(rivista -> rivista.getIsbn() == isbnCercare)
							.findAny()
							.orElse(null);

					if(libroCercato != null) {
						System.out.println("Libro trovato: " + libroCercato);
					} else if(rivistaCercata != null) {
						System.out.println("Rivista trovata: " + rivistaCercata);
					} else {
						System.out.println("Nessun libro o rivista con l'ISBN " + isbnCercare + " trovato.");
					}
					break;
					
				case 4:
					// Rierca per ann
					System.out.println("Inserisci l'anno di pubblicazione del libro o rivista da cercare: ");
					int annoCercare = scanner.nextInt();

					Set<Libri> libriCercati = libri.stream()
							.filter(libro -> libro.getAnnoPubblicazione() == annoCercare)
							.collect(Collectors.toSet());

					Set<Riviste> rivisteCercate = riviste.stream()
							.filter(rivista -> rivista.getAnnoPubblicazione() == annoCercare)
							.collect(Collectors.toSet());

					if(!libriCercati.isEmpty()) {
						System.out.println("Libri trovati: " + libriCercati);
					} 
					
					if(!rivisteCercate.isEmpty()) {
						System.out.println("Riviste trovate: " + rivisteCercate);
					}
					
					if(libriCercati.isEmpty() && rivisteCercate.isEmpty()) {
						System.out.println("Nessun libro o rivista con l'anno di pubblicazione " + annoCercare + " trovato.");
					}
					break;

				case 0:
					
					break;

				default:
					System.out.println("Scelta non valida, per favore riprova.");
					break;
			}
		} while (choice != 4);

		scanner.close();
	}
}
