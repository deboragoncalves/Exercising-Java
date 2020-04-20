package com.motoboy.tarefas050607;

import java.util.Scanner;

// Instanciar classe m�e Cliente, com construtor padr�o e Objeto Scanner para ler o que foi digitado.

// A classe tamb�m pode ser instanciada atrav�s do Construtor com os atributos: cidade, necessidade, origem, destino.

// Ler dados que forem digitados, chamando o objeto n1 e cada atributo.

// Instanciar classe Cupom, caso tenha cupom. O construtor da classe exige os atributos da
// classe Cliente (dados: cidade, necessidade) e o atributo Cupom. (Aplica��o de heran�a no Construtor de Cupom).

// Posso informar os mesmos atributos da classe Cliente j� instanciada ou outros atributos. Vai imprimir de acordo com o que for
// instanciado na classe Cupom.

// Ao imprimir o objeto instanciado em Cupom, imprime-se todas as informa��es de Cliente (dados e pre�o) 
// e o cupom passado no Construtor. (Aplica��o de Heran�a no m�todo ToString()).

// O pre�o calculado na classe Cliente � com base na cidade. Se n�o for em uma das cidades, vai exibir uma mensagem que a empresa
// n�o est� dispon�vel nessas cidades.

// Ao aplicar o m�todo desconto, h� duas formas: passando um argumento, o Cupom e passando 2 argumentos, o cupom e a necessidade.

// O desconto calculado � com base na cidade. Se a cidade informada ao instanciar a classe for diferente das cidades em que 
// a Motoboy est� presente, vai dizer que a Motoboy n�o est� presente nessas cidades.

// H� desconto se o cupom for Motoboy2020 e se a necessidade for Agendamento. Tudo o que for diferente disso, 
// mensagem que n�o h� desconto.

// Se o que for passado como argumento da fun��o desconto for diferente das informa��es instanciadas na Classe, vai exibir a mensagem
// de que h� diferen�a e n�o vai calcular o desconto.

public class Motoboy {
	public static void main(String[] args) {
				
					Scanner teclado = new Scanner(System.in);
					
					Cliente n1 = new Cliente();
					
					System.out.println("Digite a sua cidade: ");
					n1.cidade = teclado.nextLine();
					
					System.out.println("Digite a sua necessidade (Imediata/Agendamento): ");
					n1.necessidade = teclado.nextLine();
					
					System.out.println("Digite o seu endere�o de origem: ");
					n1.origem = teclado.nextLine();
					
					System.out.println("Digite o seu endere�o de destino: ");
					n1.destino = teclado.nextLine();
					
					System.out.println(n1); 
					
					Cliente n2 = new Cliente ("S�o Paulo", "Agendamento", "Rua x", "Rua y");
					
					System.out.println(n2);
					
					Cupom cupom = new Cupom("Joinville", "Agendamento", "Motoboy2020"); 
					
					System.out.println(cupom);
					
					cupom.desconto("Motoboy2020");
					cupom.desconto("Motoboy2020", "Imediata");
					
					// teclado.close();
	}

}
