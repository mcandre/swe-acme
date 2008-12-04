package adaptation;

import java.io.*;
import org.ho.yaml.*;

public class Adaptation {
	
	static BodyPartsCatalog bp;
	
	public static void main(String[] args) {
		try { 
			bp = Yaml.loadType(new File("src/config/bpc.yml"), BodyPartsCatalog.class);
		}catch (FileNotFoundException e){
			System.out.println("Error Loading Catalog: " + e.toString());
		}
		
		Feet ft = (Feet) bp.feetCatalog.get(1);
		System.out.println("The 2nd Foot: " + ft.getSpeed() + "/" + ft.getAttack());
		
	}

}
