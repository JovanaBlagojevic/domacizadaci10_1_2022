package d20_1_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Igrac igrac = new Igrac("Nikola Dukic", "1001998765432", "1998", 32, "golman", true);
		Trener trener = new Trener("Stefan Vucetic", "15079808764567", "1980", 10, "kondicioni");
		igrac.print();
		trener.print();

	}

}
