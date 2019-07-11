package Tree;


public class test1 {
	class Node {
		Node right;
		Node left;
		int data;

		Node(int value) {
			right = left = null;
			data = value;
		}

	}

	Node root;

	test1() {
		root = null;
	}

	public void insert(int value) {
		if (root == null)
			root = new Node(value);
		else
			insertNode(root, value);
	}

	public void insertNode(Node root1, int value) {
		Node tempNode=new Node(value);
		if(root1.data>value)
			if(root1.left==null)
				root1.left=tempNode;
			else 
				insertNode(root1.left,value);
		else if(root1.data<value)
			if(root1.right==null)
				root1.right=tempNode;
			else 
				insertNode(root1.right,value);
	}
	public void inOrder() {
		inOrderTraversal(root);
	}
	public void inOrderTraversal(Node root1) {
		if (root1 == null) 
            return;
		inOrderTraversal(root1.left);
		System.out.println(root1.data);
		inOrderTraversal(root1.right);
	}
	public static void main(String[] args) {
		test1 t1 = new test1();
		t1.insert(4);
		t1.insert(3);
		t1.insert(5);
		t1.insert(6);
		t1.insert(2);
		t1.insert(1);
		t1.inOrder();
	}
}
