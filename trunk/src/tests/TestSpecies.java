import org.junit.*;
import static org.junit.Assert.*;

import adaptation.*;

public class TestSpecies {
	@Test
	public void testName() {
		Species species=new Species();
		species.setName("Grover");

		assertEquals(species.getName(), "Grover");
	}

	@Test
	public void testSkin() {
		Species species=new Species();
		Skin skin=new Skin();
		species.setSkin(skin);

		assertEquals(species.getSkin(), skin);
	}

	@Test
	public void testTeeth() {
		Species species=new Species();
		Teeth t=new Teeth();
		t.setDiet(Teeth.OMNIVORE);
		species.setTeeth(t);

		assertEquals(species.getTeeth(), t);
	}

	@Test
	public void testFeet() {
		Species species=new Species();
		Feet feet=new Feet();
		species.setFeet(feet);

		assertEquals(species.getFeet(), feet);
	}

	@Test
	public void testEyes() {
		Species species=new Species();
		Eyes eyes=new Eyes();
		species.setEyes(eyes);

		assertEquals(species.getEyes(), eyes);
	}

	@Test
	public void testEars() {
		Species species=new Species();
		Ears ears=new Ears();
		species.setEars(ears);

		assertEquals(species.getEars(), ears);
	}

	@Test
	public void testBlood() {
		Species species=new Species();
		species.setBlood(Species.COLD_BLOOD);

		assertEquals(species.getBlood(), Species.COLD_BLOOD);
	}

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(TestSpecies.class);
	}

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("TestSpecies");
	}
}