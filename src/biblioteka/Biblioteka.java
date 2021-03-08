package biblioteka;

import java.util.LinkedList;
import java.util.List;

import biblioteka.inrterfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {

	
	private  List<Knjiga> knjige = new LinkedList<>();
	
	@Override
	public void dodajKnjiga(Knjiga knjiga) {
		if(knjiga==null)
			throw new NullPointerException("NE sme biti null");
		if(knjige.contains(knjiga))
			throw new RuntimeException("Knjiga vec postoji");
		knjige.add(knjiga);

	}

	
	
	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return (LinkedList<Knjiga>) knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		if(autor == null && isbn==null && naslov==null && izdavac == null)
			return (LinkedList<Knjiga>) knjige;
		List<Knjiga> rezultat = new LinkedList<>();
		for (Knjiga knjiga : knjige) {
			if(knjiga.getNaslov().contains(naslov))
				rezultat.add(knjiga);
		}
		
		return (LinkedList<Knjiga>) rezultat;
	}



	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
		
	}

}
