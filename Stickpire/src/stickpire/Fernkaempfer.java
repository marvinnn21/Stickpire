package stickpire;

public class Fernkaempfer extends Figur {
	int reichweite;

	public Fernkaempfer(String name, int leben, int geschwindigkeit, int angriff, int angriffsrate, int reichweite,
			int kosten) {
		super(name, leben, geschwindigkeit, angriff, angriffsrate, kosten);
		this.reichweite = reichweite;
	}

	public int getReichweite() {
		return this.reichweite;
	}

}
