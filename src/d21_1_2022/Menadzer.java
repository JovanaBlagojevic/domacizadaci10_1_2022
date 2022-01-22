package d21_1_2022;

public class Menadzer extends Radnik {

	@Override
	public int plataRadnika(int plata) {
		for (int i = 0; i < super.sektori.size(); i++) {
			plata = +this.plataRadnika(i);
		}
		return plata;
	}

	@Override
	public Sektor zapoliUSektor(Sektor sektor) {
		// TODO Auto-generated method stub
		return null;
	}

}
