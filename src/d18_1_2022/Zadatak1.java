package d18_1_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Student jedan = new Student("IS15/43", "Jovana Blagojevic", "Osnovne studije");
		Ispit prvi = new Ispit("Americki 20. vek", 10, "Radina Vucetic");
		Ispit drugi = new Ispit("Istorijska geografija", 9, "Jelena Mrgic");
		Ispit treci = new Ispit("Kulturna istorija 20. veka", 10, "Milan Ristovic");
		Ispit cetvrti = new Ispit("Drustvena istorija 20. veka", 9, "Dubravka Stojanovic");
		jedan.dodajIspit(prvi);
		jedan.dodajIspit(drugi);
		jedan.dodajIspit(treci);
		jedan.dodajIspit(cetvrti);
		jedan.print();
	}

}
