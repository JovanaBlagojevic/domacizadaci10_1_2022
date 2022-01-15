package d11_1_2022;

public class Drugi_zadatak {

	public static void main(String[] args) {
		SmartAirConditioning a = new SmartAirConditioning();
		a.marka = "Samsung";
		a.potrosnjaGrejanje = 3;
		a.temperatura = 20;
		a.mod = true;;
		a.stampaj();
		a.novac();
		System.out.println();

		SmartAirConditioning b = new SmartAirConditioning();
		b.marka = "Vox";
		b.potrosnjaHladjenje = 2;
		b.temperatura = 18;
		b.mod = false;
		b.stampaj();
		b.novac();

	}

}
