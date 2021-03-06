package mediaportal.java.controller;

/**
 * Classe responsavel para conter os metodos de validacao.
 * @author Gabriel Queiroz.
 *
 */

public class Validador {
	
	/**
	 * MÃ©todo para verificacao se email Ã© valido ou nao.
	 * @param mail
	 * @return
	 */
	public boolean validaEmail(String mail){
		String[] parts = mail.split("@");
		
		if(parts.length > 2)
			return false;
		
		String local = parts[0];
		String dominio = parts[1];
		
		//Verificacao da parte local		
		//*Deve ter até 64 caracteres de comprimento e nao menos do que 4.
		if(local.length()>64 || local.length()<4)
			return false;		
		//*Caractere '.' não é valido, mas nao pode iniciar e terminar a palavra ou ocorrer em sequencia.
		if(local.startsWith(".") || local.endsWith("."))
			return false; 		
		String[] ponto = local.split("\\.");
		for(String s : ponto){
			if(s.length() == 0)
				return false; 
		}
		//*Os caracteres validos sao apenas alfanumericos, minusculos ou nao.
		//**BONUS 1 - 'local' com caracteres especiais: ! # $ % & * + =
		boolean cond = local.matches("[a-zA-Z0-9.!#$%&*]+");		
		if(!cond)
			return false;
		
		//**BONUS 2 -  'local' pode ter qualquer conteuÌ�do desde que inicie e termine entre aspas duplas.
//		if(local.startsWith("\"") && local.endsWith("\""));
//			return true;
		
		//Verificacao da parte dominio
		String[] etiquetas = dominio.split("\\.");
		
		//*Dominio nao pode exceder 255 caraceteres.
		if(dominio.length() > 255)
			return false;
		
		//**BONUS 3 - 'dominio' deve ser composto por entre 2 e 6 etiquetas, e a uÌ�ltima contendo apenas 2 ou 3 caracteres.
		if(etiquetas.length<2 || etiquetas.length>6)
			return false;
		if(etiquetas[etiquetas.length - 1].length()<2 ||etiquetas[etiquetas.length - 1].length()>3)
			return false;
		
		//*Etiquetas devem ter ao menos 2 caraceteres e no maximo 63.
		for(String e : etiquetas){
			if(e.length()<2 || e.length()>255)
				return false;
		}
		
		//**BONUS 4 - Etiquetas podem ter hifens, embora nunca possam iniciar ou terminar uma etiqueta e nem ocorrer consecutivamente
		for(String e : etiquetas){
			if(e.startsWith("-") || e.endsWith("-"))
				return false;
			
			String[] hifen = e.split("-");
			for(String s : hifen){
				if(s.length() == 0)
					return false; 
			}
		}
		
		return true;
	}
	
	
	
}
