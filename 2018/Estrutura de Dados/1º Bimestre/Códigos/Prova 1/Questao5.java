import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a string: ");
		
		String texto = teclado.nextLine();
		
		Pilha pilha = new Pilha(texto.length()); //aqui
		
		for (int i = 0; i < texto.length(); i++) {
			System.out.println("Caractere " + (i + 1) + ": " + texto.charAt(i));
			pilha.push(texto.charAt(i)); //aqui
		}
		
		boolean palindromo = true; //aqui
		
		for (int i = 0; i < texto.length(); i++) { //aqui
			if (texto.charAt(i) != (char) pilha.pop()) { //aqui
				palindromo = false; //aqui
				break; //aqui
			} //aqui
		} //aqui
		
		System.out.println("Palindromo: " + palindromo); //aqui
	}
}
