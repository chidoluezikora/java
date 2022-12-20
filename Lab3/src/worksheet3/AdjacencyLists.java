package worksheet3;

import java.util.ArrayList;

public class AdjacencyLists {
	private ArrayList<AdjacencyList> neighbourList;
	private AdjacencyMatrix neighbourMatrix;
	
	public AdjacencyLists(AdjacencyMatrix neighbourMatrix) {
		this.neighbourMatrix = neighbourMatrix;
	}
	
	public AdjacencyList getNeighboursFor(int v) {
		AdjacencyList adjList = new AdjacencyList(v);
		int numOfVertices = neighbourMatrix.numOfVertices();
		for (int i = 0; i < numOfVertices; i++) {
			if (neighbourMatrix.get(v, i) > 0) {
				adjList.add(i);
				System.out.println(i);
			}
		}
		return adjList;
	}
}
