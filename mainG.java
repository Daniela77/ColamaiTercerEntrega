/**
 * @author Daniela
 *
 */
public class mainG {

		public static void main(String[] args) {
			int cantNodos=5;
			int nodos=1000;
			GrafoD g = new GrafoD(cantNodos);
			g.insertarArco(0, 1);
			g.insertarArco(1, 2);
			g.insertarArco(2, 3);
			g.insertarArco(3, 4);
			g.insertarArco(4, 2);
			System.out.println("Grafo:\n");
			System.out.println(g.toString());
			System.out.println("----------------------------");
			System.out.println("Grafo de:" + cantNodos + " nodos.\nDFS Recursivo");
			Algoritmos rec = new Algoritmos();
			rec.DFS(g);
			System.out.println("----------------------------");
			System.out.println("Grafo de:" + cantNodos + " nodos.\nDFS Iterativo");
			Algoritmos it = new Algoritmos();
			it.DFSiterativo(cantNodos, g);
			GrafoD g1000 =new GrafoD(nodos);
			for (int i=0; i<nodos;i++){
				int nodo = (int) (Math.random()*999)+1;
				int adyacente = (int) (Math.random()*999)+1;
				g1000.insertarArco(nodo, adyacente);
			}
			System.out.println("----------------------------");
			System.out.println("Grafo 1000:\n");
//			System.out.println(g1000.toString());
			System.out.println("----------------------------");
			System.out.println("Grafo de:" + nodos + " nodos.\nDFS Recursivo");
			Algoritmos rec1000 = new Algoritmos();
			rec1000.DFS(g1000);
			System.out.println("----------------------------");
			System.out.println("Grafo de:" + nodos + " nodos.\nDFS Iterativo");
			Algoritmos it1000 = new Algoritmos();
			it1000.DFSiterativo(nodos, g1000);
						
	}

}
