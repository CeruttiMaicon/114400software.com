package FilaEstatica;

public class SixElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 1
		
	//Quest�o 1
	FilaEstatica fila = new FilaEstatica();	
		
	//Quest�o 2
	fila.add("20,0");
	fila.add("20,8");
	fila.add("20,3");
	fila.add("44,5");
	fila.add("33,33 aqui");
	fila.add("20,9 aqui");
	
	System.out.println("------------------SHOW 1----------------------");
	//Quest�o 3
	fila.show();	
	System.out.println("----------------------------------------");
	
	//Quest�o 4
	fila.remove();
	fila.remove();
	
	System.out.println("--------------SHOW 2--------------------------");
	//Quest�o 5
	fila.show();
	System.out.println("----------------------------------------");
	
	//Quest�o 6
	fila.clear();
	
	}
}
