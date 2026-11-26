package campusdispatch;

public class PackageBST {
	
	private class Node{
		Package data;
		Node left;
		Node right;
		
		Node(Package data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public boolean insert(Package packageToInsert) {
		if(search(packageToInsert.getPackageId()) != null) {
			return false;
		}
		root = insert(root, packageToInsert);
		return true;
	}
	
	private Node insert(Node current, Package packageToInsert) {

	    if (current == null) {
	        return new Node(packageToInsert);
	    }

	    int comparison = packageToInsert.getPackageId().compareTo(current.data.getPackageId());

	    if (comparison < 0) {
	        current.left = insert(current.left, packageToInsert);
	    } 
	    else if (comparison > 0) {
	        current.right = insert(current.right, packageToInsert);
	    }

	    return current;
	}
	
	public Package search( String packageId) {
		return search(root, packageId);
	}
	
	private Package search(Node current,String packageId) {
		if(current == null) {
			return null;
		}
		
		int comparison = packageId.compareTo(current.data.getPackageId());
		
		if(comparison == 0) {
			return current.data;
		}else if(comparison < 0) {
			return search(current.left, packageId);
		}else {
			return search(current.right, packageId);
		}
	}
	
	public boolean contains(String packageId) {
		return search(packageId) != null;
	}
	
	public void displayPackages() {
		displayInOrder(root);
	}
	
	private void displayInOrder(Node current) {
		if (current == null) {
			return;
		}
		
		displayInOrder(current.left);
		
		System.out.println(current.data);
		
		displayInOrder(current.right);
	}
	
	public void delete(String packageId) {
		root = delete(root, packageId);
	}
	
	// There are 3 case for deletion I commented them below
	private Node delete(Node current, String packageId) {
		if(current == null) {
			return null;
		}
		
		int comparison = packageId.compareTo(current.data.getPackageId());
		
		if(comparison < 0) {
			current.left = delete(current.left, packageId);
		}else if(comparison > 0) {
			current.right = delete(current.right, packageId);
		}else {
			
			// Case 1: The node has no children
			if(current.left == null && current.right == null) {
				return null;
			}
			
			// Case 2: The node has one child
			
			if(current.left == null) {
				return current.right;
			}
			
			if(current.right == null) {
				return current.left;
			}
			
			// Case 3: The node has two children. We should find its in-order successor the smallest node in its right subtree;
			
			Node successor = findMinimum(current.right);
			current.data = successor.data;
			current.right = delete(current.right, successor.data.getPackageId()); // After replacing we should remove successor
			
		}
		
		return current;
	}
	
	private Node findMinimum(Node current) {
		while(current.left != null) {
			current = current.left;  
		} // In BST, smaller values are always on the left. So minimum will be in the left most leaf of subtree
		
		return current;
	}
	
}
