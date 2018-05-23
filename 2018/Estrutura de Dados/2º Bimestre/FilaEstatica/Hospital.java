package FilaEstatica;

public class Hospital {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Exercicio 2
		
		FilaEstatica filaHospital = new FilaEstatica();
		
		filaHospital.add("Jubileu");
		filaHospital.add("Adolf Hitinho");
		filaHospital.add("Thais Mococa");
		filaHospital.add("Rogerio Ceni");
		filaHospital.add("Regina Santista");
		filaHospital.add("Mikael Eduardo");
		filaHospital.add("Há Negão");
		filaHospital.add("Sirius Black");
		filaHospital.add("Dani que faz Salmão");
		filaHospital.add("Bruno LINDOOOOOOOOOOOOOOOO <3");

		for ( int a = 10; a > 0; a-- ){
			System.out.println("-------------------------");
			System.out.println("Pessoas na fila " + a);
			filaHospital.show();
			filaHospital.remove();
			System.out.println("-------------------------");
			if ( a == 1 ){
				System.out.println("Acabou a Fila!!!!!!");
			}
		}	
	}
}
