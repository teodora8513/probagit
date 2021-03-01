package biblioteka.inrterfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterface {

	public void dodajKnjiga(Knjiga knjiga);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(
			Autor autor, String isbn, String naslov, String izdavac);
}
