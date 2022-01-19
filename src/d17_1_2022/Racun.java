package d17_1_2022;

public class Racun {
	private String broj;
	private String imeIPrezime;
	private int stanje;

	Racun(String broj, String imeIPrezime, int stanje) {
		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.stanje = stanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getStanje() {
		return stanje;
	}

	public int trenutnoStanje(int stanje) {
		while (this.stanje != 0) {
			this.stanje = this.stanje - stanje;
		}
		return this.stanje;
	}

	public void print() {
		System.out.println("Ime i prezime " + this.imeIPrezime + " - broj racuna " + this.broj);
		System.out.println("Trenutno stanje na racunu je " + this.stanje + " dinara.");
	}
}