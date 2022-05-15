package Tema2;

import java.util.ArrayList;

public class testAlex {
	public static void main(String[] args)
	{
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
		
		ArrayList<Locatie> listaOrase = new ArrayList<Locatie>();
		listaOrase.add(l1);
		listaOrase.add(l2);
		listaOrase.add(l3);
		listaOrase.add(l4);
		listaOrase.add(l5);
		listaOrase.add(l6);
		listaOrase.add(l7);
		listaOrase.add(l8);
		
		listaOrase.get(5).afisare();
		
		int [][] harta = {
						{0,1,0,0,0,0,0,0}, //Ploiesti
						{1,0,0,0,1,1,0,1}, //Bucuresti
						{0,0,0,1,1,0,1,0}, //Barcelona
						{0,0,1,0,0,0,1,0}, //Londra
						{0,0,0,0,0,0,0,0}, //Roma
						{0,0,0,0,0,0,0,0}, //Moscova
						{0,0,0,0,0,0,0,0}, //Zurich
						{0,0,0,0,0,0,0,0}, //Vienna
						};
		
	}
}
