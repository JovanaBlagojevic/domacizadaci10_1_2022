package d18_1_2022;

public class Ispit {
	private String naziv;
	private int ocena;
	private String profesor;

	Ispit() {

	}

	Ispit(String naziv, int ocena, String profesor) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.profesor = profesor;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public boolean polozenIspit() {
		return this.ocena > 6;
	}

	public void print() {
		System.out.println("Ime predmeta: " + this.naziv + " - profesor: " + this.profesor + " Ocena: " + this.ocena);
	}
}
