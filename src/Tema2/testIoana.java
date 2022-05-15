package Tema2;
import java.util.ArrayList;

public class testIoana {
	public static void main(String[] args)
	{
		//adminul
		Administrator admin = new Administrator("admin");
		
		Locatie l1 = new Locatie("Romania", "Ploiesti", "Bobilna", "85");
		Locatie l2 = new Locatie("Bulgaria", "Varna", "Bobilna", "85");
		//l1.afisare();
		
		//destinatarul
		Persoana p1 = new Persoana(l1,"Alex", "alex@gmail");
		//p1.afisare();
		
		//expeditorul
		Client client = new Client(l2, "Anca Marin", "anca@gmail.com");
		
		//lista de curieri
		ArrayList<Curier> curieri = new ArrayList<Curier>();
		curieri.add(new Curier("Gigel Marin", true));
		curieri.add(new Curier("Vasile Munteanu", true));
		curieri.add(new Curier("Dan Damian", true));
		curieri.add(new Curier("Georgeta Saru", true));
		curieri.add(new Curier("Fabian Andreescu", true));

		//operatii facute de admin
		admin.preluareClient(client);	//ia datele de la client
		admin.creazaComanda(2000, 3, 5, 0, Valuta.Ron, false, client, p1, false);	//si creaza comanda

		//cautare curieri
		for (int i = 0; i < curieri.size(); i ++) {
			if (curieri.get(i).esteDisponibil()) {
				curieri.get(i).primesteComanda(admin.getClient().getComanda());
				break;
			}
		}
		
		//afisare curieri
		for (int i = 0; i < curieri.size(); i ++) {
			curieri.get(i).afisare();
			System.out.println("");
			System.out.println("");
		}
			
	}
}
