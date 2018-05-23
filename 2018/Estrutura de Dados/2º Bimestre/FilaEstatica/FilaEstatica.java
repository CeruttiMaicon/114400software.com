package FilaEstatica;

public class FilaEstatica {
	
	private Object fila[];
	private int cauda;
	private int cabeca;

	
	//contrutor
	public FilaEstatica (){
		
	}
	
	//add elemento
	public void add (Object o){
		
		if (!this.isFull()){
			cauda = (cauda + 1) % fila.length;
			fila[cauda] = o;
			if (cabeca == -1){
				cabeca = cauda;
			}
		}		
	}
	
	//retira elemento
	public Object remove (){
		if ( !this.isEmpty() ){
			Object valor = fila[cabeca];
			fila[cabeca] = null;
			if ( cabeca == cauda ){
				cabeca = cauda = -1;
			}else{
				cabeca = (cabeca + 1 ) % fila.length;
			}
			return valor;
		}
		return null;
	}
	
	//se esta cheio
	public boolean isFull() {
		return (cauda + 1) % fila.length == cabeca;
	}

	//se esta vazio 
	public boolean isEmpty() {
		return false;
	}
	
	public void clear (){
		while (!this.isEmpty()){
			try{
				this.remove();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void show(){
		if ( !this.isEmpty() ){
			int i = cabeca;
			for ( i = cabeca; i != cauda; i = (i+1) % fila.length ) {
				System.out.println("Valor " + fila[i]);
			}
			System.out.println("Valor " + fila[i]);
		}
	}


}
