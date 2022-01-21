package d20_1_2022;

public class Osoba {
	protected String imeIPrezime;
	protected String jmbg;
	protected String godinaRodjenja;

	Osoba() {

	}

	Osoba(String imeIPrezime, String jmbg, String godinaRodjenja) {
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(String godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void print() {
		System.out.println(this.imeIPrezime + " , " + this.jmbg + " , " + this.godinaRodjenja);
	}
}
