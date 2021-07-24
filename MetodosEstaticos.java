class MetodosEstaticos{
	String nome; 

	static void metodo(){
		System.out.println("Método que pode ser acessado pelo objeto e pela classe");
	}

	public static void main(String[] args) {
		MetodosEstaticos.metodo();

		MetodosEstaticos novo_objeto = new MetodosEstaticos();
		novo_objeto.metodo();
	}
}