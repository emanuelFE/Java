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
// void -> Método simples sem retorno
	/**
	 * Método Usado para construir o bloco
	 */
	void construir() {
		System.out.println("Bloco colocado");
	}
	/**
	 * metodo usando para obter recursos de mineração 
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
