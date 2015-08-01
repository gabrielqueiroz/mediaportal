package mediaportal.java.controller;

import mediaportal.java.test.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**Media Portal Java Teste**");
		
		//Teste de Validador.
		//ValidadorTester vTester = new ValidadorTester();
		
		//Teste de Encamaneto.
		//ConstrutorEncanamentoTester cETester = new ConstrutorEncanamentoTester();
				
		ConstrutorEncanamento cE = new ConstrutorEncanamento();
		System.out.println(cE.encanamento(3, 1, 1, 5, 8));
		System.out.println(cE.encanamento(3, 1, 1, 5, 9));
		System.out.println(cE.encanamento(10, 1, 2, 7, 15));
		
	}

}
