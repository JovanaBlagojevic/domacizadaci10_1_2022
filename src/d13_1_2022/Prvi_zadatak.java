package d13_1_2022;

public class Prvi_zadatak {

	public static void main(String[] args) {
		FacebookPost j = new FacebookPost();
		j.setimeIPrezimeObjavePosta("Milan Jovanovic");
		j.setimeIPrezimeNaCijemProfilu("Vladimir Minic");
		j.settekstObjave("Neka peva ova kuca!");
		j.print();

		FacebookPost n = new FacebookPost();
		n.setimeIPrezimeObjavePosta("Lepa Brena");
		n.setimeIPrezimeNaCijemProfilu("Slobodan Zivojinovic");
		n.settekstObjave("Luda za tobom.");
		n.print();

		FacebookPost m = new FacebookPost("Jovana Blagojevic", "Milan Jovanovic", "Toss a coin to your witcher!");

	}

}
