/**
 *Binary tree is a class that
 *implements a very basic
 *tree-like thing and has
 *methods that add, delete,
 *and do other basic things
 *with trees
 *
 */
class BinaryTree<T extends Comparable> {

	T value;
	Node<T> leftChild;
	Node<T> rightChild;
    Node<T> root;



	/**
	 *Node class
	 *creates Nodes to contruct
	 *the tree with
	 *
	 */
	class Node<T extends Comparable> {

		T value;
		Node<T> leftChild;
		Node<T> rightChild;		

		public Node(T value, Node<T> leftChild, Node<T> rightChild) {
			this.value = value;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}

		public Node(T value) {
			this.value = value;
			this.leftChild = null;
			this.rightChild = null;
		}
	}

	public BinaryTree(T value, Node<T> leftChild, Node<T> rightChild) {
        this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
    }

	public BinaryTree(T value) {
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}

	public T getValue() {
		return this.value;
	}

	public Node<T> getLeftChild() {
		return this.leftChild;
	}

	public Node<T> getRightChild() {
		return this.rightChild;
	}

	public void setValue(T newValue) {
		this.value = newValue;
	}

	public void setLeftChild(Node<T> newLeft) {
		this.leftChild = newLeft;
	}

	public void setRightChild(Node<T> newRight) {
		this.rightChild = newRight;
	}

    /**
     *inserrrrrtt
     *
     *@param node to add
     *
	 */
	public void insert(Node<T> newNode) {
			


    /**
     *deleeeeeeeeeete
     *
     *@param 
     *
	 *@return
     *
	 *
	 */

    /**
     *fiiiiiiiiiind
     *
     *@param 
     *
	 *@return
     *
	 *
	 */

}
