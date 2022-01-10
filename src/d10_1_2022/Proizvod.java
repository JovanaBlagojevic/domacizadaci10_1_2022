package d10_1_2022;

public class Proizvod {
 String naziv;
 double cena;
 double tezinaUgr;
 
 public void stampaj() {
	System.out.println("{{" + this.naziv + "}}, "+ " {{" + this.cena + "}}, " + " {{" + this.tezinaUgr + "}} "); 
 }
}
