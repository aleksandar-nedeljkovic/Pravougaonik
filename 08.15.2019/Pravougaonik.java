package domaci08152019;

public class Pravougaonik {
	private double a;
	private double b;
	private String ime;

	
	public Pravougaonik (String ime, double a, double b) {
		this.a = a;
		this.b = b;
		this.ime = ime;

	}
	public Pravougaonik (String ime, double n) {
		a = n;
		b = n;
		this.ime = ime;

	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}

	public String getIme() {
		return ime;
	}
	public double getObim(double a, double b) {
		double obim = 2*(a+b);
		return obim;
	}
	public double getPovrsina(double a, double b) {
		double povrsina = a*b;
		return povrsina;
	}
	public String ispisPravougaonika () {
		String ispis = "";
		ispis = ispis + "\nIme: " +ime;
		ispis = ispis + "\nDuzina prve stranice je: "+ a;
		ispis = ispis + "\nDuzina druge stranice je: "+b;
		ispis = ispis + "\nObim pravougaonika je: " +getObim(a,b);
		ispis = ispis + "\nPovrsina pravougaonika je: " +getPovrsina(a,b);
		return ispis;
	}
}
