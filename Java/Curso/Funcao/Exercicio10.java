import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {
		// 10
		
		Random aleatorio = new Random();
		
		System.out.println(maiorNumero(aleatorio.nextInt(100) + 0, aleatorio.nextInt(100) + 0));
	}
	
	public static int maiorNumero(int a, int b) {
		System.out.println("N�mero A: " + a);
		System.out.println("N�mero B: " + b);
		
		System.out.print("O maior n�mero �: ");
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
