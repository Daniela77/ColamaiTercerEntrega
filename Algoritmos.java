import java.util.ArrayList;
import java.util.Stack;


public class Algoritmos {
	

	public enum color{
	AMARILLO, BLANCO, NEGRO};
	
	color visitados[];
  
	public  void DFS(GrafoD g){
	
	visitados = new color[g.numVertices()];
		
	for (int i=0;i<g.numVertices();i++){
			visitados[i] = color.BLANCO;
		}
		
		for (int i=0;i<g.numVertices();i++){
			if (visitados[i] == color.BLANCO){
				DFS_Visit(i,g);
			}
		}
	}
	
	
	public void DFS_Visit(int u,GrafoD g){
		visitados[u] = color.AMARILLO;
		ArrayList <Integer> ady = g.adyacentesDe(u);
		
		for (int i = 0; i < ady.size(); i++) {
			if(visitados[ady.get(i)]==color.BLANCO){
				DFS_Visit(ady.get(i),g);
			}else if(visitados[ady.get(i)]==color.AMARILLO){
				System.out.println("es ciclico");				
			}
		}
		visitados[u] = color.NEGRO;
	}
	
//** DFS ITERATIVO**//	
	
	public void DFSiterativo(int u,GrafoD g){
	visitados = new color[g.numVertices()];	
	for (int i=0;i<g.numVertices();i++){
			visitados[i] = color.BLANCO;
	}
	Stack<Integer> pila= new Stack<Integer>();
	for (int i=0;i<g.numVertices();i++){
		if (visitados[i] == color.BLANCO){
			visitados[i] = color.AMARILLO;
			pila.push(i);
			if (!pila.empty()){
				pila.pop();
				ArrayList <Integer> ady = g.adyacentesDe(i);
				for (int j = 0; j < ady.size(); j++) {
					if(visitados[ady.get(j)]==color.BLANCO){
						visitados[j] = color.AMARILLO;
						pila.push(j);
					}else if(visitados[ady.get(j)]==color.AMARILLO){
						System.out.println("Hay ciclo");
					}
				}visitados[i] = color.NEGRO;
			}
		}
	}
}	

	
}
