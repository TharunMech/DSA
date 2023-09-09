package org.jsp.dsaApp;

public class SingleLinkedList {

	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	private Node head=null;
	private Node tail=null;
	private int size=0;
	public int size() {
		return size;
	}
	
	private void insertAtBegin(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			n.next=head;
			head=n;
		}
	}
	
	private void insertAtLast(int data) {
		Node n=new Node(data);
		tail.next=n;
		tail=n;
	}
	
	public void add(int data) {
		if(head==null)
			insertAtBegin(data);
		else
			insertAtLast(data);
		size++;
	}
	
	public void add(int index,int data) {
		if(index>size || index<0)
			throw new IndexOutOfBoundsException("Index out of range aa puka");
		if(index==0)
			insertAtBegin(data);
		else if(index==size)
		       insertAtLast(data);
		else {
			Node n=new Node(data);
			Node pointer =head;
			for(int i=1;i<index;i++) {
				pointer=pointer.next;
			}
			n.next=pointer.next;
			pointer.next=n;
		}
		size++;
	}
	
	public void display() {
		Node pointer=head;
		while(pointer!=null) {
			System.out.println(pointer.data);
			pointer=pointer.next;
		}
	}
	public boolean contains(int data) {
		if(size==0)
			return false;
		Node pointer =head;
		while(pointer!=null) {
			if(pointer.data==data)
				return true;
			pointer=pointer.next;
		}
		return false;
	}
	public int get(int index) {
		if(index>size||index<0||size==0) {
			throw new IndexOutOfBoundsException("out of rande");
		}
		Node pointer=head;
		for(int i=1;i<=index;i++) {
			pointer=pointer.next;
		}
		return pointer.data;
	}
	
	private void removeAtBegin() {
		if(size==1) {
			head=null;
			tail=null;
		}
		else {
			head=head.next;
		}
	}
	
	public void remove(int index) {
		if(size==0 || index<0 || index>size)
			throw new IndexOutOfBoundsException("out of range exception");
		if(index==0)
			removeAtBegin();
		else {
			Node pointer=head;
			for(int i=1;i<index;i++) {
				pointer=pointer.next;
			}
	      pointer.next=pointer.next.next;
	      if(index==size-1)
	    	  tail=pointer;
		}
		size--;
	}
	

}
