package Tree;

public class BST {
	class Node {
		int data;
		Node leftChild;
		Node rightChild;

		Node(int item) {
			data = item;
		}
	}

	Node root;

	BST() {
		root = null;
	}

	public void insert(int item) {
		if (root == null)
			root = new Node(item);
		else
			insertNode(root, item);
	}

	private void insertNode(Node root, int item) {
		// TODO Auto-generated method stub
		Node tempNode = new Node(item);
		if (root.data < item)
			if (root.leftChild == null)
				root.leftChild = tempNode;
			else
				insertNode(root.leftChild, item);
		else if (root.data > item)
			if (root.rightChild == null)
				root.rightChild = tempNode;
			else
				insertNode(root.rightChild, item);
	}
	
	public static void main(String[] args) {

	}
}
