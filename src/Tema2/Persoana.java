// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema2;

public class Persoana {
	
	private Locatie locatie;
	private String nume;
	private String contact;
	
	public Persoana()
	{
		this.locatie = null;
		this.nume = null;
		this.contact = null;
	}
	
	public Persoana (Locatie locatie, String nume, String contact)
	{
		this.locatie = new Locatie();
		this.locatie = locatie;
		this.nume = nume;
		this.contact = contact;
	}

	public void afisare() {

		System.out.println("Nume: " + this.nume);
		System.out.println("Contact: " + this.contact);
		System.out.println("");
		this.locatie.afisare();
		System.out.println("");
	}
	
	public Locatie transmiteLocatie()
	{
		return this.locatie;
	}
	
	public static boolean verificareDate(Locatie locatie, String nume, String contact) {
		boolean isOk = false;
		for(int i = 0; i < contact.length(); i++) {
			if(contact.contains("@gmail.com")) {
				isOk = true;
			}
		}
		return isOk;
	}
};
