package mediaportal.java.controller;

class SmallDog extends NormalDog{
	
	@Override
	public String latirMuito(){
		String latido = null;
		for (int i=0; i<10; i++) 
			latido += sound + " ";
		return latido;	
	}
}
