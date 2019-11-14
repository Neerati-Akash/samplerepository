import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTTestTree<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 0;
		Scanner scan = new Scanner(System.in);
		CapacityGetterSetter getset = new CapacityGetterSetter();
		size = Integer.parseInt(scan.nextLine());
		size++;
		getset.setCapacity(size);
		Integer[] testlist = new Integer[size];
		testlist[0] = null;
		String data = scan.nextLine();
		String[] items = data.split(" ");
		IBST<Integer> btree1 = new BinarySearchTree<Integer>();
		for (int i = 1; i < size; i++) {
			if (Integer.parseInt(items[i - 1]) != 0) {
				testlist[i] = Integer.parseInt(items[i - 1]);
				btree1.insertNode(testlist[i], testlist[i]);
			}

		}

		// System.out.println();
		int inputs = Integer.parseInt(scan.nextLine());

		while (inputs > 0) {
			String operation = scan.nextLine();
			String[] temp = operation.split(" ");
			if (temp[0].equals("P")) {
				btree1.printTree();
				System.out.println();
			}
			
			else if (temp[0].equals("FMin")) {
			   Node<Integer> node = (Node<Integer>) btree1.findNode(Integer.parseInt(temp[1]));
			   System.out.println("Minimum " + btree1.findMinimum(node));
			}
			
			else if (temp[0].equals("FMax")) {
			   Node<Integer> node = (Node<Integer>) btree1.findNode(Integer.parseInt(temp[1]));
			   System.out.println("Maximum " + btree1.findMaximum(node));
			}
			
			else if (temp[0].equals("FPre")) {
			   Node<Integer> node = (Node<Integer>) btree1.findNode(Integer.parseInt(temp[1]));
			   System.out.println("Predecessor: " + btree1.findPredecessor(node));
			}
			else if (temp[0].equals("FSuc")) {
			   Node<Integer> node = (Node<Integer>) btree1.findNode(Integer.parseInt(temp[1]));
			   System.out.println("Sucecessor: " + btree1.findSuccessor(node));
			}
			else if (temp[0].equals("PR ")) {
			    System.out.println("Keys in Range :");
			   btree1.printElementInorder(Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),(Node<Integer>) btree1.getRoot());
			}
		
			if (temp[0].equals("PreT")) {
				System.out.println("Preorder Traversal");
				btree1.preorderTraverse((Node<Integer>) btree1.getRoot());
				System.out.println();
			}
			if (temp[0].equals("PosT")) {
				System.out.println("Postorder Traversal");
				btree1.postorderTraverse((Node<Integer>) btree1.getRoot());
				System.out.println();
			}
			if (temp[0].equals("InT")) {
				System.out.println("Inorder Traversal");
				btree1.inorderTraverse((Node<Integer>) btree1.getRoot());
				System.out.println();
			}
			else if (temp[0].equals("LevT")) {
				System.out.println("Level order Traversal");
				btree1.levelorderTraverse((Node<Integer>) btree1.getRoot());
				System.out.println();
			}
		
			inputs--;
		}

	}

}

interface IBST<E> {
	int size();

	boolean isEmpty();
	Object getRoot();
	void setRoot(Node<E> node);
	Object findNode(int val);
    void insertNode(int k1, E val);
	void printTree();
	void inorderTraverse(Node<E> node);
	void preorderTraverse(Node<E> node);
	void postorderTraverse(Node<E> node);
	void levelorderTraverse(Node<E> node);
	E findMinimum(Node<E> node);
    E findMaximum(Node<E> node);
    void printElementInorder(int k1,int k2,Node<E> node);
	E findSuccessor(Node<E> node);
	E findPredecessor(Node<E> node);
	
	
	

}

class CapacityGetterSetter {
	private static int treesize;

	public int getCapacity() {
		return this.treesize;
	}

	public void setCapacity(int cap) {
		treesize = cap;
	}
}

class Node<E> {

	/**
	 * @param args
	 */
	private E element;
	private int key;
	private Node<E> parent;
	private Node<E> leftchild;
	private Node<E> rightchild;

