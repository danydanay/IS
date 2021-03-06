package packComponentes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.DefaultListModel;

public class ListaArtista {

	//Variables
	private ArrayList<Artista> listaArtistas;

	//Methods
	public ListaArtista(ArrayList<Artista> pListaArtistas) {
		this.listaArtistas = pListaArtistas;
	}
	
	public ListaArtista() {
		this.listaArtistas = new ArrayList<Artista>();
	}
	
	private Iterator<Artista> obIterator() {
		return this.listaArtistas.iterator();
	}
	
	public Artista getSolista() {
		Artista pAr = null;
		boolean found = false;
		Iterator<Artista> it = this.obIterator();
		while(it.hasNext() && !found) {
			pAr = it.next();
			if(pAr.getTipo() == Tipo.SOLISTA) {
				found = true;
			}
		}
		if(found = false) {
			pAr = null;
		}
		return pAr;
	}
	
	public void addArtista(String pNombre, Tipo pTipo) {
		this.listaArtistas.add(new Artista(pNombre, pTipo));
	}
	
	public void addArtista(Artista pArtista) {
		this.listaArtistas.add(pArtista);
	}
	
	public boolean estaArtista(String pArtista) {
		Artista pAr = null;
		boolean found = false;
		Iterator<Artista> it = this.obIterator();
		while(it.hasNext() && !found) {
			pAr = it.next();
			if(pAr.getNombre() == pArtista) {
				found = true;
			}
		}
		return found;
	}
	
	public Artista buscarArtista(String pNombre) {
		Artista pAr = null;
		boolean found = false;
		Iterator<Artista> it = this.obIterator();
		while(it.hasNext() && !found) {
			pAr = it.next();
			if(pAr.getNombre() == pNombre) {
				found = true;
			}
		}
		if(!found) {
			pAr = null;
		}
		return pAr;
	}
	
	public void eliminarArtista(Artista pArtista) {
		this.listaArtistas.remove(pArtista);
	}
	
	public ArrayList<Artista> getArtistas() {
		return this.listaArtistas;
	}
	
	
	public Iterator<String> rellenar() {
		Iterator<Artista> it = obIterator();
		ArrayList<String> sr = new ArrayList<String>();
		Artista ar = null;
		while(it.hasNext()) {
			ar = it.next();
			sr.add(ar.getNombre());
		}
		return sr.iterator();
	}
	
}
