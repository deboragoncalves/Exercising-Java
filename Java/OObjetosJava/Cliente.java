package com.motoboy.tarefas050607;

// Declarar atributos como public para que seja poss�vel digitar
// Declarar como private o pre�o para n�o conseguir alterar e implementar m�todo get
// Construtor padr�o, utilizado quando se deseja receber informa��es - objeto.atributo = variavel.nextLine();
// Construtor com 4 par�metros, caso se deseje instanciar a classe dessa forma
// Construtor com 2 par�metros, para ser utilizado na Classe Cupom e o usu�rio informar
// menos par�metros.
// M�todo setPreco retorna double e vai imprimir o pre�o de acordo com o que foi digitado/instanciado na cidade.
// Se a cidade n�o tiver entre aquelas em que a Motoboy est�, pre�o 0.0.
// M�todo ToString para imprimir informa��es e simplificar c�digo
// No ToString, criar if/else, para se a cidade for uma daquelas em que a Motoboy est� presente,
// imprimir as informa��es e o pre�o, mas se n�o for, imprimir que n�o est� presente.

public class Cliente {
	
		public String cidade;
		public String necessidade;
		public String origem;
		public String destino;
		private double preco;
		
		public Cliente() {
		}
		
		public Cliente(String city, String necessity, String begin, String finish) {
			this.cidade = city;
			this.necessidade = necessity;
			this.origem = begin;
			this.destino = finish;
		}
		
		public Cliente(String cidade2, String necessidade2) {
			this.cidade = cidade2;
			this.necessidade = necessidade2;
		}

		public double setPreco() {
			
			if (this.cidade.equals("Joinville")) {
				return this.preco = 20.0;
			} else if (this.cidade.equals("Curitiba")) {
				return this.preco = 25.0;
			} else if (this.cidade.equals("S�o Paulo")) {
				return this.preco = 30.0;
			} else {
				return 0; 
			}
		}
		
		@Override
		public String toString() {
			
			if (this.cidade.equals("Joinville") || this.cidade.equals("Curitiba")  || this.cidade.equals("S�o Paulo")) {
				return "\nInforma��es: \nCidade: " + 
						this.cidade + "\nNecessidade: " 
						+ this.necessidade + "\nEndere�o de origem: " 
						+ this.origem + "\nEndere�o de destino: "
						+ this.destino + "\nPre�o: R$ " + this.setPreco();
			} else {
				return "\nN�o estamos dispon�veis nessa cidade";
			}
			
			
		}

}
