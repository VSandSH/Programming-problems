public class BinaryTree{ 
	private Node root;
	
	//  nested node class 
	private static class Node {
		int key;
		String name;
		Node left;
		Node right;
		Node (int newKey, String newName){
			left = null;
			right = null;
			key = newKey;
			name = newName;
		}
	}
	// constructor: creates binary tree with the root = null
	public Test(){
		root = null;  // lazy initialization
	}
	
	// recursive lookup
	public boolean lookup(int key){
		return (lookup(root, key));
	}
	
	public boolean lookup(Node node, int key){
		if (node == null)
			return (false);
		if (key == node.key)
			return (true);
		else if (key < node.key)
			return lookup(node.left, key);
		else
			return lookup(node.right, key);
	}
	
	// recursive insert
	public void insertNode(int key, String name){
		root = insert(root, key, name);
	}
	
	public Node insert(Node node, int key, String name){
		if (node == null)
			node = new Node(key, name);
		else if (node.key < key)
			node.right = insert(node.right, key, name);
		else
			node.left = insert(node.left, key, name);
		return (node);
	}
	
	// Post-order traversal
	public void printPostOrder(){
		printPostOrder(root);
		System.out.println();
	}
	public void printPostOrder(Node node){
		if (node == null) return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println("Key: "+ node.key + " and name: "+ node.name);
	}

	// Pre-order traversal
	public void printPreOrder(){
		printPreOrder(root);
		System.out.println();
	}
	public void printPreOrder(Node node){
		if (node == null) return;
		System.out.println("Key: "+ node.key + " and name: "+ node.name);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	// In-order traversal
	public void printInOrder(){
		printInOrder(root);
		System.out.println();
	}
	public void printInOrder(Node node){
		if (node == null) return;
		printInOrder(node.left);
		System.out.println("Key: "+ node.key + " and name: "+ node.name);
		printInOrder(node.right);
	}
	
	// mirror the tree
	public void mirror(){
		mirror(root);
	}
	public void mirror(Node node){
		if (node != null){
			mirror(node.left);
			mirror(node.right);
		
			Node tmp = node.right;
			node.right = node.left;
			node.left = tmp;
		}
	}
	
	// is BST
	public boolean isBST(){
		return (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	private boolean isBST(Node node, int min, int max){
		if (node == null)
			return (true);
		else {
			if (node.key < min || node.key > max)
				return (false);
			
			return (isBST(node.left, min, node.key - 1) && isBST(node.right, node.key + 1, max));
		}
	}

	public static void main(String[] args){
		BinaryTree node = new BinaryTree();
		node.insertNode(0, "Megan");
		node.insertNode(3, "Jennifer");
		node.insertNode(1, "Michael");
		node.insertNode(8, "Steven");
		node.insertNode(5, "Stephan");
		
		node.printPostOrder();
		//node.printPreOrder();
		//node.printInOrder();
		//node.mirror();
		//node.printPostOrder();
		System.out.println(node.isBST());
	}
}
