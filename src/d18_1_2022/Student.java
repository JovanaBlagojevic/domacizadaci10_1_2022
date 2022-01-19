package d18_1_2022;

import java.util.ArrayList;

public class Student {
	private String brojIndeksa;
	private String imeIPrezime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	Student(String brojIndeksa, String imeIPrezime, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.imeIPrezime = imeIPrezime;
		this.tipStudija = tipStudija;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public int prosek() {
		int prosek = 0;
		int brojac = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (this.ispiti.get(i).polozenIspit()) {
				prosek = this.ispiti.get(i).getOcena() + prosek;
				brojac++;
			}
		}
		return prosek = prosek / brojac;
	}

	public void print() {
		System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Prosecna ocena je " + this.prosek());
	}

}
