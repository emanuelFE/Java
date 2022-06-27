/**
 *Fundamentos do Carros.Java
 */
package carros;

import java.util.Random;

/**
 * @author emanoel.fpsilva
 *
 */
public class Carros {
	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	// Variáveis
	String nome = "Bmw z4";
	int idade = 106;
	String marca = "Bmw";
	double temperatura = 100;
	boolean arCondicionado = false;
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	System.out.println("Marca: " + marca);
	System.out.println("Temperatura: " + temperatura);
	System.out.println("Ar condicionado ligado? " + arCondicionado);
	
	
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

// atributos
int ano;
String cor;
String modelo;
Double envergadura;

// métodos
void ligar() {
	System.out.println("Carro ligado");
}

void desligar() {
	System.out.println("Carro Desligado");
}

void acelerar() {
	System.out.println("ZUUUUUUUUUUUUMMMMMMM");
}

}

