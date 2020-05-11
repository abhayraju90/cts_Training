package com.cognizant.doublyLinkedList;

public class App {

	
	public static void main(String[] args) {
		
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertFirst(100);
		theList.insertFirst(50);
		theList.insertFirst(20);
		theList.insertLast(90);
		theList.insertLast(80);
		theList.insertLast(70);
		theList.displayForward();
		theList.deleteFirst();
		theList.deleteLst();
		theList.deleteKey(90);
		theList.insertAfter(95, 50);
		theList.insertAfter(60, 80);
		theList.displayForward();
		
	}

}
