package mediaportal.java.controller;

/**
 * Classe responsável para conter os métodos de validação.
 * @author Gabriel Queiroz.
 *
 */

public class Validador {
	
	/**
	 * Método para verificação se email é valido ou não.
	 * @param mail
	 * @return
	 */
	
	public boolean validaEmail(String mail){
		String[] parts = mail.split("@");

		//*Valida email t@es@te@teste.com.br
		if(parts.length > 2)
			return false;
		
		String local = parts[0];
		String dominio = parts[1];
		
		//Verificação da parte local		
		//*Deve ter até 64 caracteres de comprimento e não menos do que 4.
		if(local.length()>64 || local.length()<4)
			return false;		
		//*Caractere '.' é válido, mas não pode iniciar e terminar a palavra ou ocorrer em sequência.
		if(local.startsWith(".") || local.endsWith("."))
			return false; 		
		
		String[] ponto = local.split(".");
		for(String s : ponto){
			System.out.println(s);
			if(s.length() == 0)
				return false;
		}
		//*Os caracteres válidos são apenas alfanuméricos, minúsculos ou não.
		boolean cond = local.matches("[a-z0-9]+");		
		if(!cond)
			return false;
		
			
		//Verificação da parte dominio
		String[] etiquetas = dominio.split(".");
		
		if(etiquetas.length > 3)
			return false;
		
		return false;
	}
	
}
