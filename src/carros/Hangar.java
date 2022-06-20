/**
 * Fundamentos do Java
 */
package carros;

/**
 * @author emanoel.fpsilva
 *
 */
public class Hangar {

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
			// avião
			Aviao cargo = new Aviao();
			cargo.envergadura = 60.9; 
			cargo.modelo = "CargoBob";
			cargo.ano = 2009;
			cargo.cor = "Cinza";
			System.out.println("Envergadura do avião: " + cargo.envergadura);
			System.out.println("Modelo do avião: " + cargo.modelo);
			System.out.println("Ano do avião: " + cargo.ano);
			System.out.println("Cor do avião: " + cargo.cor);
			cargo.aterrizar();
			cargo.acelerar();
	
	
	}

}