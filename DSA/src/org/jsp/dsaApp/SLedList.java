package org.jsp.dsaApp;

import java.util.LinkedList;

public class SLedList {

	public static void main(String[] args) {
         SingleLinkedList l1=new SingleLinkedList();
          
//          l1.add(10);
//          l1.add(22);
//          l1.add(80);
//          l1.add(89);
//          l1.add(69);
//          l1.remove(2);
//          l1.display();
          System.out.println("----------------------------------------");
          DoublyLinkedList d1=new DoublyLinkedList();
            d1.add(50);
            d1.add(1, 520);
            d1.add(85);
            d1.remove(50);
            d1.printfor();
            
          
	}

}
