package com.learning.ds;

class ListNode{
	int data;
	ListNode next;
	
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
}

class MyLinkedList{
	ListNode root = null;
	
	void addNodeRecursive(ListNode node,int data) {
		if(node.next !=null) {
			addNodeRecursive(node.next,data);
		}else {
			ListNode node1 = new ListNode(data);
			node.next = node1;
		}
			
	}
	
	 void addNode(int data){
		ListNode node = new ListNode(data);
		if(root == null) {
			root = node;
		}else {
			addNodeRecursive(root,data);
		}
			
	}
	void insertElement(int data) {
		ListNode newNode = new ListNode(data);
		if(root == null) {
			root = newNode;
		}else {
			ListNode node = root;
			if(data < node.data) {				
				ListNode tmpNode = node;
				newNode.next = tmpNode;
				root = newNode;
			}else {
				while(node.data < data) {
					node = node.next;
				}
				newNode.next = node.next;
				node.next = newNode;
			}
		}
	}
	void printList() {
		ListNode node = root;
		if(root == null)
			System.out.println("List is empty");
		else {
			System.out.print(node.data+" ");
			while(node.next != null) {
				node = node.next;
				System.out.print(node.data+" ");				
			}
			System.out.println();
		}
		
	}
}


public class LinkedListInsert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		list.addNode(2);
		list.addNode(5);
		list.addNode(7);
		list.addNode(10);
		list.addNode(15);
		
		list.printList();
		list.insertElement(9);
		list.printList();

	}

}
