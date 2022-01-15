package d14_1_2022;

public class Knjiga {
	private String isbn;
	private String naziv;
	private String godina;

	Knjiga(String isbn, String naziv, String godina) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godina = godina;
	}

	public String getisbn() {
		return this.isbn;
	}

	public void setisbn(String isbn) {
		this.isbn = isbn;
	}

	public String getnaziv() {
		return this.naziv;
	}

	public void setnaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getgodina() {
		return this.godina;
	}

	public void setgodina(String godina) {
		this.godina = godina;
	}

	public void print() {
		System.out.println("ISBN knjige je " + this.isbn);
		System.out.println("Delo " + this.naziv + " iz  " + this.godina + " godine.");
	}
}
