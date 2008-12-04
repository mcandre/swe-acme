package adaptation;

import java.util.ArrayList;

public class BodyPartsCatalog {
	public ArrayList<Ears> earsCatalog;
	public ArrayList<Eyes> eyesCatalog;
	public ArrayList<Feet> feetCatalog;
	public ArrayList<Skin> skinCatalog;
	public ArrayList<Teeth> teethCatalog;
	
	public BodyPartsCatalog() {}
	
	public void setEarsCatalog(ArrayList<Ears> p){
		earsCatalog=p;
	}
	public ArrayList<Ears> getEarsCatalog(){
		return earsCatalog;
	}
	
	public void setEyesCatalog(ArrayList<Eyes> p){
		eyesCatalog=p;
	}
	public ArrayList<Eyes> getEyesCatalog(){
		return eyesCatalog;
	}
	
	public void setFeetCatalog(ArrayList<Feet> p){
		feetCatalog=p;
	}
	public ArrayList<Feet> getFeetCatalog(){
		return feetCatalog;
	}
	
	public void setSkinCatalog(ArrayList<Skin> p){
		skinCatalog=p;
	}
	public ArrayList<Skin> getSkinCatalog(){
		return skinCatalog;
	}
	
	public void setTeethCatalog(ArrayList<Teeth> p){
		teethCatalog=p;
	}
	public ArrayList<Teeth> getTeethCatalog(){
		return teethCatalog;
	}
}
