package d14_1_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		Autor dva = new Autor("Branko", "Copic");
		Knjiga jedan = new Knjiga("123456789", "Orlovi rano lete", "1945");
		dva.setknjiga(jedan);
		dva.print();
		System.out.println();

		Knjiga knjiga2 = new Knjiga("34567890", "Ubiti pticu rugalicu", "1980.");
		Autor autor2 = new Autor("Harper", " Li");
		autor2.setknjiga(knjiga2);
		autor2.print();
		System.out.println();
		Knjiga knjiga3 = new Knjiga("09876543", "Idi postavi strazara", "2015.");
		autor2.setknjiga(knjiga3);
		autor2.print();
		System.out.println();

		Knjiga knjiga4 = new Knjiga("56789uy", "Kafka na obali mora", "2002.");
		Autor autor3 = new Autor("Haruki", " Murakami");
		autor3.setknjiga(knjiga4);
		autor3.print();
		System.out.println();

		Knjiga knjiga5 = new Knjiga("fghj98765", "Normalni ljudi", "2018.");
		Autor autor4 = new Autor("Sali ", "Runi");
		autor4.setknjiga(knjiga5);
		System.out.println();

		Knjiga knjiga6 = new Knjiga("fghj7yhn", "Bajni svete, gde si", "2021.");
		autor4.setknjiga(knjiga6);
		autor4.print();
		System.out.println();
	}

}
