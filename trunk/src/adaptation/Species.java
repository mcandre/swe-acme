package adaptation;

public class Species {
	public static int HOT_BLOOD=0;
	public static int COLD_BLOOD=1;

	String name="";
	Skin skin=new Skin();
	Teeth teeth=new Teeth();
	Feet feet=new Feet();
	Eyes eyes=new Eyes();
	Ears ears=new Ears();

	int blood=HOT_BLOOD;

	public Species() {}

	public void setName(String n) {
		name=n;
	}

	public String getName() {
		return name;
	}

	public void setSkin(Skin s) {
		skin=s;
	}

	public Skin getSkin() {
		return skin;
	}

	public void setTeeth(Teeth t) {
		teeth=t;
	}

	public Teeth getTeeth() {
		return teeth;
	}

	public void setFeet(Feet f) {
		feet=f;
	}

	public Feet getFeet() {
		return feet;
	}

	public void setEyes(Eyes e) {
		eyes=e;
	}

	public Eyes getEyes() {
		return eyes;
	}

	public void setEars(Ears e) {
		ears=e;
	}

	public Ears getEars() {
		return ears;
	}

	public void setBlood(int b) {
		blood=b;
	}

	public int getBlood() {
		return blood;
	}
}