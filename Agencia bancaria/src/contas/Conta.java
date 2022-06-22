/**
 * POO - Encapsulamento e metodos especiais
 */
package contas;

/**
 * @author emanoel.fpsilva
 *
 */
public class Conta {

	// atributos
	//Para encapsular (protoger) uma variavel dvemos usar o modificar private e 
	//criar merodos especificos (get e set ) 
	//para outras classe e pacotes terem acesso as variaves
	//passo 1 modificador private
	protected String Cliente;
	protected  double Saldo;
	//passo 2 criar os metodos especificos (get e set)
	
	/**
	 * Ler o conteudo da varriavel
	 * @return
	 */
	
	/**
	 * Construtor
	 */
	
	public Conta() {
		System.out.println("-------------------");
		System.out.println("Agencia 0261");

	}
	/** 
	 *  Ler o conteudo da cariavel cliente
	 * @return cliente
	 */

	public String getCliente() {
		return Cliente;
	}
	

	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	
	/**
	 * obter o saldo do cliente
	 * @return saldo
	 */

	public double getSaldo() {
		return Saldo;
	}
	
	/**
	 * 
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public Conta(String cliente, double saldo) {
		super();
		Cliente = cliente;
		Saldo = saldo;
	}

	// Metodos
	/**
	 * Metodo simples que Exibir o valor do saldo
	 * 
	 */
	protected  void exibirSaldo() {
		System.out.println("saldo R% " + Saldo);

	}
	/**
	 * metodo simples com uma variavel local
	 * @param valor
	 */

protected void sacar (double valor) {
	Saldo -= valor;
	System.out.println("Débito: R$ " + valor);
}
/**
 * metodo simples com uma variavel local para depositar um valor fisica
 * @param valor
 * 
 */

protected void depositar (double valor) {
	Saldo -= valor;
	System.out.println("credito: R$ " + valor);
}
/**
 * metodo simples com uma variavel local e um objeto que sera criado para 
 *indica a conta de destino da transferencia do valor 
 * @param destino
 * @param valor
 */
protected void transferir (Conta destino, double valor) {
	this.sacar(valor);
	destino.depositar(valor);
	System.out.println("transferncia: R$ " + valor);
}
/**
 * metodo com retorno obrigatorio da variavel total
 * @param cc1
 * @param cc2
 * @return total
 */
double soma(double cc1, double cc2) {
	double total = cc1 + cc2;
	return total;
}
}