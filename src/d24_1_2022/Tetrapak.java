package d24_1_2022;

public class Tetrapak extends Ambalaza {
	private boolean reciklaza;
	private int osnovnaCena;

	public Tetrapak() {
		super();

	}

	public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, boolean reciklaza,
			int osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public int getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		int cena = 0;
		if (reciklaza) {
			return (this.tezina() * 1.5) + this.osnovnaCena;
		} else
			return this.osnovnaCena;
	}

	@Override
	public void print() {
		System.out.println("Naziv artikla je " + this.nazivArtikla + " " + this.cena());

	}

}
