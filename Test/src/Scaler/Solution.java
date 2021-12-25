package Scaler;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static int updateTree(Node A) {
		if(A ==null) {
			return 0;
		}
		int left = updateTree(A.left);
		int right = updateTree(A.right);
		int root = A.data;
		A.data =  left + right;
		return A.data + root;
		
	}
	public static void postOrder(Node A) {
		if(A==null) return;
		postOrder(A.left);
		postOrder(A.right);
		System.out.println(A.data);
	}
	public static boolean compareTree(Node A, Node C) {
		if(A==null && C==null) {
			return true;
		}
		return (A!=null && C != null) && (A.data == C.data)  && compareTree(A.left,C.left) && compareTree(A.right,C.right);
	}
	public static boolean symmetry(Node A, Node C) {
		if(A==null && C==null) {
			return true;
		}				
		return (A!=null && C != null)  && symmetry(A.left,C.right) && symmetry(A.right,C.left);
	}
	
	public static boolean symmetry(Node A) {
		return symmetry(A.left,A.right);
	}
    
	public static void main(String[] args) {
		Node x = new Node(15);
        x.left = new Node(10);
        x.right = new Node(20);
        x.left.left = new Node(8);
        x.left.right = new Node(12);
        x.right.left = new Node(16);
        x.right.right = new Node(25);
 
        // construct the second tree
        Node y = new Node(15);
        y.left = new Node(10);
        y.right = new Node(20);
        y.left.left = new Node(8);
        y.left.right = new Node(12);
        y.right.left = new Node(16);
        y.right.right = new Node(25);
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
       // System.out.println(compareTree(x, y));
       // updateTree(x);
       // postOrder(x);
        if(symmetry(root)) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}

}
