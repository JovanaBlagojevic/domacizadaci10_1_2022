package d10_1_2022;

public class SmartAirConditioning {
	String marka;
	double temperatura;
	String mod;

	public void stampa() {
		System.out.println("Klima je marke: " + this.marka);
		System.out.println("Izabrana temperatura je (min 16 stepeni, max 35 stepeni): " + this.temperatura);
		System.out.println("Da li greje ili hladi?" + this.mod);
	}
}
