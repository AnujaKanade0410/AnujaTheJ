package com.hackerrank;

class Node {
    int data;
    Node next;
 }

public class LinkedList1 {
	LinkedList1(int data, Node node){
		 
	}
	void Print(Node head) {
		Node current=head;
		  if(current==null){
		      System.out.println(" ");
		  }else{
			  
			  while(current!=null){
				  System.out.println(current.data);
				  current=current.next;
			  }
		  }
	}
	public static void main(String[] args) {
		LinkedList1 ll=new LinkedList1();
		

	}

}
