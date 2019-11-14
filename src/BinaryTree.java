class Node
{
	int Key;
	Node left,right;
	public Node(int item)
	{
	  Key=item;
	  left=right=null;
	  
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(int Key)
	{
		root=new Node(Key);
	}
	BinaryTree()
	{
		root=null;
	}

	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.right.right=new Node(5);

		System.out.println(""+tree);
	}

}
