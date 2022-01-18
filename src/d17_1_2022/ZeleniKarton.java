package d17_1_2022;

public class ZeleniKarton {
	private String imeIPrezime;
	private String indeks;
	private String predmet;
	private String profesor;
	private int ocena;
	
	ZeleniKarton(String imeIPrezime, String indeks, String predmet, String profesor, int ocena){
		this.imeIPrezime = imeIPrezime;
		this.indeks = indeks;
		this.predmet = predmet;
		this.profesor = profesor;
		this.ocena = ocena;
	}
	public String getimeIPrezime () {
		return this.imeIPrezime;
	}
	public void setimeIPrezime (String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public String getindeks() {
		return this.indeks;
	}
	public void setindeks (String indeks) {
		this.indeks = indeks;
	}
	public String getpredmet() {
		return this.predmet;
	}
	public void setpredmet(String predmet) {
		this.predmet = predmet;
	}
	public String getprofesor() {
		return this.profesor;
	}
	public void setprofesor(String profesor) {
		this.profesor = profesor;
	}
	public int getocena () {
		return this.ocena;
	}
	public void setocena(int ocena) {
		this.ocena = ocena;
	}
	public boolean polozenIspit() {
		return this.ocena > 5;
	}
	public void print () {
		System.out.println("Naziv predmeta: " + this.predmet + " Ocena: " + this.ocena);
		System.out.println("Ime studenta i broj indeksa: " + this.imeIPrezime + this.indeks);
		System.out.println("Profesor: " + this.profesor);
	}

}
