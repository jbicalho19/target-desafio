/*5) Escreva um programa que inverta os caracteres de um string.



IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;*/

package exercicios;

import java.util.Scanner;

public class Ex05 {

private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.print("Informe uma String qualquer: ");
		String recebida = sc.nextLine();
		
		System.out.println("Essa é a String informada: " + recebida);
		
		char chars[] = recebida.toCharArray();
		int qntdChars = recebida.length();
		char nova[] = new char[qntdChars];
		
		int inicio = 0;
		for(int fim = qntdChars - 1; fim >= 0; fim--) {
			nova[inicio] = chars[fim];
			inicio++;
		}
		
		recebida = new String(nova);
		
		System.out.println("Essa é a String invertida: " + recebida);
	
	sc.close();
	}

}
