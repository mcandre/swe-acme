public class Teeth {
	public static int HERBIVORE=0;
	public static int CARNIVORE=1;
	public static int OMNIVORE=2;

	int diet;

	public Teeth() {}

	public void setDiet(int d) {
		diet=d;
	}

	public int getDiet() {
		return diet;
	}
}
