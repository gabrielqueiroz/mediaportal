package mediaportal.java.controller;

public class NormalDog {
	protected final String sound = "au";
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String latir(){
		return sound;
	}

	public String latirMuito(){
		String latido = null;
		for (int i=0; i<10; i++) 
			latido += sound + " ";
		return latido;	
	}	
	
	public String responder(String chamado){
		if(chamado == sound) return latir()+latir();
		if(chamado == "parado") return latir();
		return null;
	}
}
