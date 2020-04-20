package com.motoboy.tarefas050607;

// Cupom � a classe filha de Cliente. O Cliente pode ter um Cupom ou n�o.

// ToString para deixar o main enxuto.

// Pode-se alterar o cupom modificando o atributo da classe Cupom. c1.cupomDesconto. 
// Ou instanciando uma nova classe Cupom e gerando um novo cupom, atrav�s do Construtor.

// Utilizar heran�a para declarar construtor com atributo cupom e outros atributos da classe m�e Cliente. Simplifica c�digo

// M�todo desconto para calcular desconto, conforme cupom Digitado. Se par�metro for igual a Motoboy2020, 10%. 

// Utilizar heran�a para pegar o pre�o atrav�s do setPreco() da classe m�e Cliente.

// M�todo desconto, que vai calcular o desconto se a cidade informada ao instanciar a classe Cupom, for as cidades
// em que a Motoboy est� presente. Exige como par�metro o Cupom, que deve ser o mesmo informado ao instanciar a classe. 
// Se for diferente, vai exibir a mensagem e n�o calcular. Se o cupom for diferente de Motoboy2020, informar
// que n�o h� desconto para esse cupom.

// Sobrecarga do m�todo desconto, com mais um par�metro necessidade. Desconto de 20% se tiver cupom e 
// se a necessidade for Agengamento, desconto de 20%. Fora isso - preco normal. Se o cupom for diferente de Motoboy2020, informar
// que n�o h� desconto para esse cupom. Os par�metros informados devem ser os mesmos dos atributos da Classe.
// Se n�o for, mensagem informando.

// M�todo ToString() para imprimir e simplificar c�digo
// Utilizar polimorfismo, imprimindo os dados que j� est�o na classe m�e Cliente mais os dados do Cupom, os pre�os para quem 
// tem cupom de Desconto e para quem tem cupom e a Necessidade � agendamento.

	public class Cupom extends Cliente {
		String cupomDesconto;

		public Cupom (String cidade, String necessidade, String cupom) {
			super(cidade, necessidade);
			this.cupomDesconto = cupom;
		} 
	
	public void desconto(String cupom) {
		
		 if (cupom.equals(this.cupomDesconto)) {
			if (cupom.equals("Motoboy2020")) {
				
				if (super.cidade.equals("Joinville") || super.cidade.equals("Curitiba") || super.cidade.equals("S�o Paulo")) {
					double n2 = super.setPreco();
					n2 -= 0.1 * n2;
					System.out.println("\nPre�o com desconto para Cupom " + this.cupomDesconto + ": R$ " + n2);
				} else {
					System.out.println("\nN�o estamos dispon�veis nessa cidade.");
				} 
			} else {
				System.out.println("\nN�o oferecemos desconto para este cupom.");
			}
		} else {
			System.out.println("\nO cupom informado como argumento da fun��o � diferente do cupom que foi instanciado no objeto. Informe os mesmos cupons.");
		}
	}
	
	public void desconto(String cupom, String necessidade) {
		
			if (necessidade.equals(super.necessidade) && cupom.equals(this.cupomDesconto)) {
				if (super.cidade.equals("Joinville") || super.cidade.equals("Curitiba") || super.cidade.equals("S�o Paulo")) {
					
					if (necessidade.equals("Agendamento") && cupom.equals("Motoboy2020")) {
						double n2 = super.setPreco();
						n2 -= 0.2 * n2;
						System.out.println("\nPre�o com desconto para Cupom " + cupom + " e Necessidade de " + necessidade + ": R$ " + n2);
					} else {
						System.out.println("\nN�o oferecemos desconto para essa necessidade e cupom.");
					}
					
				} else {
					System.out.println("\nN�o estamos dispon�veis nessa cidade.");
				}
			} else {
				System.out.println("\nOs par�metros informados na fun��o s�o diferentes dos argumentos que foram instanciados no objeto.");
			}
	
	}
	
	public String toString() {
		
		return super.toString() + "\nCupom de desconto: " + this.cupomDesconto;
		
	}
	
	} 
	

