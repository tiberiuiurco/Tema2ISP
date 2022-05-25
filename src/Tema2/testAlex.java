package Tema2;

import java.util.ArrayList;

public class testAlex {
	public static void main(String[] args)
	{
		
		int [][] harta = {
				{0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 }, //Ploiesti
				{1 ,0 ,0 ,0 ,20,20,0 ,11}, //Bucuresti
				{0 ,0 ,0 ,15,13,0 ,10,0 }, //Barcelona
				{0 ,0 ,15,0 ,0 ,0 ,6 ,0 }, //Londra
				{0 ,20,13,0 ,0 ,0 ,9 ,11}, //Roma
				{0 ,20,0 ,0 ,0 ,0 ,0 ,19}, //Moscova
				{0 ,0 ,10,6 ,9 ,0 ,0 ,7 }, //Zurich
				{0 ,11,0 ,0 ,11,19,7 ,0 }, //Vienna
				};
		
		Locatie l1 = new Locatie("Romania", "Ploiesti", "Bobilna", "85");
		Locatie l2 = new Locatie("Romania", "Bucuresti", "Timisoara", "58M");
		Locatie l3 = new Locatie("Spania", "Barcelona", "Paseo de Gracia", "38");
		Locatie l4 = new Locatie("Regatul Unit", "Londra", "Abbey Road", "74A");
		Locatie l5 = new Locatie("Italia", "Roma", "Via Giulia", "5B");
		Locatie l6 = new Locatie("Rusia", "Moscow", "Tverskoy boulevard", "69T");
		Locatie l7 = new Locatie("Elvetia", "Zurich", "Ackerstrasse", "46R");
		Locatie l8 = new Locatie("Austria", "Vienna", "Höhenstraße", "23E");
		l1.afisare();
		
		Persoana p1 = new Persoana(l1,"Alex", "gmail");
		p1.afisare();
		
		Administrator admin1 = new Administrator("admin");
		Client c1 = new Client(l1, "Ion Ion", "ion@gmail.com");
		admin1.preluareClient(c1);	//ia datele de la client
		admin1.creazaComanda(2000, 3, 5, 0, Valuta.Ron, false, c1, p1, false);
		
		ArrayList<Locatie> listaOrase = new ArrayList<Locatie>();
		listaOrase.add(l1);
		listaOrase.add(l2);
		listaOrase.add(l3);
		listaOrase.add(l4);
		listaOrase.add(l5);
		listaOrase.add(l6);
		listaOrase.add(l7);
		listaOrase.add(l8);
		
		int distanta;
		System.out.println("Traseul este:");
		distanta = admin1.getClient().getComanda().calculareDistanta(listaOrase, harta, p1, c1);
		System.out.println("\nDistanta este de: "+distanta+"km");
	}
	
	
}
