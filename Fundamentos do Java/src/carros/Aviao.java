/**
 * Fundamentos POO
 */
package carros;

/**
 * @author emanoel.fpsilva
 *
 */
public class Aviao extends Carros {

	/**
	 * Construtor
	 */
	
	public Aviao() {
		super ();
		System.out.println("AVI�ES");
	}

	// atributos
	Double envergadura;
	public String modelo;
	public int ano;
	public String cor;

	// m�todos
	void aterrizar () {
		System.out.println("ZUMMMMM AVI�O DO R'S CHEGANDO");
	}
	
	void acelerar () {
		System.out.println("XIIIIII AVI�O DO R'S DECOLANDO");
	}

}