/**
 * POO - Fundamentos
 */
package minecraft;

/**
 * @author emanoel.fpsilva
 * Classe Modelo com heran�a (extend)
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
	
	// m�todo
	/**
	 * Metodo usa
	 */
	void arar() {
		System.out.println("Terra preparada para o plantio");
		//Aten��o!
		conquista = true;
	}

}
