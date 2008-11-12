package adaptation;

import java.util.ArrayList;

public class Ecosystem {
	public static int COLD=0;
	public static int MILD=1;
	public static int HOT=2;

	ArrayList<Population> nonPlayerPopulations;
	Population playerPopulation;

	int shelterSupply;
	int waterSupply;
	int vegetationSupply;
	int temperature;

	public Ecosystem() {}

	public void setNonPlayerPopulations(ArrayList<Population> p) {
		nonPlayerPopulations=p;
	}

	public ArrayList<Population> getNonPlayerPopulations() {
		return nonPlayerPopulations;
	}

	public void setPlayerPopulation(Population p) {
		playerPopulation=p;
	}

	public Population getPlayerPopulation() {
		return playerPopulation;
	}

	public ArrayList<Population> getPopulations() {
		ArrayList<Population> allPopulations=new ArrayList<Population>();
		allPopulations.addAll(nonPlayerPopulations);
		allPopulations.add(playerPopulation);

		return allPopulations;
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

	public void setTemperature(int c) {
		temperature=c;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getCarnivoreCount() {
		// ...

		return 0;
	}

	public int getHerbivoreCount() {
		// ...

		return 0;
	}
}