package d11_1_2022;

public class Drugi_zadatak {

	public static void main(String[] args) {
		SmartAirConditioning a = new SmartAirConditioning();
		a.marka = "Samsung";
		a.potrosnjaHladjenje = 250;
		;
		a.potrosnjaGrejanje = 350;
		;
		a.temperatura = 20;
		a.mod = "Hladi";
		a.stampaj();
		a.mesecnaPotrosnja();
		a.novac();
		System.out.println();

		SmartAirConditioning b = new SmartAirConditioning();
		b.marka = "Vox";
		b.potrosnjaHladjenje = 450;
		;
		b.potrosnjaGrejanje = 760;
		;
		b.temperatura = 18;
		b.mod = "Greje";
		b.stampaj();
		b.mesecnaPotrosnja();
		b.novac();

	}

}
