package adaptation;

public class Population {
	Species species=new Species();
	int count=0;

	public Population() {}

	public void setSpecies(Species s) {
		species=s;
	}

	public Species getSpecies() {
		return species;
	}

	public void setCount(int c) {
		count=c;
	}

	public int getCount() {
		return count;
	}
}
