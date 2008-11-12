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
	public void testAnimalTypes() {
		Ecosystem e=new Ecosystem();

		assertEquals(e.getCarnivoreCount()+e.getHerbivoreCount(), 0);
	}

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(TestEcosystem.class);
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("TestEcosystem");
	}
}