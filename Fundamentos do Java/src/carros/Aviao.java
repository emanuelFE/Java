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
		System.out.println("AVIÕES");
	}

	// atributos
	Double envergadura;
	public String modelo;
	public int ano;
	public String cor;

	// métodos
	void aterrizar () {
		System.out.println("ZUMMMMM AVIÃO DO R'S CHEGANDO");
	}
	
	void acelerar () {
		System.out.println("XIIIIII AVIÃO DO R'S DECOLANDO");
	}

}