package d24_1_2022;

public class Staklena extends Ambalaza {
	private int kaucijaFlasa;
	private boolean kaucija;
	private int osnovnaCena;

	public Staklena() {
		super();
	}

	public Staklena(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean kaucija,
			int osnovnaCena, int kaucijaFlasa) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.kaucijaFlasa = kaucijaFlasa;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isKaucija() {
		return kaucija;
	}

	public int getKaucijaFlasa() {
		return kaucijaFlasa;
	}

	public void setKaucijaFlasa(int kaucijaFlasa) {
		this.kaucijaFlasa = kaucijaFlasa;
	}

	public void setKaucija(boolean kaucija) {
		this.kaucija = kaucija;
	}

	public int getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		if (kaucija) {
			return this.osnovnaCena * 1.2 + this.kaucijaFlasa;
		}
		return this.osnovnaCena * 1.2;
	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Cena je " + this.cena() + " uz kauciju " + this.kaucijaFlasa);


	}

}
