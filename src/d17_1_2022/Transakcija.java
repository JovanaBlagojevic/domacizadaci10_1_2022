package d17_1_2022;

public class Transakcija {
	private String id;
	private Racun posiljalac;
	private Racun primalac;

	Transakcija(String id, Racun posiljalac, Racun primalac) {
		this.id = id;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Racun posiljalac) {
		this.posiljalac = posiljalac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	public int izvrsiTransakciju(int vrednost) {
		return this.posiljalac.getStanje() - (vrednost + provizija()) 
				this.primalac.getStanje() + vrednost;
	}

	private double provizija() {
		int provizija = 45;
		if (izvrsiTransakciju(provizija) < 4500) {
			provizija = 45;
		} else
			provizija = (int) 0.1;
		return provizija;

	}

}
