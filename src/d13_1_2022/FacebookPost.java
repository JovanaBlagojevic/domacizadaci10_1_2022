package d13_1_2022;

public class FacebookPost {

	public String imeIPrezimeObjavePosta;
	public String imeIPrezimeNaCijemProfilu;
	public String tekstObjave;
	private int brojLajkova = 10;
	private int brojDeljenja = 25;

	public FacebookPost() {

	}

	public FacebookPost(String imeIPrezimeObjavePosta, String imeIPrezimeNaCijemProfilu, String tekstObjave) {
		System.out.println(imeIPrezimeObjavePosta + " >>> " + imeIPrezimeNaCijemProfilu);
		System.out.println(tekstObjave);
		System.out.println("Likes 145 | Shares 68");

	}

	public String getimeIPrezimeObjavePosta() {
		return this.imeIPrezimeObjavePosta;
	}

	public void setimeIPrezimeObjavePosta(String imeIPrezimeObjavePosta) {
		this.imeIPrezimeObjavePosta = imeIPrezimeObjavePosta;
	}

	public String getimeIPrezimeNaCijemProfilu() {
		return this.imeIPrezimeNaCijemProfilu;
	}

	public void setimeIPrezimeNaCijemProfilu(String imeIPrezimeNaCijemProfilu) {
		this.imeIPrezimeNaCijemProfilu = imeIPrezimeNaCijemProfilu;
	}

	public String gettekstObjave() {
		return this.tekstObjave;
	}

	public void settekstObjave(String tekstObjave) {
		this.tekstObjave = tekstObjave;
	}

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {
		this.brojLajkova = this.brojLajkova - 1;
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

	public void print() {
		System.out.println(this.imeIPrezimeObjavePosta + " >>> " + this.imeIPrezimeNaCijemProfilu);
		System.out.println(this.tekstObjave);
		System.out.println("Likes " + this.brojLajkova + " | " + "Shares " + this.brojDeljenja);
	}
}
