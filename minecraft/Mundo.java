package minecraft;

public class Mundo {

	public static void main(String[] args) {
		// objeto 1
		Bloco blocoTerra = new Bloco();
		blocoTerra.resistencia = 1;
		blocoTerra.textura = "Terra";
		System.out.print("Bloco:" + blocoTerra.textura);
		System.out.print("Resistência:" + blocoTerra.resistencia);
		blocoTerra.construir();
		blocoTerra.minerar();
		// objeto 2
		Bloco blocoMadeira = new Bloco();
		blocoMadeira.resistencia = 2;
		blocoMadeira.textura = "madeira";
		System.out.print("Bloco" + blocoMadeira.textura);
		System.out.print("Resistencia" + blocoMadeira.resistencia);
		blocoMadeira.minerar();
		blocoMadeira.craftar();
	}

	public Mundo() {
		super();
		// TODO Auto-generated constructor stub
	}
}