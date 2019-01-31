package com.learning.ds;

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

class LinkedList{
	Node head;
	
	public void addElement(int data) {
		Node insertNode = new Node(data);
		if(head == null) {
			head = insertNode;
		}else {
			Node temp = head;
			while(temp.next !=null) {
				temp = temp.next;
			}
			temp.next = insertNode;
		}
	}
	
	public void addElementInFront(int data) {
		Node insertNode = new Node(data);
		if(head == null) {
			head = insertNode;
		}else {
			Node temp = head;
			if(temp.next == null) {
				insertNode.next = temp;
				head = insertNode;				
			} else {
				insertNode.next = temp;
				head = insertNode;
			}
				
		}
	}
	
	public void addElementInEnd(int data) {
		
	}
	
		
		
	
	//Print list
	public void printList() {
		Node temp = head;
		while(temp !=null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class LinkedListImpl {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addElement(1);
		list.addElement(2);
		list.addElementInFront(3);
		//list.insertElementAtEnd(1);
		//list.insertElementAtEnd(2);
		list.printList();

	}

}
