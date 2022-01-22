package d21_1_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		Sektor menadzer = new Sektor("Kadrovska", 50000);
		Sektor magacioner = new Sektor("Administracija", 65000);
		ArrayList<Sektor> sektori = new ArrayList<Sektor>();
		menadzer.setPlata(50000);
		magacioner.setPlata(65000);
		sektori.add(menadzer);
		sektori.add(magacioner);

		System.out.println("Radnik 1: " + menadzer.naziv + " ima platu " + menadzer.plata + " dinara.");
		System.out.println("Radnik 2: " + magacioner.naziv + " ima platu " + magacioner.plata + " dinara.");

	}

}
