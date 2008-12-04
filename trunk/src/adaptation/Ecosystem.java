package adaptation;

import java.util.ArrayList;

public class Ecosystem {
	public static int COLD=0;
	public static int WARM=1;
	public static int HOT=2;

	private ArrayList<Population> nonPlayerPopulations=new ArrayList<Population>();
	private Population playerPopulation=new Population();

	private int shelterSupply=0;
	private int waterSupply=0;
	private int vegetationSupply=0;
	private int temperature=0;

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
		for (Population p:getPopulations()) {
			if (p.getSpecies().getTeeth().getDiet()==Teeth.CARNIVORE) {
				count+=p.getCount();
			}
		}

		return count;
	}

	public int getHerbivoreCount() {
		int count=0;
		for (Population p:getPopulations()) {
			if (p.getSpecies().getTeeth().getDiet()==Teeth.HERBIVORE) {
				count+=p.getCount();
			}
		}

		return count;
	}

	public int getOmnivoreCount() {
		int count=0;
		for (Population p:getPopulations()) {
			if (p.getSpecies().getTeeth().getDiet()==Teeth.OMNIVORE) {
				count+=p.getCount();
			}
		}

		return count;
	}

	public int getCreatureCount() {
		int count=0;
		for (Population p:getPopulations()) {
			count+=p.getCount();
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