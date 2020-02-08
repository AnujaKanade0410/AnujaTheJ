package com.an;

public class BinarySearchTree {
	public static Node root;
	public BinarySearchTree(){
		root=null;
	}
	public boolean find(int n){
		Node current=root;
		while(current!=null){
			if(current.data > n){
				current=current.left;
			}else if(current.data==n){
				return true;
			}else{
				current=current.right;
			}
		}
		return false;
	}
	public void insert(int n){
		Node newNode=new Node(n);
		if(root==null){
			root=newNode;
			return;
		}
		Node current=root;
		Node parent=null;
		while(true){
			parent=current;
			if(n < current.data){
				current=current.left;
				if(current==null){
					parent.left=newNode;
					return;
				}
			}else{
				current=current.right;
				if(current==null){
					parent.right=newNode;
					return;
				}
			}
		}
	}
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.println(" "+root.data);
			display(root.right);
		}
	}
	public boolean delete(int n){
		Node current=root;
		Node parent=root;
		boolean isLeftChild=false;
		while(current.data!=n){
			parent=current;
			if(current.data>n){
				isLeftChild=true;
				current=current.left;
			}else{
				isLeftChild=false;
				current=current.right;
			}
			if(current==null){
				return false;
			}
		}
		
		if(current.left==null && current.right==null){
			if(current==root){
				root=null;
			}
			if(isLeftChild){
				parent.left=null;
			}else{
				parent.right=null;
			}
		}else if(current.right!=null){
			if(current==root){
				root=current.left;
			}else if(isLeftChild){
				parent.left=current.left;
			}else{
				parent.right=current.left;
			}
		}else if(current.left!=null){
			if(current==root){
				root=current.right;
			}else if(isLeftChild){
				parent.left=current.right;
			}else{
				parent.right=current.right;
			}
		}else if(current.left!=null && current.right!=null){
			Node successor=getSuccessor(current);
			if(current==root){
				root=successor;
			}else if(isLeftChild){
				parent.left=successor;
			}else{
				parent.right=successor;
			}
			successor.left=current.left;
		}
		return true;
	}
	
	private Node getSuccessor(Node deleteNode) {
		Node successor=null;
		Node successorParent=null;
		Node current=deleteNode.right;
		while(current!=null){
			successorParent=successor;
			successor=current;
			current=current.left;
		}
		
		if(successor!=deleteNode.right){
			successorParent.left=successor.right;
			successor.right=deleteNode.right;
		}
		return successor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} 	

}

class Node{
	Node left;
	Node right;
	int data;
	public Node(int data){
		left=null;
		right=null;
		this.data=data;
	}
}
