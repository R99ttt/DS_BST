package part1;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	
	//Yarin Ackerman
	//Rami Abu Rabia
	
	private BinNode root;
	
	public BST(){
		
		
	}	
	
	public BST(BST otherTree) {
		
		this.root=otherTree.root;
	}

	public BinNode getRoot() {
		
		return root;
	}
	
    public void add(BinNode newNode) {
        if (root == null) {
            root = newNode;
            return;
        }
        BinNode current = root;
        BinNode parent = null;
        while (current != null) {
            parent = current;
            if (newNode.getKey() < current.getKey()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        if (newNode.getKey() < parent.getKey()) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
    }
	
	public BinNode search(int key) {
		
		BinNode runner=root;
		
		while(runner != null) {
			
			if(runner.getKey() == key) {
				return runner;
			}
			else {
					
				if(runner.getKey() > key) {
					
					runner=runner.getLeft();
				}
				else {
					
					runner=runner.getRight();
				}			
			}		
		}	
		return null;
		
	}

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private BinNode deleteRec(BinNode root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.getKey()) {
            
        	root.setLeft(deleteRec(root.getLeft(), key));
        } 
        else if (key > root.getKey()) {
            
        	root.setRight(deleteRec(root.getRight(), key));
        } 
        else {
            
        	if (root.getLeft() == null) {
                
        		return root.getRight();
            } 
        	else if (root.getRight() == null) {
                
        		return root.getLeft();
            }

            BinNode minNode = root.getRight();
            
            while (minNode.getLeft() != null) {
                
            	minNode = minNode.getLeft();
            }

            root.setKey(minNode.getKey());
            root.setRight(deleteRec(root.getRight(), minNode.getKey()));
        }

        return root;
    }
    
	public void printAscendic(BinNode node) {
		
		if (node == null) {
			
			return;
		}

		printAscendic(node.getLeft());
		
		System.out.print(node.getKey() + " ");
		
		printAscendic(node.getRight());
	}
	

	public void printDescendic(BinNode node) {
		
		if (node == null) {
			
			return;
		}
		
		printDescendic(node.getRight());
		
		System.out.print(node.getKey() + " ");
		
		printDescendic(node.getLeft());
	}

	
	public void printByLevels() {
        
		if (root == null) {
            return;
        }
        
		Queue<BinNode> queue = new LinkedList<>();
        
		queue.add(root);
        
        while (!queue.isEmpty()) {
            
        	int size = queue.size();
            
        	for (int i = 0; i < size; i++) {
            	
        		BinNode current = queue.remove();
                System.out.print(current.getKey() + " ");
                
                if (current.getLeft() != null) {
                   
                	queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    
                	queue.add(current.getRight());
                }
            }
            System.out.println();
        }
    }

}
