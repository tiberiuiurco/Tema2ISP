package Tema2;

public class testAlex {
	public static void main(String[] args)
	{
		Locatie l1 = new Locatie("Romania", "Ploiesti", "Bobilna", "85");
		l1.afisare();
		
		Persoana p1 = new Persoana(l1,"Alex", "gmail");
		p1.afisare();
		
	}
}
