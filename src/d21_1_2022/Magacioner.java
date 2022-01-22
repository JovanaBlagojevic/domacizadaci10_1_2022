package d21_1_2022;

public class Magacioner extends Radnik {
	int suma = 0;
	int brojac = 0;

	private double prosecnaPlata() {
		for (int i = 0; i < this.sektori.size(); i++) {
			suma = +this.sektori.get(i).getPlata();
			brojac++;

		}
		return (suma / brojac) * 0.5;

	}

	@Override
	public int plataRadnika(int plata) {
		return (int) (prosecnaPlata() * brojac);
	}

	@Override
	public Sektor zapoliUSektor(Sektor sektor) {
		// TODO Auto-generated method stub
		return null;
	}

}
