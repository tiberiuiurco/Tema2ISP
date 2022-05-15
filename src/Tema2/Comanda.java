// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema2;

public class Comanda {
	
	private int distanta;
	private int greutate;
	private int volum;
	private int pret;
	private Valuta valuta;
	private boolean livrata;
	private Client expeditor;
	private Persoana destinatar;
	private boolean platita;
	
	public Comanda() {
		
	}

	public Comanda(int distanta, int greutate, int volum, int pret, Valuta valuta, boolean livrata, Client expeditor, Persoana destinatar, boolean platita) {
		this.distanta = distanta;
		this.greutate = greutate;
		this.volum = volum;
		this.valuta = valuta;
		this.livrata = livrata;
		this.expeditor = expeditor;
		this.destinatar = destinatar;
		this.platita = platita;
	}
	
	public void afisare() {
		System.out.println("Distanta: " + distanta);
		System.out.println("Greutate: " + greutate);
		System.out.println("Volum: " + volum);
		System.out.println("Pret: " + pret);
		System.out.println("Valuta: " + valuta);
		
		if (livrata)
			System.out.println("Livrata: DA");
		else 
			System.out.println("Livrata: NU");
		
		expeditor.afisare();
		destinatar.afisare();
		
		if (platita)
			System.out.println("Platita: DA");
		else 
			System.out.println("Platita: NU");
		System.out.println("");
	}
	
	public float calcularePret() {
		float pret_per_kg = 0.3f;
		float pret_per_km = 0.3f;
		float pret_per_m3 = 200.0f;
		return conversieValutara(pret_per_kg*greutate+pret_per_km*distanta+pret_per_m3*volum);
	}
	
	public float conversieValutara(float pretInLei) {
		switch(this.valuta) {
		case Euro:
			return pretInLei*0.202f;
		case Rubla:
			return pretInLei*13.634f;
		case Ron:
			return pretInLei;
		case FrancElvetian:
			return pretInLei*0.211f;
		case Lira:
			return pretInLei*0.171f;
		default:
			return pretInLei;
		}
	}
	
	public void marcheazaLivrat() {
		this.livrata = true;
	}
	
	public int calculareDistanta() {
		
	}
	
	public void marcheazaPlatita() {
		this.platita = true;
	}
	
	public float calculareTaxe() {
		switch(this.valuta) {
		case Euro:
			return 1.11f;
		case Rubla:
			return 1.20f;
		case Ron:
			return 1f;
		case FrancElvetian:
			return 1.15f;
		case Lira:
			return 1.25f;
		default:
			return 1f;
		}
	}
};
