package mediaportal.java.controller;

public class MediaPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**Media Portal Java Teste**");
		
		System.out.println("Questão 01");
		String[] emails = {"teste@teste.com.br",
				"TeStE@teste.com.br",
				"t3st3@teste.com.br",
				"teste!$#@teste.com.br",
				"t@es@te@teste.com.br",
				".teste.@teste.com.br",
				"tes.te@teste.com.br",
				"tes..te@teste.com.br"};
		
		Validador v = new Validador();
		for(String e : emails)
			System.out.println("Email: "+e+"	status:"+v.validaEmail(e));
	}

}
