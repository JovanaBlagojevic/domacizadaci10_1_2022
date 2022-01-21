package d20_1_2022;

public class Igrac extends Osoba {
	private int brojDresa;
	private String pozicija;
	private boolean kapiten;

	Igrac() {

	}

	public Igrac(String imeIPrezime, String jmbg, String godinaRodjenja, int brojDresa, String pozicija,
			boolean kapiten) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.brojDresa = brojDresa;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrojDresa() {
		return brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void print() {
		super.print();
		System.out.println("Broj dresa: " + this.brojDresa + " na poziciji " + this.pozicija);
	}

}
