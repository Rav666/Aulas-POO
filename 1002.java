import java.util.Scanner;

public class Circulo {

public static void main (String[] args){

Scanner leitura = new Scanner (System.in);

double raio, area;

System.out.println("Insira o raio do círculo: ");
raio = leitura.nextDouble();

raio = raio*raio;
area = raio*3.14159;
System.out.println ("A área do círculo é de: " +area);

}
}