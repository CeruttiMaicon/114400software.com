
public class Pilha {
	private Object[] conteudo;
	private int topo;
	
	public Pilha(int capacidade) {
		conteudo = new Object[capacidade];
		topo = 0;   
	}
	
	public boolean isEmpty() {
		return topo == 0;
	}
	
	public boolean isFull() {
		return topo == conteudo.length; 
	}
	
	public void push(Object elemento) {
		if (!this.isFull()) {
			conteudo[topo++] = elemento;
		}
	}
	
	public Object pop() {
		if (!this.isEmpty()) {
			Object elemento = conteudo[--topo];
			conteudo[topo] = null;
			return elemento;
		}
		
		return null;
	}
	
	public void clear() {
		while(!this.isEmpty()){
			this.pop();
		}
	}
	
	public void list() {
		for (int i = topo - 1; i >= 0; i--) {
			System.out.println("Valor: " + conteudo[i]);
		}
	}
}
