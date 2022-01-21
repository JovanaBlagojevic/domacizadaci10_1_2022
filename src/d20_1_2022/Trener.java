package d20_1_2022;

public class Trener extends Osoba {
	private int godineIskustva;
	private String tipTrenera;

	Trener() {

	}

	public Trener(String imeIPrezime, String jmbg, String godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	public void print() {
		super.print();
		System.out.println("Ovo je " + this.tipTrenera + " trener sa " + this.godineIskustva + " godina iskustva.");
	}
}
