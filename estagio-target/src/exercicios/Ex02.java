/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre 
 * será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
 * sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence 
 * ou não a sequência.



IMPORTANTE:

Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser 
previamente definido no código;*/

package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Informe um valor inteiro: ");
		
		int numero = sc.nextInt();
		int soma = 0;
		int anterior = 0;
		
		List<Integer> lFibonacci = new ArrayList<>();
		
		while(soma <= numero) {
			System.out.println(soma);
			lFibonacci.add(soma);
			
			if(soma == 0) soma = 1;
			
			else {
				anterior = soma - anterior;
				soma += anterior;
			}
		}
		
		
		if(lFibonacci.stream().anyMatch(i -> i == numero)) 
			System.out.println("O numero " + numero + " pertence a sequencia de fibonacci!");

		else
			System.out.println("O número " +numero+ " não pertence a sequência de fibonacci!");
		
		sc.close();
		
	}
}
