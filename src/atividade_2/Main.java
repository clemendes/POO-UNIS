package atividade_2;

public class Main {
	
	public static void main(String[] args) {
		
	    Animal cachorro = new Cachorro("Tot�", 2, "C�o");
	    Animal gato = new Gato("Frederico", 1, "Gato");
			
	    // TESTANDO O POLIMORFISMO APLICADO
		System.out.print("GATO: ");
		gato.emitirBarulho();
	
		System.out.print("CACHORRO: ");
		cachorro.emitirBarulho();
	}
}
