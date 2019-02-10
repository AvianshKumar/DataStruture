
class Node{
	int key;
	Node left,right;
	public Node(int item)
	{
		key=item;
		left=right=null;
		
	}
}



public class CreationOfTree {

	Node root;
	public  CreationOfTree()
	{
		root=null;
	}
	public  CreationOfTree(int key )
	{
		root =new Node(key);
	}
	public static void main(String args[])
	{
		CreationOfTree tree= new CreationOfTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left= new Node(4);
		
	}
	
	
	
	
	
	
}
