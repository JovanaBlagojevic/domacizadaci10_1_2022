package d14_1_2022;

public class Autor {
	private String ime;
	private String prezime;
	private Knjiga knjiga;

	Autor(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getime() {
		return this.ime;
	}

	public void setime(String ime) {
		this.ime = ime;
	}

	public String getprezime() {
		return this.prezime;
	}

	public void setprezime(String prezime) {
		this.prezime = prezime;
	}

	public Knjiga getknjiga() {
		return this.knjiga;
	}

	public void setknjiga(Knjiga knjiga) {
		this.knjiga = knjiga;
	}

	public void print() {
		System.out.println("ISBN knjige: " + this.knjiga.getisbn());
		System.out.println("Delo: " + this.knjiga.getnaziv() + " iz " + this.knjiga.getgodina() + " godine.");
		System.out.println("Autora " + ime + " " + prezime);
	}
}
