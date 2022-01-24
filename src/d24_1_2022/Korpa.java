package d24_1_2022;

import java.util.ArrayList;

public class Korpa {
	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		ambalaze.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < ambalaze.size(); i++) {
			if (ambalaze.get(i).barkod.equals(barkod)) {
				ambalaze.remove(i);
			}
		}
	}

	private int cenaSaPopustom(int popust) {
		int suma = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			return suma - ((suma * popust) / 100);
		}

		return suma;
	}

	public int ukupnaCena(SuperKartica kartica) {
		int suma = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			suma += this.ambalaze.get(i).cena();
		}
		return suma - ((suma * kartica.getPopust()) / 100);
	}

}
