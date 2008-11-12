import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import adaptation.*;

public class TestEcosystem {
	@Test
	public void testPopulations() {
		Ecosystem e=new Ecosystem();

		ArrayList<Population> landAnimals=new ArrayList<Population>();
		Population moose=new Population();
		Population bear=new Population();
		Population cougar=new Population();
		landAnimals.add(moose);
		landAnimals.add(bear);
		landAnimals.add(cougar);

		Population monster=new Population();

		e.setNonPlayerPopulations(landAnimals);
		e.setPlayerPopulation(monster);

		ArrayList<Population> allPopulations=e.getPopulations();

		assertEquals(allPopulations.size(), 4);
	}

	@Test
	public void testSupplies() {
		Ecosystem e=new Ecosystem();

		e.setShelterSupply(5);
		e.setWaterSupply(10);
		e.setVegetationSupply(15);

		assertEquals(e.getShelterSupply()+e.getWaterSupply()+e.getVegetationSupply(), 30);
	}

	@Test
	public void testTemperature() {
		Ecosystem e=new Ecosystem();
		e.setTemperature(-100);

		assertEquals(e.getTemperature(), -100);
	}

	@Test
	public void testMeatEaters() {
		Ecosystem e=new Ecosystem();

		Teeth c=new Teeth();
		c.setDiet(Teeth.CARNIVORE);
		Teeth h=new Teeth();
		h.setDiet(Teeth.HERBIVORE);
		Teeth o=new Teeth();
		o.setDiet(Teeth.OMNIVORE);

		Species dog=new Species();
		dog.setTeeth(c);
		Species cow=new Species();
		cow.setTeeth(h);
		Species monkey=new Species();
		monkey.setTeeth(o);

		Species monster=new Species();
		monster.setTeeth(c);

		Population dogs=new Population();
		dogs.setSpecies(dog);
		dogs.setCount(4);
		Population cows=new Population();
		cows.setSpecies(cow);
		cows.setCount(4);
		Population monkeys=new Population();
		monkeys.setSpecies(monkey);
		monkeys.setCount(2);

		ArrayList<Population> wild=new ArrayList<Population>();
		wild.add(dogs);
		wild.add(cows);
		wild.add(monkeys);

		Population monsters=new Population();
		monsters.setSpecies(monster);
		monsters.setCount(2);

		e.setNonPlayerPopulations(wild);
		e.setPlayerPopulation(monsters);

		assertEquals(e.getMeatEaterCount(), 6);
	}

	@Test
	public void testPlantEaters() {
		Ecosystem e=new Ecosystem();

		Teeth c=new Teeth();
		c.setDiet(Teeth.CARNIVORE);
		Teeth h=new Teeth();
		h.setDiet(Teeth.HERBIVORE);
		Teeth o=new Teeth();
		o.setDiet(Teeth.OMNIVORE);

		Species dog=new Species();
		dog.setTeeth(c);
		Species cow=new Species();
		cow.setTeeth(h);
		Species monkey=new Species();
		monkey.setTeeth(o);

		Species monster=new Species();
		monster.setTeeth(c);

		Population dogs=new Population();
		dogs.setSpecies(dog);
		dogs.setCount(4);
		Population cows=new Population();
		cows.setSpecies(cow);
		cows.setCount(4);
		Population monkeys=new Population();
		monkeys.setSpecies(monkey);
		monkeys.setCount(2);

		ArrayList<Population> wild=new ArrayList<Population>();
		wild.add(dogs);
		wild.add(cows);
		wild.add(monkeys);

		Population monsters=new Population();
		monsters.setSpecies(monster);
		monsters.setCount(2);

		e.setNonPlayerPopulations(wild);
		e.setPlayerPopulation(monsters);

		assertEquals(e.getPlantEaterCount(), 6);
	}

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(TestEcosystem.class);
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("TestEcosystem");
	}
}