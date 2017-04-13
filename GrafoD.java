import java.util.ArrayList;


public class GrafoD extends Grafo{

	
	public GrafoD(int numVertices) {
		super( numVertices);
	}
	
	public int numVertices(){
		return numVertices;
	}
	
	public int numArcos(){
		return numArcos;
	}
	
	public boolean existeArco(int i, int j){
		ArrayList<Integer> vecinos=this.adyacentesDe(i); 
		for (Integer v: vecinos){
			if (v == j){
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Integer> adyacentesDe(int i) {
		return adyacentes.get(i);
	}
	
	public void insertarVertice(ArrayList<Integer> a) {
		ArrayList<Integer> ady = a;
		adyacentes.add(ady);
	}

	public void insertarArco(int i, int j){
		adyacentes.get(i).add(j);
	}
	
	public String imprimirAdyacentes(int i){
		ArrayList<Integer> lista = adyacentes.get(i);
		String s = "";
		for (Integer adyacente : lista) {
			s+= adyacente.toString()+" ";
		}
		return s;
	}

}
