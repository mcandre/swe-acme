package adaptation;

public class Skin {
	private int defense=0;
	private int insulation=0;
	private int moistureRetention=0;

	public Skin() {}

	public void setDefense(int d) {
		defense=d;
	}

	public int getDefense() {
		return defense;
	}

	public void setInsulation(int i) {
		insulation=i;
	}

	public int getInsulation() {
		return insulation;
	}

	public void setMoistureRetention(int m) {
		moistureRetention=m;
	}

	public int getMoistureRetention() {
		return moistureRetention;
	}
}