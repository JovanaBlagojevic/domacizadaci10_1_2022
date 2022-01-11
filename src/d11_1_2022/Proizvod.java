package d11_1_2022;

public class Proizvod {
String naziv;
int cena;
double tezina;

public void stampaj () {
	System.out.println("Naziv proizvoda je " + this.naziv);
	System.out.println("Cena " + this.cena);
	System.out.println("Gramaza: " + this.tezina);
}
public void povecanje (int povecanje) {
	this.cena = this.cena + povecanje;
	System.out.println("cena uz povecanje je " + this.cena);
}
public void vratiCenuSaPopustom (int popust) {
	int cenaSaPopustom = this.cena - ((this.cena * popust) / 100);
	System.out.println("Cena sa popustom je " + cenaSaPopustom);
}
public int racunajPostarinu () {
	int postarina;
	if (this.tezina <= 100) {
		 postarina = 200;}
	else if (this.tezina > 100 && this.tezina < 500) {
		 postarina = 400;}
	else 
		postarina = 1000;
	return postarina;
	}
}

