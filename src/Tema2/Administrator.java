// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema2;

public class Administrator {

	private String nume;
	private Client client;
	
	public Administrator(String nume, Client client){
		this.nume = nume;
		this.client = new Client();
		this.client = client;
	}

	public void afisare() {
		System.out.println("Nume: " + nume);
		System.out.println("Client: ");
		client.afisare();
	}

	public void preluareClient(Client c) {
		this.client = c;
	}

	public void creazaComanda(int distanta, int greutate, int volum, int pret, Valuta valuta, boolean livrata, Client expeditor, Persoana destinatar, boolean platita) {
		Comanda comanda = new Comanda(distanta, greutate, volum, pret, valuta, livrata, expeditor, destinatar, platita);
		if(client != null) {
			client.primesteComanda(comanda);
		}		
	}
	public boolean verificaDisponibilitateCurier(Curier curier){
		return curier.esteDisponibil();
	}
	
};
