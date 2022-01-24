package d24_1_2022;

public abstract class Ambalaza {
	protected String barkod;
	protected String nazivArtikla;
	protected int netoTezina;
	protected int brutoTezina;

	Ambalaza() {

	}

	Ambalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina) {
		this.barkod = barkod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}

	public int getNetoTezina() {
		return netoTezina;
	}

	public void setNetoTezina(int netoTezina) {
		this.netoTezina = netoTezina;
	}

	public int getBrutoTezina() {
		return brutoTezina;
	}

	public void setBrutoTezina(int brutoTezina) {
		this.brutoTezina = brutoTezina;
	}

	public int tezina() {
		return this.brutoTezina - this.netoTezina;
	}

	public abstract double cena();

	public abstract void print();
}
