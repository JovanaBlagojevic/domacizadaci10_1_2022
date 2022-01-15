package d11_1_2022;

public class SmartAirConditioning {
	String marka;
	int potrosnjaHladjenje;
	int potrosnjaGrejanje;
	int temperatura;
	boolean mod;

	public void stampaj() {
		System.out.println(this.marka + " " + " " + this.temperatura + " stepeni Celzijusa.");
	}

	private int mesecnaPotrosnja() {
		int potrosnja;
		if (mod) {
			potrosnja = 30 * 15 * potrosnjaGrejanje;
		} else
			potrosnja = 30 * 15 * potrosnjaHladjenje;
		return potrosnja;
	}

	public void novac() {
		int suma = mesecnaPotrosnja();		
			int jeftinaStruja = 350;
			int skupaStruja = suma - jeftinaStruja;
			jeftinaStruja = 350 * 6;
			skupaStruja = skupaStruja * 9;
			int racun = jeftinaStruja + skupaStruja;
			System.out.println("Racun iznosi " + racun + " dinara.");
		}

	}
