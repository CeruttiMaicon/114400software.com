package FilaDinamica;

import FilaDinamica.FilaDinamica;

public class SixElement {

	public static void main(String[] args) throws Exception {
		//Quest�o 1
		FilaDinamica fila = new FilaDinamica();	
			
		//Quest�o 2
		fila.add("20,0");
		fila.add("20,8");
		fila.add("20,3");
		fila.add("44,5");
		fila.add("33,33 aqui");
		fila.add("20,9 aqui");
		
		System.out.println("------------------SHOW 1----------------------");
		//Quest�o 3
		fila.list();	
		System.out.println("----------------------------------------------");
		
		//Quest�o 4
		fila.remove();
		fila.remove();
		
		System.out.println("------------------SHOW 2---------------------");
		//Quest�o 5
		fila.list();
		System.out.println("---------------------------------------------");
		
		//Quest�o 6
		System.out.println("----------------Esvaziando-------------------");
		fila.clear();
		System.out.println("---------------------------------------------");
		
		fila.list();
	}
}
