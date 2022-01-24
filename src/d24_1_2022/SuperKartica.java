package d24_1_2022;

public class SuperKartica {
	private String broj;
	private String imeIPrezime;
	private int popust;

	public SuperKartica() {
		super();
	}

	SuperKartica(String broj, String imeIPrezime, int popust) {
		this.broj = broj;
		this.imeIPrezime = imeIPrezime;
		this.popust = popust;
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

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

	public void print() {
		System.out.println("Broj kartice " + this.broj + " korisnik je " + this.imeIPrezime);
	}

}
