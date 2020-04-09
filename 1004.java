import java.util.Scanner;
public class 1004{
	public static void main (String[] args){
		Scanner leitura = new Scanner (System.in);
		int A, B, SOMA;
		System.out.println("Insira o primeiro número:");
		A = leitura.nextInt();
		System.out.println("Insira o segundo número:");
		B = leitura.nextInt();
		SOMA = A+B;
		System.out.println ("SOMA: " +SOMA);
	}
}