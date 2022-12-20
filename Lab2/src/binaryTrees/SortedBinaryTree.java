/**
 * 08.12.2021
 * Provides SortedBinaryTree object(s).
 * @author Emmanuel Anokwuru, Chidolue Zikora
 * @version 1.0
 */

package binaryTrees;

import java.util.Iterator;

public class SortedBinaryTree<E> implements Iterable<Node> {
	private Node root;

	public SortedBinaryTree() {
	}

	public void addRoot(Node aNode) {
		root = aNode;
		root.setParent(null);
		root.setLeft(null);
		root.setRight(null);
	}

	public Node getRoot() {
		return root;
	}

	public void insert(Node node) {
		if (root == null) {
			root = node;
		}
		insert(root, node, null);
	}

	private Node insert(Node root, Node k, Node pre) {
		Node newRoot = null;
		if (root == null) {
			root = k;
			root.setParent(pre);
			root.setLeft(null);
			root.setRight(null);

		} else {
			if (k.getKey() < root.getKey()) {

				newRoot = insert(root.getLeft(), k, root);
				root.setLeft(newRoot);

			} else if (k.getKey() > root.getKey()) {

				newRoot = insert(root.getRight(), k, root);
				root.setRight(newRoot);

			}
		}
		return root;

	}

	private void setRoot(Node k) {
		this.root = k;
	}

	public Iterator<Node> iterator() {
		return new Iterator<Node>() {
			private Node captain = minimum(root);

			@Override
			public boolean hasNext() {
				return captain != null;
			}

			@Override
			public Node next() {
				Node tempCaptain =captain;
				captain = succ(captain);
				return tempCaptain;
			}
		};
	}

	public Node succ(Node node) {
		Node predecessor;
		if (node.getRight() != null) {
			return minimum(node.getRight());
		} else
			predecessor = node.getParent();

		while (predecessor != null && predecessor.getKey() <= node.getKey()) {
			predecessor = predecessor.getParent();
		}
		return predecessor;
	}

	public Node find(int k) {
		return root;
	}

	public Node minimum(Node node) {
		while (node.getLeft() != null) {
			node = node.getLeft();
		}
		return node;
	}
	
	public void addTree(SortedBinaryTree<E> tree) {
		Iterator<Node> iteratorForTree=tree.iterator();
		while (iteratorForTree.hasNext()) {
				Node player = iteratorForTree.next();
				Node newPlayer= new Node(player.getKey());
				this.insert(newPlayer);
			}
		}
	}


