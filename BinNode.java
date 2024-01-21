package part1;

public class BinNode {
	
	//Yarin Ackerman
	//Rami Abu Rabia 
	
	private int key;
	private BinNode left;
	private BinNode right;
	
	public BinNode(int key) {
		
		this.key=key;
	}
	
	public String toString() {
		
		return String.format("%d", key);
	}

	public int getKey() {
		
		return key;
	}

	public void setKey(int key) {
		
		this.key = key;
	}

	public BinNode getLeft() {
		
		return left;
	}

	public void setLeft(BinNode left) {
		
		this.left = left;
	}

	public BinNode getRight() {
		
		return right;
	}

	public void setRight(BinNode right) {
		
		this.right = right;
	}
}
