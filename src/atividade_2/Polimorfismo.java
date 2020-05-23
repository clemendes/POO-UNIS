package atividade_2;

// CLASSE ABSTRATA - ANIMAL
abstract class Animal {
  
	private String nome;
	private String especie;
	protected int idade;
	
  // CONSTRUCTOR
	public Animal(String nome, int idade, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}

	// MÉTODO ABSTRATO - SERÁ APLICADO POLIMORFISMO 
	public abstract void emitirBarulho();

}

// CLASSE FILHA -> GATO
class Gato extends Animal {
	public Gato(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}

	@Override
	public void emitirBarulho() {
		System.out.println("ESTOU MIANDO....");
	}
}

// CLASSE FILHA -> CACHORRO
class Cachorro extends Animal {
	public Cachorro(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}

	@Override
	public void emitirBarulho() {
		System.out.println("ESTOU LATINDO....");
	}
}