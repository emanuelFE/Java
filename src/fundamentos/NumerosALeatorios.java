/**
 *Fudamentos do Java
 * Gerador de numeros e caracteres aletorios
 */
package fundamentos;

import java.util.Random;

/**
 * @author emanoel.fpsilva
 *
 */
public class NumerosALeatorios {

	/**
	 * Metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		//Uso da classe Random para gerar numeros aleatorios
		
		Random gerador = new Random();
		//Exemplo 1
		//(100) Gerar numeros entre 0 e 99
		int numero = gerador.nextInt(100);
		System.out.println(numero);
		//Exemplo2
		int dado = gerador.nextInt(6) + 1;
		System.out.println("Face do dado:" + dado);
		//Exemplo 3
		// A linha abaixo cria um objeto que contem caracteres 
		String chassi = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println("chassi: * ");
		for (int i = 0; i < 16; i++) {
			// A linha abaixo criar uma variavel do tipo char que usar objeto
			// gerador para gerar um numero aleatorio entre 0 e o tamanho maximo
			// de caracters do objeto chassi (.length() -> tamanho da String)
			// (char) convaerter o tipo int para o tipo char
			char numeracao = (char)gerador.nextInt(chassi.length());
			System.out.print(chassi.charAt(numeracao));			
		}
		
		System.out.println(" * ");

	}

}
