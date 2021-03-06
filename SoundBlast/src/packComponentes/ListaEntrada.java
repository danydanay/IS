package packComponentes;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEntrada {

	
	//Variables
	private ArrayList<Entrada> lista;
	
	public ListaEntrada() {
		this.lista = new ArrayList<Entrada>();
	}
	
	public void venderEntrada(int pPrecio) {
		Entrada entrada = new Entrada(pPrecio);
		this.lista.add(entrada);
	}
	
	private Iterator<Entrada> obIterator() {
		return this.lista.iterator();
	}
	
	public int cuantasTiene() {
		return this.lista.size();
	}
	
	public Entrada buscarEntrada(int pId) {
		Entrada entrada = null;
		boolean found = false;
		Iterator<Entrada> it = this.obIterator();
		while(it.hasNext() && !found) {
			entrada = it.next();
			if(entrada.getIdEntrada() == pId) {
				found = true;
			}
		}
		if(!found) {
			entrada= null;
		}
		return entrada;
	}
	
	public boolean existeEntrada(Entrada pEntrada) {
		boolean found = false;
		if(this.buscarEntrada(pEntrada.getIdEntrada()) != null) {
			found = true;
		}
		return found;
	}
	
	public int calcularBeneficio() {
		int benef = 0;
		Entrada entrada;
		Iterator<Entrada> it = this.obIterator();
		while(it.hasNext()) {
			entrada = it.next();
			benef = benef + entrada.getPrecio();
		}
		return benef;	
	}
}
