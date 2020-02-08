package com.an;

class Node1{
	int data;
	Node1 left,right;
	
	public Node1(int item){
		data=item;
		left=right=null;
	}
}
public class BinaryTreeMirror {
	Node1 root;
	void mirror(){
		root=mirror(root);
	}
	public Node1 mirror(Node1 node){
		if(node==null){
			return node;
		}
		
		Node1 left=mirror(node.left);
		Node1 right=mirror(node.right);
		
		node.left=right;
		node.right=left;
		
		return node;
	}
	void inOrder(){
		inOrder(root);
	}
	void inOrder(Node1 node){
		if(node==null){
			return;
		}
		inOrder(node.left);
		System.out.println(node.data+" ");
		inOrder(node.right);
	}
	public static void main(String[] args) {
		BinaryTreeMirror tree=new BinaryTreeMirror();
		tree.root=new Node1(1);
		tree.root.left=new Node1(2);
		tree.root.right=new Node1(3);
		tree.root.left.left=new Node1(4);
		tree.root.left.right=new Node1(5);
		
		System.out.println("InOrder traversal of binary tree is: ");
		tree.inOrder();
		System.out.println("");
		
		tree.mirror();
		System.out.println("InOrder traversal of mirror binary tree is: ");
		tree.inOrder();
	}

}
