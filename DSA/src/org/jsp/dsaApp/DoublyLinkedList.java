package org.jsp.dsaApp;

public class DoublyLinkedList {
       class Node{
    	   int data;
    	   Node next;
    	   Node previous;
    	   
    	   public Node(int data) {
    		   this.data=data;
    	   }
       }
       private Node head;
       private Node tail;
       private int size;
       public void insertAtBegin(int data) {
    	   Node n =new Node(data);
    	   if(head==null) {
    		   head=n;
    		   tail=n;
    	   }
    	   else {
    		   n.next=head;
    		   head.previous=n;
    		   head=n;
    	   }
       }
       
       public void insertAtLast(int data) {
    	   Node n=new Node(data);
    	   n.previous=tail;
    	   tail.next=n;
    	   tail=n;
       }
       public void add(int data) {
    	   if(size==0)
    		   insertAtBegin(data);
    	   else
    		   insertAtLast(data);
    	   size++;
       }
       public void add(int index, int data) {
    	   if(index<0|| index>size) {
    		   throw new IndexOutOfBoundsException("out of range");
    	   }
    	   if(index==0) {
    		   insertAtBegin(data);
    	   }
    	   else if(index==size) {
    		   insertAtLast(data);
    	   }
    	   else {
    		   Node n=new Node(data);
    	   Node pointer=head;
    	   for(int i=1;i<index;i++) {
    		   pointer=pointer.next;
    		   n.previous=pointer;
    		   n.next=pointer.next;
    		   pointer.next=n;
    		   n.next.previous=n;
    	   }
    	   size++;
       }
            
}
       public void printfor() {
       	Node pointer=head;
       	while(pointer!=null) {
       		System.out.println(pointer.data);
       		pointer=pointer.next;
       	}
       }
       public void printBack() {
    	   Node pointer=tail;
    	   while(pointer!=null) {
    		   System.out.println(pointer.data);
    		   pointer=pointer.previous;
    	   }
       }
       
       public boolean contains(int data) {
    	   if(size==0)
    		   return false;
    	   Node pointer=head;
    	   while(pointer!=null) {
    		   if(pointer.data==data)
    			   return false;
    		   pointer=pointer.next;
    	   }
    	   return false;
       }
       public int get(int index) {
    	   if(index>size|| index<0|| size==0)
    		   throw new IndexOutOfBoundsException("out of range");
    	   Node pointer=head;
    	   for(int i=1;i<index;i++) {
    		   pointer=pointer.next;
    	   }
    	   return pointer.data;
       }
       
       public void remove(int data) {
    	    if (size == 0) {
    	        return;
    	    }

    	    if (head.data == data) {
    	        head = head.next;
    	        if (head != null) {
    	            head.previous = null;
    	        } else {
    	            tail = null;
    	        }
    	        size--;
    	        return;
    	    }

    	    Node current = head;
    	    while (current != null) {
    	        if (current.data == data) {
    	            current.previous.next = current.next;
    	            if (current.next != null) {
    	                current.next.previous = current.previous;
    	            } else {
    	                tail = current.previous;
    	            }
    	            size--;
    	            return;
    	        }
    	        current = current.next;
    	    }
    	}


}