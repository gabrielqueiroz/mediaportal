package mediaportal.java.controller;

import java.util.HashMap;

public class ProblemaArmarios {

	public HashMap<Integer,String> problema(int qtdArmarios){
		int homens = 100;
		HashMap<Integer, String> armarios = new HashMap<Integer, String>();
		
		for(int i=1;i<=qtdArmarios;i++)
			armarios.put(i, "fechado");
		
		while(homens>=0){
			//Primeiro Homem
			for(int i=1;i<=qtdArmarios;i++){
				if(armarios.get(i).equals("fechado"))
					armarios.replace(i, "aberto");
			}
			//SegundoHomem
			for(int i=1;i<=qtdArmarios;i++){
				if(i%2==0)
					armarios.replace(i, "fechado");
			}
			//TerceiroHomem
			for(int i=1;i<=qtdArmarios;i++){
				if(i%3==0){
					if(armarios.get(i).equals("fechado"))
						armarios.replace(i, "aberto");
					else
						armarios.replace(i, "fechado");
				}	
			}
			//UltimoHomem
			if(homens==0){
				for(int i=1;i<=qtdArmarios;i++){
					if(i%100==0){
						if(armarios.get(i).equals("fechado"))
							armarios.replace(i, "aberto");
						else
							armarios.replace(i, "fechado");
					}	
				}
			}
			homens--;
		}
		
		return armarios;
	}
}
