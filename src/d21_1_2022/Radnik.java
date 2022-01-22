package d21_1_2022;

import java.util.ArrayList;

public abstract class Radnik {
	protected String imeIPrezime;
	ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public abstract int plataRadnika(int plata);

	public abstract Sektor zapoliUSektor(Sektor sektor);

}
