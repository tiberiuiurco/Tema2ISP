package Tema2;
import java.util.ArrayList;

public class testIoana {
	public static void main(String[] args)
	{
		Locatie l1 = new Locatie("Bulgaria", "Ploiesti", "Bobilna", "85");
		l1.afisare();
		System.out.println("");
		
		//destinatarul
		Persoana p1 = new Persoana(l1,"Alex", "gmail");
		p1.afisare();
		
		Comanda c0 = new Comanda();
		
		ArrayList<Curier> curieri = new ArrayList<Curier>();
		curieri.add(new Curier("Gigel Marin", c0, true));
		curieri.add(new Curier("Vasile Munteanu", c0, true));
		curieri.add(new Curier("Dan Damian", c0, true));
		curieri.add(new Curier("Georgeta Saru", c0, true));
		curieri.add(new Curier("Fabian Andreescu", c0, true));
		
		Client client = new Client(l1, "Anca Marin", "anca@gmail.com");
		
		Administrator admin = new Administrator("admin");
		admin.preluareClient(client);
		
		admin.creazaComanda(2000, 3, 5, 0, Valuta.Ron, false, p1, false);
		
		/*private int distanta;
		private int greutate;
		private int volum;
		private int pret;
		private Valuta valuta;
		private boolean livrata;
		private Persoana destinatar;
		private boolean platita;
		*/
		
		//afisare curieri 
		for (int i = 0; i < curieri.size(); i ++)
			curieri.get(i).afisare();
		
		//cautare curieri
		for (int i = 0; i < curieri.size(); i ++)
			if (curieri.get(i).esteDisponibil()) {
				curieri.get(i).primesteComanda(client.getComanda());
				break;
			}
		
		for (int i = 0; i < curieri.size(); i ++)
			curieri.get(i).afisare();
	}
}
