import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número de elementos: ");
		
		int capacidade = teclado.nextInt();
		
		Pilha pilha = new Pilha(capacidade); //aqui
		
		for (int i = 0; i < capacidade; i++) {
			System.out.print("Informe o valor do elemento " + (i + 1) + ":");
			double valor = teclado.nextDouble();
			
			pilha.push(valor); //aqui
		}
		
		pilha.list(); //aqui
	}
}
