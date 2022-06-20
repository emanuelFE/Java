/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author emanoel.fpsilva
 * Classe Modelo com herança (extend)
 */
public class Enxada extends Bloco{

	/**
	 * Construtor
	 */
	public Enxada() {
		System.out.println("___CAMPO___");	
	}
	// atributos
	boolean conquista;
	
	// método
	/**
	 * Metodo usa
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		//Atenção!
		conquista = true;
	}

}
