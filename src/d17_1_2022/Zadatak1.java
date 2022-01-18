package d17_1_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		ArrayList<ZeleniKarton> studenti = new ArrayList<ZeleniKarton>();
		ZeleniKarton jovana = new ZeleniKarton("Jovana Blagojevic", "IS15/43", "Americki 20.vek", "Radina Vucetic", 10);
		ZeleniKarton dusica = new ZeleniKarton("Dusica Stojanovic", "IS15/41", "Americki 20.vek", "Radina Vucetic", 10);
		ZeleniKarton vukasin = new ZeleniKarton("Vukasin Zoric", "IS15/01", "Americki 20.vek", "Radina Vucetic", 10);
		ZeleniKarton milos = new ZeleniKarton("Milos Corbic", "IS15/16", "Americki 20.vek", "Radina Vucetic", 10);
		ZeleniKarton neda = new ZeleniKarton("Neda Bozovic", "IS15/89", "Americki 20.vek", "Radina Vucetic", 9);
		ZeleniKarton mila = new ZeleniKarton("Mila Vujacic", "IS15/76", "Americki 20.vek", "Radina Vucetic", 9);
		ZeleniKarton jovan = new ZeleniKarton("Jovan Butovski", "IS15/26", "Americki 20.vek", "Radina Vucetic", 10);
		ZeleniKarton filip = new ZeleniKarton("Filip Bjelic", "IS15/42", "Americki 20.vek", "Radina Vucetic", 10);
		ZeleniKarton jelena = new ZeleniKarton("Jelena Ilic", "IS15/85", "Americki 20.vek", "Radina Vucetic", 8);
		ZeleniKarton stefan = new ZeleniKarton("Stefan Stojadinovic", "IS15/33", "Americki 20.vek", "Radina Vucetic",
				10);
		studenti.add(jovana);
		studenti.add(dusica);
		studenti.add(vukasin);
		studenti.add(milos);
		studenti.add(neda);
		studenti.add(mila);
		studenti.add(jovan);
		studenti.add(filip);
		studenti.add(jelena);
		studenti.add(stefan);

		System.out.println(studenti.size());
		 for (int i = 0; i <studenti.size(); i++) {
			 System.out.println("Naziv predmeta: " + studenti.get(i).getpredmet() + " Ocena: " + studenti.get(i).getocena());
			 System.out.println("Ime studenta: " + studenti.get(i).getimeIPrezime() + " Broj indeksa: " + studenti.get(i).getindeks());
		System.out.println("Profesor: " + studenti.get(i).getprofesor());
		 }
	}

}
