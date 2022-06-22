/**
 * Conta corrente
 */
package contas;

/**
 * @author emanoel.fpsilva
 *
 */
public class PessoaFisica {

	/**
	 * Metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		//cliente 1
		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo  (10000);
		System.out.println("Cliente:" +cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(10000);
		cc1.exibirSaldo();
		//cliente 2
		Conta cc2 = new Conta();
		cc2.setCliente  ("kelly cristina");
		cc2.setSaldo  (100000);
		System.out.println("Cliente:" +cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(5000);
		cc2.exibirSaldo();
		//transferencia
		System.out.println("cliente:" + cc1.getCliente());
		System.out.println("Favorecido: "+ cc2.getCliente());
		cc1.transferir(cc2, 2000);
		System.out.println("Cliente:" +cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente:" +cc2.getCliente());
		cc2.exibirSaldo();
		//relatorio gerencial
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(),cc2.getSaldo());
		System.out.println("saldo total nas contas " + relatorio);
		
		

	}

}
