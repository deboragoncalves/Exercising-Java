package com.motoboy.tarefa01;

// 1) Imprimir a mensagem e a l�ngua solicitada, instanciando uma classe.

// 2) Imprimir a mensagem e a l�ngua solicitada, modificando o atributo de uma classe j� existente.

// 3) Imprimir a mensagem e a l�ngua solicitada, modificando o atributo de uma classe j� existente. Mensagem n�o
// foi imprimida em fun��o da l�ngua.

// Imprimir chamando os m�todos getMessage e getLanguage ou imprimir s� o nome do objeto e ele pega o que est� no ToString().

public class Hello {

	public static void main(String[] args) {
				Message m1 = new Message("English");
				
				System.out.println(m1.getMessage());
				System.out.println(m1.getLanguage());
				
				m1.language = "Italian";
				
				System.out.println(m1);
				
				m1.language = "French";
				
				System.out.println(m1);

	}

}
