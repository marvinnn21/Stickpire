package stickpire;

public abstract class Figur {
	private String name;
	private int leben, geschwindigkeit, angriff, angriffsrate, kosten;

	public Figur(String name, int leben, int geschwindigkeit, int angriff, int angriffsrate, int kosten) {
		this.name = name;
		this.setLeben(leben);
		this.geschwindigkeit = geschwindigkeit;
		this.angriff = angriff;
		this.angriffsrate = angriffsrate;
		this.kosten = kosten;
	}

	public String getName() {
		return name;
	}

	public int getLeben() {
		return leben;
	}

	public void setLeben(int leben) {
		this.leben = leben;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public int getAngriff() {
		return angriff;
	}

	public int getAngriffsrate() {
		return this.angriffsrate;
	}

	public int getKosten() {
		return this.kosten;
	}
}
