class VariavelFinal{
	static final int VALOR_CONSTRANTE = 1;
	static int valor_mutavel;
	
	//metodo construtor
	public VariavelFinal(){
		valor_mutavel ++;
	}

	public static void main(String[] args) {
		System.out.println("antes: variavel statica " + VariavelFinal.valor_mutavel);
		System.out.println("antes: varivel statica e final " + VariavelFinal.VALOR_CONSTRANTE);

		System.out.println("+2 objetos");
		VariavelFinal objeto1 = new VariavelFinal();
		VariavelFinal objeto2 = new VariavelFinal();	

		System.out.println("depois: variavel statica " + VariavelFinal.valor_mutavel);
		System.out.println("depois: varivel statica e final " + VariavelFinal.VALOR_CONSTRANTE);
	}
}