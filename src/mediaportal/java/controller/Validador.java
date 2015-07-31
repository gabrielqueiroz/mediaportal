package mediaportal.java.controller;

/**
 * Classe respons�vel para conter os m�todos de valida��o.
 * @author Gabriel Queiroz.
 *
 */

public class Validador {
	
	/**
	 * M�todo para verifica��o se email � valido ou n�o.
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
		
		//Verifica��o da parte local		
		//*Deve ter at� 64 caracteres de comprimento e n�o menos do que 4.
		if(local.length()>64 || local.length()<4)
			return false;		
		//*Caractere '.' � v�lido, mas n�o pode iniciar e terminar a palavra ou ocorrer em sequ�ncia.
		if(local.startsWith(".") || local.endsWith("."))
			return false; 		
		
		String[] ponto = local.split(".");
		for(String s : ponto){
			System.out.println(s);
			if(s.length() == 0)
				return false;
		}
		//*Os caracteres v�lidos s�o apenas alfanum�ricos, min�sculos ou n�o.
		boolean cond = local.matches("[a-z0-9]+");		
		if(!cond)
			return false;
		
			
		//Verifica��o da parte dominio
		String[] etiquetas = dominio.split(".");
		
		if(etiquetas.length > 3)
			return false;
		
		return false;
	}
	
}
