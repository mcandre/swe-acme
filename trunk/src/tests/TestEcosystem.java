import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import adaptation.*;

public class TestEcosystem {
	@Test
	public void testSomething() {
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

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(TestEcosystem.class);
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("TestEcosystem");
	}
}