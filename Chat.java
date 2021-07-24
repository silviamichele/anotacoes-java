class Chat{
	String nome;
	String descricao;

	//metodo sem tipo de retorno e com parametro
	void mensagem(String texto){
		System.out.println(this.nome+ ", escreveu: "+texto);
	}
	//metodo que retorna uma string
	String pessoaNoChat(){
		return this.nome; 
	}
	public static void main(String[] args) {
		//criando um objeto
		Chat novo_chat = new Chat();
		
		//atibuindo valor ao objeto
		novo_chat.nome = "Amélia";
		novo_chat.descricao = "Olá, sou uma estudante de direito!";

		//chamando metodos
		novo_chat.mensagem("Olá");
		System.out.println(novo_chat.pessoaNoChat() + " está no chat!");
	}
}