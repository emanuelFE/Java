/**
 * Fundametos do Java
 * Variáveis, operadores e estruturas de controle
 * Exercicio 1 - APP Eleitor
 * Desenvolver um APP no modo console qye en função da idade do eleitor avise se o voto é obrigatorio ou não
 * Abaixo de 16 Voto PROIBIDO
 * Entre 18 e 70 (incluido 18 e 70) - VOTO OBRIGATORIO
 * 16,17 ou acima de 70 - VOTO FACULTATIVO
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author emanoel.fpsilva
 *
 */
public class Eleitor {

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// variaveis
		int idade;
		// objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP ELEITOR=============");
		System.out.print("Digite sua idade:");
		// entrada
		idade = teclado.nextInt();
		// apoio ao teste do fluxo(b= verificar se a idade foi capturada)
		// System.out.println(idade);
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade > 17 && idade < 71) {
			System.out.println("VOTO OBRIGATORIO");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		// encerrar a patura de dados
		teclado.close();
	}

}