	public Node() {
		element = null;
		key = -1;
		parent = null;
		leftchild = null;
		rightchild = null;
	}

	public Node(int k, E e, Node curparent) {
		key = k;
		element = e;
		parent = curparent;
	}

	public E getElement() {
		return element;
	}

	public int getKey() {
		return key;
	}

	public Node<E> getParent() {
		return parent;
	}

	public Node<E> getlChild() {
		return leftchild;
	}

	public Node<E> getrChild() {
		return rightchild;
	}

	public void setKey(int k1) {
		key = k1;
	}

	public void setElement(E e) {
		element = e;
	}

	public void setParent(Node<E> parent1) {
		parent = parent1;
	}

	public void setLeft(Node<E> lchild) {
		leftchild = lchild;
		leftchild.setParent(this);
	}

	public void setRight(Node<E> rchild) {
		rightchild = rchild;
		rightchild.setParent(this);
	}

	public boolean isInternal() {
		return (leftchild != null || rightchild != null);
	}

	public boolean isExternal() {
		return (leftchild == null && rightchild == null);
	}

	public boolean isRoot() {
		return (parent == null);
	}
}

class BinarySearchTree<E> implements IBST<E> {
	private Node<E> root;
	private int sz;
	CapacityGetterSetter getset = new CapacityGetterSetter();
	int size = 0;
	private Node<E>[] nodelist;

	public BinarySearchTree() {
		root = null;
		sz = 0;
	}

	public Node<E> getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	public void setRoot(Node<E> node) {
		// TODO Auto-generated method stub
		root = node;
		sz++;
	}

	public Object findNode(int val) {
		Node<E> cur = root;
	
		//..........
		
	
		return cur;
	}

	public Node<E> getNode(int pos) {
		return nodelist[pos];
	}
	// inserts a node whose value is elt as a child of curnode

	public void insertNode(int k1, E val) {
		// TODO Auto-generated method stub
	    //code to insert the node with k1 and val
	}

	public void printTree() {
		for(int i=1;i<nodelist.length;i++)
		{
			if(nodelist[i]!=null) {
				System.out.println("Elt-"+nodelist[i].getElement()+";Pos"+i);
			}
		}
	}

	public void inorderTraverse(Node<E> node) {
		if(node!=null)
		{
			inorderTraverse(node.getlChild());
			System.out.println(node.getElement()+"->");
			inorderTraverse(node.getrChild());
		}
	}

	public void preorderTraverse(Node<E> node) {
		if(node!=null)
		{
			System.out.println(node.getElement()+"->");	
			preorderTraverse(node.getlChild());
			preorderTraverse(node.getrChild());
		}
	
	}

	public void postorderTraverse(Node<E> node) {
		if(node!=null) {
			postorderTraverse(node.getlChild());
			postorderTraverse(node.getrChild());
			System.out.println(node.getElement()+"->");	
		}

	}

	public void levelorderTraverse(Node<E> node) {
		
		if (node == null) {
            return;
        }
     
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(node);
     
        while (!(nodes.isEmpty())) {
     
            Node<Integer> n = nodes.remove();
     
            System.out.print(n.getElement()+"->");
     
            if (n.getlChild() != null) {
                nodes.add(n.getlChild());
            }
     
            if (n.getrChild()!= null) {
                nodes.add(n.getrChild());
            }
        }

	}

	public int size() {
		// TODO Auto-generated method stub
		return sz;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (sz == 0);
	}

	
	public E findMinimum(Node<E> node) {
		//Find the minimum key of the subtree rooted at node
		
		return null;
	}
	
   public E findMaximum(Node<E> node){
		//Find the maximum key of the subtree rooted at node
		
	   return null;
	}
	
   public void printElementInorder(int k1,int k2,Node<E> node){
		//print all the keys in the range of (k1,k2) of the subtree rooted at node
		
	}
	
	public E findSuccessor(Node<E> node){
		//Find the predecessor of the node

		return null;
	}
	
	public E findPredecessor(Node<E> node){
		//Find the successor of the node
		
		
		return null;
	}
	

}