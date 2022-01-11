package d11_1_2022;

public class Prvi_zadatak {

	public static void main(String[] args) {
		Proizvod a = new Proizvod();
		a.cena = 40;
		a.naziv = "Krompir";
		a.tezina = 100;
		a.stampaj();
		a.povecanje(30);
		a.vratiCenuSaPopustom(20);
		System.out.println("Cena postarine za ovaj proizvod je " + a.racunajPostarinu());

		Proizvod b = new Proizvod();
		b.cena = 340;
		b.naziv = "Kosulja";
		b.tezina = 300;
		b.stampaj();
		b.povecanje(80);
		b.vratiCenuSaPopustom(60);
		System.out.println("Cena postarine za ovaj proizvod je " + b.racunajPostarinu());
	}

}
