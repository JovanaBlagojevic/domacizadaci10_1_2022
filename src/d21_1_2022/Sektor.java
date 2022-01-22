package d21_1_2022;

public class Sektor {
	protected String naziv;
	protected int plata;

	Sektor(String naziv, int plata) {
		this.naziv = naziv;
		this.plata = plata;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}
}
