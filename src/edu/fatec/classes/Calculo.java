package edu.fatec.classes;

public class Calculo {

	public static Integer media(String valores[]) {
		return soma(valores) / valores.length;
	}
	
	public static Integer soma(String valores[]) {
		int total = 0;
		for(int i = 0; i < valores.length; i++) {
			total += Integer.parseInt(valores[i]); 	
		}
		
		return total;
	}
	
}
