package adaptation;

import java.util.ArrayList;

public class Ecosystem {
	public static int COLD=0;
	public static int MILD=1;
	public static int HOT=2;

	ArrayList<Population> nonPlayerPopulations=new ArrayList<Population>();
	Population playerPopulation=new Population();

	int shelterSupply=0;
	int waterSupply=0;
	int vegetationSupply=0;
	int temperature=0;

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
		int count=0;
		for (Population p:nonPlayerPopulations) {
			if (p.getSpecies().getTeeth().diet==Teeth.CARNIVORE) {
				count+=p.getCount();
			}
		}

		return count;
	}

	public int getHerbivoreCount() {
		int count=0;
		for (Population p:nonPlayerPopulations) {
			if (p.getSpecies().getTeeth().diet==Teeth.HERBIVORE) {
				count+=p.getCount();
			}
		}

		return count;
	}

	public int getOmnivoreCount() {
		int count=0;
		for (Population p:nonPlayerPopulations) {
			if (p.getSpecies().getTeeth().diet==Teeth.OMNIVORE) {
				count+=p.getCount();
			}
		}

		return count;
	}

	public int getMeatEaterCount() {
		return getCarnivoreCount()+getOmnivoreCount();
	}

	public int getPlantEaterCount() {
		return getHerbivoreCount()+getOmnivoreCount();
	}
}