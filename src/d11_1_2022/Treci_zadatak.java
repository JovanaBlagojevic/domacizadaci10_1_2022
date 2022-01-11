package d11_1_2022;

public class Treci_zadatak {

	public static void main(String[] args) {
		FacebookPost a = new FacebookPost();
		a.imeIPrezimeObjavePosta = "Vladimir Minic";
		a.imeIPrezimeNaCijemProfilu = "Milan Jovanovic";
		a.tekstObjave = "Je l pijemo veceras? :D";
		a.brojLajkova = 7;
		a.brojDeljenja = 15;
		a.dislike();
		a.like();
		a.share();
		a.print();
		System.out.println();
		FacebookPost b = new FacebookPost();
		b.imeIPrezimeObjavePosta = "Milan Jovanovic";
		b.imeIPrezimeNaCijemProfilu = "Vladimir Minic";
		b.tekstObjave = "Samo ako neces pricati viceve, lose mi lezu uz rakiju. B)";
		b.brojLajkova = 23;
		b.brojDeljenja = 67;
		b.dislike();
		b.like();
		b.share();
		b.print();

	}

}
