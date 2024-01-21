package part1;

public class Main {

	public static void main(String[] args) {
		
		//Yarin Ackerman
		//Rami Abu Rabia
		
		
		BST tree = new BST();
		
		BinNode node = new BinNode(8);
		BinNode node2 = new BinNode(6);
		BinNode node3 = new BinNode(17);
		BinNode node4 = new BinNode(20);
		BinNode node5 = new BinNode(5);
		
		tree.add(node);
		tree.add(node2);
		tree.add(node3);
		tree.add(node4);
		tree.add(node5);
		
		
		System.out.println("Acsendic order:");
		tree.printAscendic(tree.getRoot());
		System.out.println();
		System.out.println();
		
		System.out.println("Descendic order:");
		tree.printDescendic(tree.getRoot());
		System.out.println();
		System.out.println();
		
		System.out.println("By levels:");
		tree.printByLevels();
		System.out.println();
		
		tree.delete(20);
		System.out.println("After deleting a node");
		tree.printAscendic(tree.getRoot());
		System.out.println();
		
		System.out.println(binaryTreeCheck(tree.getRoot()));
	}
	
	
	public static boolean binaryTreeCheck(BinNode root) {
		
		if (root == null) {
			return true;
		}
		
		if (root.getRight() != null && root.getKey() > root.getRight().getKey()) {
			
			return false;
		}
		
		if (root.getLeft() != null && root.getKey() < root.getLeft().getKey()) {
			
			return false;
		}
		return binaryTreeCheck(root.getLeft()) && binaryTreeCheck(root.getRight());
	}

}
