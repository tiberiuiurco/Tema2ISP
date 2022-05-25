package testare;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Tema2.Administrator;
import Tema2.Client;
import Tema2.Locatie;
import Tema2.Persoana;
import Tema2.Valuta;

class test_distanta {

	@Test
	void testCalculareDistanta() {
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
		
		Locatie l1 = new Locatie("Romania", "Ploiesti", "Rudului", "85");
		Locatie l2 = new Locatie("Romania", "Bucuresti", "Preciziei", "58M");
		Locatie l3 = new Locatie("Spania", "Barcelona", "Paseo de Gracia", "38");
		Locatie l4 = new Locatie("Regatul Unit", "Londra", "Abbey Road", "74A");
		Locatie l5 = new Locatie("Italia", "Roma", "Via Giulia", "5B");
		Locatie l6 = new Locatie("Rusia", "Moscow", "Tverskoy boulevard", "69T");
		Locatie l7 = new Locatie("Elvetia", "Zurich", "Ackerstrasse", "46R");
		Locatie l8 = new Locatie("Austria", "Vienna", "Höhenstraße", "23E");
		
		Persoana p1 = new Persoana(l1,"Alexandru Machedon", "alexmac@gmail.com");
		
		Administrator admin1 = new Administrator("admin");
		Client c1 = new Client(l4, "Ion Barbu", "ionbarbu@gmai.com");
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
		
		//////initializare harta si locatiile posibile//////
		
		assertNotNull(p1.transmiteLocatie());
		assertNotNull(c1.transmiteLocatie());// verificare ca obiectele au fost create
		
		int distanta;
		distanta = admin1.getClient().getComanda().calculareDistanta(listaOrase, harta, p1, c1);
		boolean existaDrum = (distanta > 0);	///daca distana e 0 inseamna ca s-ar fi facut comanda din oras in acelasi oras
		assertTrue(existaDrum);
		assertEquals(2500,distanta);
		
		Persoana p2 = new Persoana (l6, "Evgeny Rostov", "evegenyr@gmail.com");
		assertNotNull(p2.transmiteLocatie());
		distanta = admin1.getClient().getComanda().calculareDistanta(listaOrase, harta, p2, c1);
		existaDrum = (distanta > 0);	// verificare corectitudine de calcul in cazul celor mai departate noduri
		assertTrue(existaDrum);
		assertEquals(3200,distanta);	
		
		Persoana p3 = new Persoana (l4, "Andrei Ardei", "gras@gmail.com");
		assertNotNull(p3.transmiteLocatie());
		distanta = admin1.getClient().getComanda().calculareDistanta(listaOrase, harta, p3, c1);
		assertEquals(0,distanta);	//verificare corectitudine de calculc a distantei in cazul in care se da acelasi oras
									//atat ca destinatie cat si sursa. Rezultatul asteptat este 0
	}

}
