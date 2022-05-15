package Tema2;
import java.util.ArrayList;

public class testIoana {
	public static void main(String[] args)
	{
		Locatie l1 = new Locatie("Bulgaria", "Ploiesti", "Bobilna", "85");
		l1.afisare();
		System.out.println("");
		
		Persoana p1 = new Persoana(l1,"Alex", "gmail");
		p1.afisare();
		
		Comanda c0 = new Comanda();
		
		ArrayList<Curier> curieri = new ArrayList<Curier>();
		curieri.add(new Curier("Gigel Marin", c0, true));
		curieri.add(new Curier("Vasile Munteanu", c0, true));
		curieri.add(new Curier("Dan Damian", c0, true));
		curieri.add(new Curier("Georgeta Saru", c0, true));
		curieri.add(new Curier("Fabian Andreescu", c0, true));
		
		for (int i = 0; i < curieri.size(); i ++)
			curieri.get(i).afisare();
	}
}
