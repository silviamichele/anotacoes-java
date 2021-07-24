class VariaveisEstaticas{
	//o valor atribuido vária entre os objetos da classe
	String nome;
	//variaveis estáticas recebem apenas um válor, que será homogeneo para todos os objetos
	static String descricao; 

	public static void main(String[] args) {
		VariaveisStaticas.descricao = "demosntração de váriavel statica";

		VariaveisStaticas exemplo1 = new VariaveisStaticas();
		VariaveisStaticas exemplo2 = new VariaveisStaticas();

		exemplo1.nome = "Variavel 1";
		exemplo2.nome = "Variavel 2";

		System.out.println("Objeto 1: "+exemplo1.nome+", valor da váriavel estatica = "+exemplo1.descricao);
		System.out.println("Objeto 2: "+exemplo2.nome+", valor da váriavel estatica = "+exemplo2.descricao);
	}
}