package Grafos;

public class Grafo <V>{
	
	class LinkedList<V>{
		class Node{

			private Node next;
			private V value;
			public Node() {
			}
			
			public Node(V value){
				this.value = value;
			}
		
			public Node(V value, Node next) {
				this.value = value;
				this.next = next;
			}
			
			public String toString() {
				return value.toString();
			}
		}
	}
	
	class vertex{
		protected V value;
		
		public vertex(V value) {
			this.value = value;
		}
	}
	
	class edge{
		protected int weight;
		
		public edge(int weight) {
			this.weight = weight;
		}
	}
	
	private class NodoAd{
		protected vertex value;
		protected int longitudarista;
		
		public NodoAd(vertex value, int longitudarista) {
			this.value = value;
			this.longitudarista = longitudarista;
		}
	}
	//atributos de clase
	private int size;
	private LinkedList<NodoAd>[] adyacencia;
	
	public Grafo() {
		
	}
	
	public void BFS(Grafo g, vertex s) {
		for (LinkedList  list: adyacencia) {
			
		}
	}
	public void DFS(Grafo g) {
		
	}
	
}

