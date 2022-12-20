package worksheet3;

import java.util.Iterator;
import java.util.LinkedList;

public class AdjacencyList implements Iterable<Integer> {
	private LinkedList<Integer> adjacencies;
	private int id;
	private Integer vertexIndex = 0;
	
	public AdjacencyList(int id) {
		adjacencies = new LinkedList<Integer>();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void add(int neighbour) {
		adjacencies.add(neighbour);
	}
	
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			Integer vertex = adjacencies.get(vertexIndex);

			@Override
			public boolean hasNext() {
				return (vertex > 0);
			}

			@Override
			public Integer next() {
				Integer tempVertex = vertex;
				vertexIndex++;
				return tempVertex;
			}
		};
	}
	
	public boolean contains(int v) {
		boolean containsV = false;
		for (int i = 0; i < adjacencies.size(); i++) {
			if (adjacencies.get(i) == v)
				containsV = true;
		}
		return containsV;
	}
}
