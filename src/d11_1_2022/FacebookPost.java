package d11_1_2022;

public class FacebookPost {
	String imeIPrezimeObjavePosta;
	String imeIPrezimeNaCijemProfilu;
	String tekstObjave;
	int brojLajkova;
	int brojDeljenja;

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
