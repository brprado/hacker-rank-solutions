package hackerrank;

import java.time.LocalDate;


public class Solution11 {
	
	public static String findDay(int month, int day, int year) { //retorna dia da semana de qualquer data
		return LocalDate.of(year, month, day).getDayOfWeek().name(); 
		//pega o parametro passado no metodo e rotorna o nome do dia da semana
		//variáveis já inicializadas no método
		
    }

}
