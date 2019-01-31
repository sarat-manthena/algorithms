package com.learning.ds;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Queue;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class BinaryNode{
	int value;
	BinaryNode left;
	BinaryNode right;
	public BinaryNode(int value){
		this.value = value;
		left = null;
		right = null;
	}
}

class Tree{
	BinaryNode root;
	private BinaryNode addRecursive(BinaryNode current, int data) {
		if(current == null) {
			return new BinaryNode(data);
		}
		
		if(data < current.value) {
			current.left = addRecursive(current.left,data);
		}else if(data > current.value) {
			current.right = addRecursive(current.right,data);
		}else {
			return current;
		}
		return current;
	}
	public void add(int value) {
		root = addRecursive(root,value);
	}
	
	private boolean findRecursive(BinaryNode current, int data) {
		if(current == null)
			return false;
		
		if(data == current.value)
			return true;
		if(data < current.value)
			return findRecursive(current.left,data);
		else return findRecursive(current.right,data);
			
	}
	
	public boolean find(int value) {
		return findRecursive(root,value);
	}
	
	//Delete operation
	public void delete(int value) {
		root = deleteRecursive(root,value);
	}
	
	private int findSmallestValue(BinaryNode root) {
	    return root.left == null ? root.value : findSmallestValue(root.left);
	}
	
	private BinaryNode deleteRecursive(BinaryNode current, int data) {
		if(current == null)
			return null;
		
		if(current.value == data) {
			if(current.left == null && current.right == null)
				return null;
			if(current.right == null)
				return current.left;
			if(current.left == null)
				return current.right;
			
			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
			
		}
		if(data < current.value) {
			current.left = deleteRecursive(current.left,data);
			return current;
		}
		current.right = deleteRecursive(current.right,data);
		return current;
	}
	
	public void traverseInOrder(BinaryNode currentNode) {
		if(currentNode !=null) {
			traverseInOrder(currentNode.left);
			System.out.print(" "+currentNode.value);
			traverseInOrder(currentNode.right);

		}
	}
	
	public void traversePreOrder(BinaryNode currentNode) {
		if(currentNode !=null) {
			System.out.print(" "+currentNode.value);
			traversePreOrder(currentNode.left);
			traversePreOrder(currentNode.right);
		}
	}
	
	public void traversePostOrder(BinaryNode currentNode) {
		if(currentNode != null) {
			traversePostOrder(currentNode.left);
			traversePostOrder(currentNode.right);
			System.out.print(" "+currentNode.value);
		}
	}
	
	public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<BinaryNode> nodes = new LinkedList<>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	        BinaryNode node = nodes.remove();
	 
	        System.out.print(" " + node.value);
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right!= null) {
	            nodes.add(node.right);
	        }
	    }
	}
}

public class BinaryTreeImpl {
	
	public Tree createBinaryTree() {
		Tree tree = new Tree();
		tree.add(6);
		tree.add(4);
		tree.add(8);
		tree.add(3);
		tree.add(5);
		tree.add(7);
		tree.add(9);
		return tree;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	
	@Test
	public void treeElementTest() {
		
		Tree tree = createBinaryTree();
		if(tree.find(7))
			System.out.println("Tree element found");
		
		
	}
	
	@Test
	public void treeDeleteTest() {
		Tree tree = createBinaryTree();
		assertTrue(tree.find(8));
		tree.delete(8);
		assertFalse(tree.find(8));
		assertTrue(tree.find(9));
		
	}
	
	@Test
	public void traversalTest() {
		Tree tree = createBinaryTree();
		tree.traverseInOrder(tree.root);
		System.out.println();
		tree.traversePreOrder(tree.root);
		System.out.println();
		tree.traversePostOrder(tree.root);
		System.out.println();
		tree.traverseLevelOrder();
	}

}
