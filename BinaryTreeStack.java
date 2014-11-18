class BinaryTreeStack {
	private Node root;

	private static class Node {
		int key;
		String name;
		Node left;
		Node right;
		Node(int newKey, String newName){
			this.key = newKey;
			this.name = newName;
			this.left = null;
			this.right = null;
		}
	}

	public BinaryTreeStack(){
		root = null;
	}

	public void insertNode(int key, String name){
		root = insertNode(root, key, name);
	}

	public Node insertNode(Node node, int key, String name){
		if (node == null) 
			node = new Node(key, name);
		else 
			if (node.key > key)
				node.left = insertNode(node.left, key, name);
			else
				node.right = insertNode(node.right, key, name);
		return node;
	}

	public void traversePreOrder(){
		if (root == null) return;
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		while (!st.empty()){
	
			Node node = st.pop();
			System.out.println(node.key);
			if (node.right != null)
				st.push(node.right);
			if (node.left != null)
				st.push(node.left);
		}
	}

	public void traverseInOrder(){
		if (root == null) return;
		Stack<Node> st = new Stack<>();
		Node node = root;
		while (node != null || !st.empty()){
			if (node != null){
				st.push(node);
				node = node.left;
			}
			else if (!st.empty()){
				node = st.pop();
				System.out.println(node.key);
				node = node.right;
			}
		}
	}
	
	public void traversePostOrder(){
		if (root == null) return;
		Stack<Node> st = new Stack<Node>();	
		st.push(root);
		Node previous = null;
		while (!st.empty()){			
			Node node = st.peek();
			if (node == null)
				st.pop();
			else if (node.right == null && node.left == null){
				System.out.println(node.key);
				st.pop();
			}
			else if (node.left == previous)
				st.push(node.right);
			else if (node.right == previous){
				System.out.println(node.key);
				st.pop();
			}	
			else
				st.push(node.left);
			previous = node;
		}
	}

	public void printLevels(){
		Queue<Node> stOne = new LinkedList<Node>();
		Queue<Node> stTwo = new LinkedList<Node>();
		stOne.add(root);
		System.out.println(root.key);
		while(!stOne.isEmpty()){
			Node node = stOne.poll();
			
			if (node.left != null){
				stTwo.add(node.left);
				System.out.print(node.left.key + " ");
			}
			if (node.right != null){
				stTwo.add(node.right);
				System.out.print(node.right.key + " ");
			}
			if (stOne.isEmpty()){
				stOne = stTwo;
				System.out.println("");
			}
		}
	}
	
	public static void main(String[] args){
		BinaryTreeStack tree = new BinaryTreeStack();
		tree.insertNode(6, "abc");
		tree.insertNode(9, "bbc");
		tree.insertNode(4, "cbc");
		tree.insertNode(7, "ccb");
		tree.insertNode(2, "aba");
		//tree.traversePreOrder();
		//tree.traversePostOrder();
		//tree.traverseInOrder();
		tree.printLevels();
	}
}
