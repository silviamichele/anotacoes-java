class Programa{
	int numero;

	//metodo construtor
	public Programa(){
		//System.out.println("Quando criamos um objeto, \nautomaticamente esse metodo é chamado!");
		numero = 10;
		System.out.println("Construtor sem parametro");
	}
	public Programa(int numero){
		//chama o atributo da class
		this.numero = numero;
		System.out.println("Construtor com parametro");
	}
}

public class Construtores{
	public static void main(String[] args) {
		Programa meuProgama1 = new Programa();
		Programa meuProgama2 = new Programa(5);
	}
}