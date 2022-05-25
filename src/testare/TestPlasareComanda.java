package testare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Tema2.Administrator;
import Tema2.Client;
import Tema2.Comanda;
import Tema2.Locatie;
import Tema2.Persoana;
import Tema2.Valuta;

// Iurco Tiberiu-Iulian
// 331AA
class TestPlasareComanda {

	@Test
	void testVerificareDate() {
		// TESTUL 1
		
		// Declarare expeditor (client) si destinatar.
		Client expeditor1 = null;
		Persoana destinatar1 = null;
		
		String expeditor1_nume = "Mihai Constantin";
		String expeditor1_contact = "mconst221@gmail.com";
		Locatie expeditor1_locatie = new Locatie("Romania", "Runicar", "Zebrei", "2");
		
		// Variabile pentru stabilirea corectitudinii datelor.
		boolean expeditor1_verificare = Persoana.verificareDate(expeditor1_locatie, expeditor1_nume, expeditor1_contact);
		boolean destinatar1_verificare = false; // Declarare implicita, se va modifica pe parcurs daca este cazul
		
		// Verificare corectitudine date client si destinatar (dupa ce este creat).
		if(expeditor1_verificare) {
			// Creare obiect destinatar
			expeditor1 = new Client(expeditor1_locatie, expeditor1_nume, expeditor1_contact);
			String destinatar1_nume = "Mirela Ionescu";
			String destinatar1_contact = "mirela.ionescu@gmail.com";
			Locatie destinatar1_locatie = new Locatie("Regatul Unit", "Londra", "Kings", "41");
			destinatar1_verificare = Persoana.verificareDate(destinatar1_locatie, destinatar1_nume, destinatar1_contact);
			
			if(destinatar1_verificare) {
				destinatar1 = new Persoana(destinatar1_locatie, destinatar1_nume, destinatar1_contact);
			}
		}
		
		// Initializare administrator si administrare comanda clientului.
		Administrator admin = new Administrator("Constantin Paslaru");
		admin.preluareClient(expeditor1);
		admin.creazaComanda(200, 150, 3, 0, Valuta.Euro, false, expeditor1, destinatar1, false);
		
		// Declarara comanda ca platita
		boolean comanda1_platita = false;
		comanda1_platita = expeditor1.plateste();
		
		// In cazul de fata, testul ar trebui sa fie adevarat (corect).
		assertTrue(expeditor1_verificare && destinatar1_verificare && comanda1_platita);
		
		
		
		// TESTUL 2 - !! Se va folosi acelasi administrator.
		
		// Verificare corectitudine date client si destinatar (dupa ce este creat).
		Client expeditor2 = null;
		Persoana destinatar2 = null;
		
		// Introducere date Client
		String expeditor2_nume = "Alexandru Ispas";
		String expeditor2_contact = "alex.isp@gmail.com";
		Locatie expeditor2_locatie = new Locatie("Romania", "Croneker", "Zebrei", "2");

		// Declarare si initializare variabile pentru corectitudinea datelor
		boolean expeditor2_verificare = Persoana.verificareDate(expeditor1_locatie, expeditor1_nume, expeditor1_contact);
		boolean destinatar2_verificare = false; 
		
		// Aici incep verificarile
		if(expeditor2_verificare) {
			// Creare obiect expeditor (client)
			expeditor2 = new Client(expeditor2_locatie, expeditor2_nume, expeditor2_contact);
			// Creare obiect destinatar
			String destinatar2_nume = "Mihaela Bosnyac";
			String destinatar2_contact = "mirela.ionescu@hotmail.com";
			Locatie destinatar2_locatie = new Locatie("Japonia", "Tokyo", "Minato", "145");
			destinatar2_verificare = Persoana.verificareDate(destinatar2_locatie, destinatar2_nume, destinatar2_contact);
					
			if(destinatar2_verificare) {
				destinatar2 = new Persoana(destinatar2_locatie, destinatar2_nume, destinatar2_contact);
			}
		}
		
		// Preluarea clientului si crearea unei comenzi
		admin.preluareClient(expeditor2);
		admin.creazaComanda(400, 500, 2, 0, Valuta.Rubla, false, expeditor2, destinatar2, false);
		
		// Platirea comenzii
		boolean comanda2_platita = false;
		comanda2_platita = expeditor2.plateste();
		
		// Comanda este platita, datele pentru expeditor sunt bune, insa tara (nu se livreaza acolo), respectiv datele de contact nu sunt valide
		assertFalse(expeditor2_verificare && destinatar2_verificare && comanda1_platita);
		
		
		
		// TESTUL 3

		// Verificare corectitudine date client si destinatar (dupa ce este creat).
		Client expeditor3 = null;
		Persoana destinatar3 = null;
				
		// Introducere date Client
		String expeditor3_nume = "Teo Lucescu";
		String expeditor3_contact = "teol98@gmail.com";
		Locatie expeditor3_locatie = new Locatie("Rusia", "Moscova", "Zebrei", "2");

		// Declarare si initializare variabile pentru corectitudinea datelor
		boolean expeditor3_verificare = Persoana.verificareDate(expeditor1_locatie, expeditor1_nume, expeditor1_contact);
		boolean destinatar3_verificare = false; 
				
		// Aici incep verificarile
		if(expeditor3_verificare) {
			// Creare obiect expeditor (client)
			expeditor3 = new Client(expeditor3_locatie, expeditor3_nume, expeditor3_contact);
			// Creare obiect destinatar
			String destinatar3_nume = "Ciprian Matei";
			String destinatar3_contact = "cip_cip123@gmail.com";
			Locatie destinatar3_locatie = new Locatie("Austria", "Vienna", "Minato", "145");
			destinatar3_verificare = Persoana.verificareDate(destinatar3_locatie, destinatar3_nume, destinatar3_contact);
					
			if(destinatar3_verificare) {
				destinatar3 = new Persoana(destinatar3_locatie, destinatar3_nume, destinatar3_contact);
			}
		}
		
		// Preluarea clientului si crearea unei comenzi
		admin.preluareClient(expeditor3);
		admin.creazaComanda(400, 500, 2, 0, Valuta.Rubla, false, expeditor3, destinatar3, false);
		
		// Nu mai platim comanda
		boolean comanda3_platita = false;
		//boolean comanda3_platita = expeditor2.plateste();
				
		// Datele expeditorului si al destinatarului sunt corecte, insa comanda nu a fost platita
		assertFalse(expeditor3_verificare && destinatar3_verificare && comanda3_platita);
		
		
		
	}

}
