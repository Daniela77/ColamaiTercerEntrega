
import java.util.ArrayList;

public abstract class Grafo{
	
	protected int numVertices, numArcos;
	protected ArrayList<ArrayList<Integer>> adyacentes;
	
	public Grafo(int numVertices) {
		this.numVertices = numVertices;
		this.numArcos = 0;
		this.adyacentes = new ArrayList<ArrayList<Integer>>(numVertices);
		for (int i = 0; i < numVertices; i++) {
			adyacentes.add(new ArrayList<Integer>());
		}
	}
	
		
	public abstract int numVertices();
	public abstract int numArcos();
	public abstract boolean existeArco(int i, int j);
	public abstract void insertarArco(int i, int j);
	public abstract void insertarVertice(ArrayList<Integer> a);
	public abstract ArrayList<Integer> adyacentesDe(int i);
	
	public String toString(){
		String res = "" ;
		for (int i = 0 ; i < numVertices() ; i++) {
			res += "Vertice: " + i;
			ArrayList<Integer> lista = adyacentesDe(i);
			res += (lista.isEmpty()) ? " no tiene adyacentes " : " tiene adyacentes: ";
			for (int i1 = 0; i1 < lista.size();i1++)
				res += lista.get(i1) + " ";
			res += "\n";
		} return res;
	}

	
}


