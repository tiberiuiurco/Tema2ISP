// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema2;

public class Curier {

	private String nume;
	private Comanda comanda;
	private boolean disponibil;
	
	public Curier(String nume, Comanda comanda, boolean disponibil) {
		this.nume = nume;
		this.comanda = null;
		this.disponibil = disponibil;
	}

	public void afisare() {
		System.out.println("Nume: " + nume);
		System.out.println("Comanda: ");
		if (this.comanda != null)
			this.comanda.afisare();
		if (disponibil)
			System.out.println("Disponibil: DA");
		else
			System.out.println("Disponibil: NU");
		System.out.println("");
	}
	
	public void marcheazaLivrat() {
		this.comanda.marcheazaLivrat();
	}
	
	public void primesteComanda(Comanda comanda) {
		this.comanda = new Comanda();
		this.comanda = comanda;
	}
	
	public boolean esteDisponibil() {
		return disponibil;
	}
};
