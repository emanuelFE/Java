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
	 * M�todo principal
	 * @param args
	 */
	public static void main(String[] args) {
			// avi�o
			Aviao cargo = new Aviao();
			cargo.envergadura = 60.9; 
			cargo.modelo = "CargoBob";
			cargo.ano = 2009;
			cargo.cor = "Cinza";
			System.out.println("Envergadura do avi�o: " + cargo.envergadura);
			System.out.println("Modelo do avi�o: " + cargo.modelo);
			System.out.println("Ano do avi�o: " + cargo.ano);
			System.out.println("Cor do avi�o: " + cargo.cor);
			cargo.aterrizar();
			cargo.acelerar();
	
	
	}

}