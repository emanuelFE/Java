/**
 * 
 */
package carros;

/**
 * @author emanoel.fpsilva
 *
 */
public class Veiculos {

	/**
	 * Método Principal
	 * @param args
	 */
	public static void main(String[] args) {
		// veiculo 1
		Carros ferrari = new Carros();
		ferrari.modelo = "Ferrari"; 
		ferrari.ano = 2022;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: " + ferrari.modelo);
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.desligar();
		ferrari.acelerar();
		// veiculo 2
		Carros fusca = new Carros();
		fusca.modelo = "Bmw";
		fusca.ano = 2020;
		fusca.cor = "Azul";
		System.out.println("Carro: " + fusca.modelo);
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Cor: " + fusca.cor);
		fusca.ligar();
		fusca.desligar();
		fusca.acelerar();
		// veiculo 3
		Carros camaro = new Carros();
		camaro.modelo = "lamborghini"; 
		camaro.ano = 2022;
		camaro.cor = "laranja";
		System.out.println("Carro: " + camaro.modelo);
		System.out.println("Ano: " + camaro.ano);
		System.out.println("Cor: " + camaro.cor);
		camaro.ligar();
		camaro.desligar();
		camaro.acelerar();


		

	}

}