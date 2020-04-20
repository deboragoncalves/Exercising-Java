package com.motoboy.tarefa01;

// Classe Mensagem, com dois atributos. Um privado, que � a mensagem, pra n�o poder ser alterada. E um p�blico, para que o usu�rio
// altere, sem chamar um m�todo espec�fico.

// Construtor para a classe Mensagem, como par�metro a l�ngua que se deseja.

// M�todo getMessage altera a mensagem de acordo com a l�ngua escolhida ao instanciar a classe. Se n�o for nenhuma,
// o atributo mensagem recebe uma mensagem que n�o foi poss�vel.

// M�todo getLanguage que mostra a l�ngua escolhida, seja ao instanciar a classe ou ao alterar a l�ngua pelo atributo.

// M�todo ToString imprime o que foi retornado nos m�todos getMessage() e getLanguage().

public class Message {
	private String message;
	public String language;
	
	public Message(String speak) {
		this.language = speak;
	}
	
	public String getMessage() {
		if (this.language.equals("Portuguese")) {
			return this.message = "Ol� Mundo";
		} else if (this.language.equals("English")) {
			return this.message = "Hello World";
		} else if (this.language.equals("Spanish")) {
			return this.message = "Hola mundo";
		} else if (this.language.equals("Italian")) {
			return this.message = "Ciao mondo";
		} else {
			return this.message = "Sorry, it wasn't possible translate to this language. Try another one.";
		}
	
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	@Override
	 public String toString() {
		return "\nMessage: " + this.getMessage() + "\nLanguage: " + this.getLanguage();
	} 
}
