import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		// 39 (incompleto)

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor inteiro e positivo: ");
		int a = teclado.nextInt();
		int numeroLinhas[] = null;
		int linha[] = null;
		
		try {
			numeroLinhas = new int[a];
			linha = new int[a];

			for (int i = 0; i < a; i++) {
				numeroLinhas[i] = i + 1;
				
				for (int j = 0; j < a; j++) {
					linha[i] = i + 1;
				}
			}
			
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel calcular o Tri�ngulo de Pascal, pois o valor digitado � negativo.");
		}
		
		System.out.println();
		System.out.println("Vetor: ");
		
		try {
			for (int valor : linha) {
				System.out.print(valor + " ");
			}
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel mostrar o Tri�ngulo de Pascal, pois o valor digitado � negativo.");
		}
		
		teclado.close();

	}

}
