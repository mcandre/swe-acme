import java.util.*;
public class Ecosystem {
	public static int COLD=0;
	public static int MILD=1;
	public static int HOT=2;

	Vector<Population> populations;
	Vector<Population> nonPlayerPopulations;
	Population playerPopulation;

	int shelterSupply;
	int waterSupply;
	int vegetationSupply;

	int temperature;
	int plantEaterCount;

	public Ecosystem() {}

	public Vector<Population> getPopulations() {
		populations = (Vector<Population>) nonPlayerPopulations.clone();
		populations.add(playerPopulation);
		return populations;
	}

	public void setNonPlayerPopulations(Vector<Population> p) {
		nonPlayerPopulations=p;
	}

	public Vector<Population> getNonPlayerPopulations() {
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

	public int getMeatSupply() {
		return meatSupply;
	}

	public void setTemperature(int c) {
		temperature=c;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getPredatorCount() {
		return predatorCount;
	}

	public int getPlantEaterCount() {
		return plantEaterCount;
	}
}