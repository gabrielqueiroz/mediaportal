package mediaportal.java.controller;

/**
 * Classe responsavel para conter os metodos de validacao.
 * @author Gabriel Queiroz.
 *
 */

public class Validador {
	
	/**
	 * Método para verificacao se email é valido ou nao.
	 * @param mail
	 * @return
	 */
	public boolean validaEmail(String mail){
		String[] parts = mail.split("@");
		
		boolean status = true;

		if(parts.length > 2)
			status = false;
		
		String local = parts[0];
		String dominio = parts[1];
		
		//Verificacao da parte local		
		//*Deve ter até 64 caracteres de comprimento e nao menos do que 4.
		if(local.length()>64 || local.length()<4)
			status = false;		
		//*Caractere '.' é valido, mas nao pode iniciar e terminar a palavra ou ocorrer em sequencia.
		if(local.startsWith(".") || local.endsWith("."))
			status = false; 		
		String[] ponto = local.split("\\.");
		for(String s : ponto){
			if(s.length() == 0)
				status = false; 
		}
		//*Os caracteres validos sao apenas alfanumericos, minusculos ou nao.
		//**BONUS 1 - 'local' com caracteres especiais: ! # $ % & * + =
		boolean cond = local.matches("[a-zA-Z0-9.!#$%&*]+");		
		if(!cond)
			status = false;
		
		//**BONUS 2 -  'local' pode ter qualquer conteúdo desde que inicie e termine entre aspas duplas.
//		if(local.startsWith("\"") && local.endsWith("\""));
//			status = true;
		
		//Verificacao da parte dominio
		String[] etiquetas = dominio.split("\\.");
		
		//*Dominio nao pode exceder 255 caraceteres.
		if(dominio.length() > 255)
			status = false;
		
		//**BONUS 3 - 'dominio' deve ser composto por entre 2 e 6 etiquetas, e a última contendo apenas 2 ou 3 caracteres.
		if(etiquetas.length<2 || etiquetas.length>6)
			status = false;
		if(etiquetas[etiquetas.length - 1].length()<2 ||etiquetas[etiquetas.length - 1].length()>3)
			status = false;
		
		//*Etiquetas devem ter ao menos 2 caraceteres e no maximo 63.
		for(String e : etiquetas){
			if(e.length()<2 || e.length()>255)
				status = false;
		}
	
		return status;
	}
	
	
	
}
