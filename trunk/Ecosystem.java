public class Ecosystem {
	public static int MILD_CLIMATE=0;
	public static int HOT_CLIMATE=1;
	public static int COLD_CLIMATE=2;
	public static int WET_CLIMATE=3;
	public static int DRY_CLIMATE=4;

	Population[] populations;
	Population[] nonPlayerPopulations;
	Population playerPopulation;

	int shelterSupply;
	int waterSupply;
	int vegetationSupply;
	int meatSupply;

	int climate;
	int predatorCount;
	int plantEaterCount;

	public Ecosystem() {}

	public void setPopulations(Populations[] p) {
		populations=p;
	}

	public Populations[] getPopulations() {
		return populations;
	}

	public void setNonPlayerPopulations(Population[] p) {
		nonPlayerPopulations=p;
	}

	public Population[] getNonPlayerPopulations() {
		return nonPlayerPopulations;
	}

	public void setPlayerPopulation(Population p) {
		playerPopulation=p;
	}

	public Population getPlayerPopulation() {
		return playerPopulation;
	}

	public void setShelterSupply(int s) {
		shelterSupply=s;
	}

	public int getShelterSupply() {
		return shelterSupply;
	}

	public void setWaterSupply(int w) {
		waterSupply=w;
	}

	public int getWaterSupply() {
		return waterSupply;
	}

	public void setVegetationSupply(int v) {
		vegetationSupply=v;
	}

	public int getVegetationSupply() {
		return vegetationSupply;
	}

	public void setMeatSupply(int m) {
		meatSupply=m;
	}

	public int getMeatSupply() {
		return meatSupply;
	}

	public void setClimate(int c) {
		climate=c;
	}

	public int getClimate() {
		return climate;
	}

	public void setPredatorCount(int p) {
		predatorCount=p;
	}

	public int getPredatorCount() {
		return predatorCount;
	}

	public void setPlantEaterCount(int p) {
		plantEaterCount=p;
	}

	public int getPlantEaterCount() {
		return plantEaterCount;
	}
}