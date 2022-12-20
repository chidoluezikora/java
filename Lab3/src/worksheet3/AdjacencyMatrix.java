package worksheet3;

public class AdjacencyMatrix {
	private int[][] adjMatrix;

	public AdjacencyMatrix(int[][] adjMatrix) {
		this.adjMatrix = adjMatrix;
	}
	
	public int get(int v, int u) {
		int edge = adjMatrix[v][u];
		return edge;
	}
	
	public int[][] getAdjMatrix() {
		return adjMatrix;
	}
	
	public int numOfVertices() {
		int numberOfVertices = adjMatrix.length;
		return numberOfVertices;
	}
}
