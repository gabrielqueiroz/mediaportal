package mediaportal.java.controller;

/**
 * Para construir uma tubulação entre um prédio A e um prédio B, separados por uma distância d, 
 * a empreiteira deve utilizar até P canos pequenos (1m de comprimento) e G canos longos (5m de comprimento) 
 * que possui em estoque. 
 * Considerando que a quantidade de canos de cada tipo é limitada, 
 * desenvolva uma função recursiva que calcule se é possível construir este encanamento.
 *
 * @author gabrielqueiroz
 *
 */

public class ConstrutorEncanamento {
	
	/**
	 * Calculo recurso com parametrizacao do tamanho do cano.
	 * @param p
	 * @param pTam
	 * @param g
	 * @param gTam
	 * @param d
	 * @return
	 */
	
	public boolean encanamento(int p, int pTam, int g, int gTam, int d) {
		if(d == 0)
			return true;
		
		if(g > 0 && (d-gTam)>=0){
			d = d - gTam;
			g--;
			return encanamento(p, pTam, g, gTam, d);
		}	
		
		if(p > 0 && (d-pTam)>=0){
			d = d - pTam;
			p--;
			return encanamento(p, pTam, g, gTam, d);
		}
	
		return false;
	}
}
