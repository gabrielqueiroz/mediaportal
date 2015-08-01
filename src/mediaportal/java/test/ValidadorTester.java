package mediaportal.java.test;

import java.util.Scanner;
import mediaportal.java.controller.Validador;

/**
 * Classe utilizada para testes do validador de email.
 * Pode ser utilizada de forma automatica a partir de um array de emails 
 * ou manualmente a partir de emails inseridos.
 * @author gabrielqueiroz
 *
 */

public class ValidadorTester {

	Validador v = new Validador();

	private String[] emails = {
			"testé@teste.com.br",
			"teste@teste.com.br",
			"TeStE@teste.com.br",
			"t3st3@teste.com.br",
			"teste!$#@teste.com.br",
			"t@es@te@teste.com.br",
			".teste.@teste.com.br",
			"tes.te@teste.com.br",
			"tes..te@teste.com.br",
			"teste@tes-te.com.br",
			"teste@teste-.com.br",
			"teste@tes--te.com.br",
			"teste@teste.com.brasil",
			"ts@ts.ts.ts.ts.ts.ts.ts.ts"
			};

	private Scanner in;

	/**
	 * Retorna array de emails utilizado para teste automatico.
	 * @return emails
	 */
	public String[] getEmails() {
		return emails;
	}
			
	/**
	 * Teste automatico que demonstra a funcao validaEmail da classe Validador.
	 */
	public void AutomaticTest(){
		for(String e : emails)
			System.out.println("Email: "+e+"	status:"+v.validaEmail(e));
	}
	
	/**
	 * Teste manual que demonstra a funcao validaEmail da classe Validador.
	 */
	public void ManualTest(){
		System.out.print("Enter email for validation:");
		in = new Scanner(System.in);
		String s = in.next();
		System.out.println("Email: "+s+"	status:"+v.validaEmail(s));
	}

	/**
	 * Construtor da classe de testes.
	 */
	public ValidadorTester(){
		System.out.println("**Validador Tester");
		System.out.println("1-Automatic Test\n2-Manual Test");
		
		in = new Scanner(System.in);
		int i = in.nextInt();
		
		switch(i){
			case 1:	AutomaticTest();
					break;
			case 2: ManualTest();
					break;
			default:System.out.println("Invalid Option");
					break;
			
		}
	}
	
}
