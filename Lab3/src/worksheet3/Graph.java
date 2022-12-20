package worksheet3;

public class Graph {
	private AdjacencyMatrix neighboursMatrix;
	private AdjacencyLists neighboursLists;
	
	public Graph(int[][] adjMatrix) {
		neighboursMatrix = new AdjacencyMatrix(adjMatrix);
	}
	
	public AdjacencyList getNeighboursFor(int v) {
		AdjacencyList adjList = new AdjacencyList(v);
		int numOfVertices = neighboursMatrix.numOfVertices();
		for (int i = 0; i < numOfVertices; i++) {
			if (neighboursMatrix.get(v, i) > 0) 
				adjList.add(i);
		}
		return adjList;
	}
	
	public int numOfVertices() {
		int numberOfVertices = neighboursMatrix.numOfVertices();
		return numberOfVertices;
	}
	
	public int numOfEdges() {
		int numberOfEdges =  0;
		int numOfVertices = neighboursMatrix.numOfVertices();
		for (int i = 0; i < numOfVertices; i++) {
			for (int index = 0; index < numOfVertices; index++) {
				int edge = neighboursMatrix.get(i, index);
				if (edge > 0) 
					numberOfEdges++;
			}	
		}
		return numberOfEdges;
	}
	
	public int getWeight(int u, int v) {
		int weight = neighboursMatrix.get(u, v);
		return weight;
	}
	
	public AdjacencyList somePath(int u, int length) {
		neighboursLists = new AdjacencyLists(neighboursMatrix);
		AdjacencyList adjList = neighboursLists.getNeighboursFor(u);
		return adjList;
	}
}
