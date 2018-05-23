package FilaDinamica;

import java.util.Scanner;

import FilaDinamica.FilaDinamica;

public class Hospital {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int opcao = 0;
		FilaDinamica filaHospital = new FilaDinamica();
		while( (opcao != 4) || (opcao > 4) ){
			System.out.println("-----------MENU--------------");
			System.out.println("-  1 - Chegada paciente     -");
			System.out.println("-  2 - Atendimento paciente -");
			System.out.println("-  3 - Mostrar fila         -");
			System.out.println("-  4 - Sair                 -");
			System.out.println("-----------------------------");
			System.out.print("Digite uma opção: ");

			opcao = Integer.parseInt(in.nextLine());
			if(opcao == 1){
				System.out.println("-----------------------------");
				System.out.println("-  1 - Chegada paciente     -");
				System.out.println("Escreva o nome do paciente");
				String nome = in.nextLine(); // pega o nome do paciente
				filaHospital.add(nome);	// adiciona o paciente
				System.out.println("-----------------------------");
			}else{
				if(opcao == 2){
					System.out.println("-----------------------------");
					System.out.println("-  2 - Atendimento paciente -");
					filaHospital.remove(); // Atende um cliente e remove da fila
					System.out.println("-----------------------------");
				}else{
					if(opcao == 3){
						System.out.println("-----------------------------");
						System.out.println("-  3 - Saida paciente       -");
						filaHospital.list(); // lista a fila						
						System.out.println("-----------------------------");
					}
				}
			}
		}

		

//		filaHospital.add("Jubileu");
//		filaHospital.add("Adolf Hitinho");
//		filaHospital.add("Thais Mococa");
//		filaHospital.add("Rogerio Ceni");
//		filaHospital.add("Regina Santista");
//		filaHospital.add("Mikael Eduardo");
//		filaHospital.add("Há Negão");
//		filaHospital.add("Sirius Black");
//		filaHospital.add("Dani que faz Salmão");
//		filaHospital.add("Bruno LINDOOOOOOOOOOOOOOOO <3");
//
//		for ( int a = 10; a > 0; a-- ){
//			System.out.println("-------------------------");
//			System.out.println("Pessoas na fila " + a);
//			filaHospital.list();
//			filaHospital.remove();
//			System.out.println("-------------------------");
//			if ( a == 1 ){
//				System.out.println("Acabou a Fila!!!!!!");
//			}
//		}	
	}

}
