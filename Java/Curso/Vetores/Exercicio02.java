import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2
		
		Scanner numeros = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int numero6;

		System.out.println("Informe o primeiro n�mero: ");
		numero1 = numeros.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		numero2 = numeros.nextInt();
		
		System.out.println("Informe o terceiro n�mero: ");
		numero3 = numeros.nextInt();
		
		System.out.println("Informe o quarto n�mero: ");
		numero4 = numeros.nextInt();
		
		System.out.println("Informe o quinto n�mero: ");
		numero5 = numeros.nextInt();
		
		System.out.println("Informe o sexto n�mero: ");
		numero6 = numeros.nextInt();
		
		System.out.println("Esse � o primeiro n�mero: " + numero1);
		System.out.println("Esse � o segundo n�mero: " + numero2);
		System.out.println("Esse � o terceiro n�mero: " + numero3);
		System.out.println("Esse � o quarto n�mero: " + numero4);
		System.out.println("Esse � o quinto n�mero: " + numero5);
		System.out.println("Esse � o sexto n�mero: " + numero6);
		
		numeros.close();

	}

}
