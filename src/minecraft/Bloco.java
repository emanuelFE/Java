/**
 * Poo - Fundamentos
 */
package minecraft;

/**
 * @author emanoel.fpsilva Classe Modelo
 */
public class Bloco {
	int resistencia;
	String textura;

// metodos
// void -> M�todo simples sem retorno
	/**
	 * M�todo Usado para construir o bloco
	 */
	void construir() {
		System.out.println("Bloco colocado");
	}
	/**
	 * metodo usando para obter recursos de minera��o 
	 */
	void minerar() {
		System.out.println("Recursos obtidos");
	}
	/**
	 *  metodo usando para obter craftar 
	 */
	void craftar() {
		System.out.println("Item criado");
	}
	
}
