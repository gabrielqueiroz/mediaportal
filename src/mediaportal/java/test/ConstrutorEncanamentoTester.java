package mediaportal.java.test;

import java.util.Scanner;
import mediaportal.java.controller.ConstrutorEncanamento;

public class ConstrutorEncanamentoTester {
	ConstrutorEncanamento cE = new ConstrutorEncanamento();
	
	private Scanner in;
	
	private void automaticTest(){
		System.out.println("encanamento(3, 1, 1, 5, 8)	"+cE.encanamento(3, 1, 1, 5, 8));
		System.out.println("encanamento(3, 1, 1, 5, 9)	"+cE.encanamento(3, 1, 1, 5, 9));
		System.out.println("encanamento(10, 1, 2, 7, 15)	"+cE.encanamento(10, 1, 2, 7, 15));
	}
	
	private void manualTest(){
		System.out.println("Insira valores para encanamento dividos por virgulas, sendo respectivamente \n p, pTam, g, gTam, d");
		in = new Scanner(System.in);
		String s = in.next();
		String[] values = s.split(",");
		int[] valuesInt = new int[5];
		for(int i=0;i<values.length;i++)
			valuesInt[i] = Integer.parseInt(values[i]);
		System.out.println("encanamento("+values+")		"+cE.encanamento(valuesInt[0], valuesInt[1], valuesInt[2], valuesInt[3], valuesInt[4]));
	}
	
	/**
	 * Responsável por incializar os métodos da classe teste.
	 */
	public void initialize(){
		System.out.println("**Teste Construtor Encanamento");
		System.out.println("1-Teste Automatico\n2-Teste Manual");
		
		in = new Scanner(System.in);
		int i = in.nextInt();
		
		switch(i){
			case 1:	automaticTest();
					break;
			case 2: manualTest();
					break;
			default:System.out.println("Invalid Option");
					break;
			
		}
	}
}
