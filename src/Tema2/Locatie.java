// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tema2;

public class Locatie {

	private String tara;
	private String localitate;
	private String strada;
	private String numar;
	
	public Locatie ()
	{
		tara = null;
		localitate = null;
		strada = null;
		numar = null;
	}
	
	public Locatie(String tara, String localitate, String strada, String numar)
	{
		this.tara = tara;
		this.localitate = localitate;
		this.strada = strada;
		this.numar = numar;
	}
	
	public void afisare() {
		System.out.println("Locatia se afla in tara: " + this.tara);
		System.out.println("Localitatea: " + this.localitate);
		System.out.println("Strada: " + this.strada);
		System.out.println("Numarul: " + this.numar);
	}
	
	public String getTara()
	{
		return this.tara;
	}
	public String getLocaliate()
	{
		return this.localitate;
	}
};
