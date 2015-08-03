package mediaportal.java.controller;

import mediaportal.java.test.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**Media Portal Java Teste**");
		
		//Teste de Validador.
		ValidadorTester vTester = new ValidadorTester();
		vTester.initialize();
		
		//Teste de Encamaneto.
		ConstrutorEncanamentoTester cETester = new ConstrutorEncanamentoTester();
		cETester.initialize();
		
		//Problema Armarios.
		ProblemaArmarios pA = new ProblemaArmarios();
		System.out.println("Exemplo do Problema dos Armarios (100 Armarios).");		
		System.out.println(pA.problema(100));
	}

}
