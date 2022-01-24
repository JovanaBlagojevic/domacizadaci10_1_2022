package d24_1_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		Korpa korpa = new Korpa();
		SuperKartica kartica = new SuperKartica("673627", "Jovana Blagojevic", 10);
		ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();
		Ambalaza mleko = new Tetrapak("23456787567765", "Moja Kravica", 50, 79, true, 70);
		Ambalaza jogurt = new Tetrapak("9876545677654567", "Dobro jutro jogurt", 100, 115, false, 120);
		Ambalaza kokakola = new Staklena("7567847263682368423", "Koka kola", 100, 120, false, 70, 10);
		Ambalaza pivo = new Staklena("73687636428961", "Jelen pivo", 98, 112, true, 120, 15);
		ambalaze.add(mleko);
		ambalaze.add(pivo);
		ambalaze.add(kokakola);
		ambalaze.add(jogurt);

		korpa.dodajAmbalazu(pivo);
		korpa.dodajAmbalazu(kokakola);
		korpa.dodajAmbalazu(jogurt);
		korpa.dodajAmbalazu(mleko);
		korpa.ukupnaCena(kartica);

		for (int i = 0; i < ambalaze.size(); i++) {
			ambalaze.get(i).print();
		}
		System.out.println("Ukupna cena je " + korpa.ukupnaCena(kartica));

	}

}
