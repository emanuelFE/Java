/**
 * Seguros
 */
package seguros;

import contas.Conta;

/**
 * @author emanoel.fpsilva
 *
 */
public class SeguroPessoaFisica  extends Conta{

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		// Cliente 3
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente  ("Robson Vamonde");
		cc3.setSaldo  (9000);
		System.out.println("Cliente:" +cc3.getCliente());
		cc3.exibirSaldo();
		
	}

}
