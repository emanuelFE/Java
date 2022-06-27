/**
 * 
 */
package fundamentos;

import java.util.Scanner;

/**
 * @author emanoel.fpsilva
 *
 */
public class Tabuada {

	/**
	 * Construtor
	 */
	public Tabuada() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int valor;
		//variavel
		Scanner teclado = new Scanner(System.in);
		{
			System.out.println("-------tabuada-----");
			System.out.print("Digite o valor da tabuada:");
			//entada
			valor = teclado.nextInt();
			System.out.println("Tabuada do " + valor);
			System.out.println("");
			//processamento/saida
			for (int i = 1; i < 11; i++) {
				System.out.println(valor + " x " + i + " = " + (valor * i));
			}
			teclado.close();

		}
	}

}
