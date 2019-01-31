package com.learning.ds;

class BNode{
	int data;
	BNode left;
	BNode right;
	
	BNode(int data){
		this.data = data;
		left = null;
		right = null;
	}
	
}

class MyTree{
	BNode root = null;
	
	void addRoot(int data) {
		BNode newNode = new BNode(data);
		root = newNode;
	}
	
	void addNodeLeft(BNode current, int data) {
		BNode addNode = new BNode(data);
		current.left = addNode;
	}
	
	void addNodeRight(BNode current,int data) {
		BNode addNode = new BNode(data);
		current.right = addNode;
	}
	
	int findTreeHeight() {
		if(root == null)
			return 0;
		else {
			BNode node = root;
			int leftHeight=1;
			while(node.left !=null) {
				leftHeight++;
				node = node.left;
			}
			int rightHeight =1;
		    node = root;
			while(node.right !=null) {
				rightHeight++;
				node = node.right;
			}
			return Math.max(rightHeight,leftHeight);
		}
	}
}

public class FindTreeHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prepare the tree
		MyTree tree = new MyTree();
		tree.addRoot(1);
		tree.addNodeLeft(tree.root, 2);
		tree.addNodeRight(tree.root, 3);
		tree.addNodeLeft(tree.root.left, 4);
		tree.addNodeRight(tree.root.left, 5);
		System.out.println(tree.findTreeHeight());
		
		

	}

}
