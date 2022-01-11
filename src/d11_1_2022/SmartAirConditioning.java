package d11_1_2022;

public class SmartAirConditioning {
	String marka;
	int potrosnjaHladjenje;
	int potrosnjaGrejanje;
	int temperatura;
	String mod;

	public void stampaj() {
		System.out.println(this.marka + " " + this.mod + " " + this.temperatura);
	}

	public void mesecnaPotrosnja() {
		int potrosnja;

		potrosnja = (30 * potrosnjaGrejanje) + (15 * potrosnjaHladjenje);
		System.out.println("Mesecna potrosnja iznosi " + potrosnja + " kW/h.");
	}

	public void novac() {
		int suma = this.potrosnjaGrejanje + this.potrosnjaGrejanje;
		int jeftinaStruja = 350;
		int skupaStruja = suma - jeftinaStruja;
		jeftinaStruja = 350 * 6;
		skupaStruja = skupaStruja * 9;
		int racun = jeftinaStruja + skupaStruja;
		System.out.println("Racun iznosi " + racun + " dinara.");
	}

}
