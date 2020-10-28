/*
 * Author: Austin Lynn User: auslynn
 * Date: 4/30/20
 * Assignment: Lab 12
 */
public class BST<Key extends Comparable, Value> {

	private Node root;
	
	// outer class has access to all values in the inner class
	private class Node
	{
		private Key key;
		private Value value;
		private Node lChild;
		private Node rChild;
		
		private Node root = null;
		
		// number of nodes at this subtree
		// N for root = # of nodes in the entire tree
		// N for leaf = 1
		// N needs to be updated every time a new node is inserted into the tree
		private int N;
		
		public Node(Key key, Value value, int N)
		{
			this.key = key;
			this.value = value;
			this.N = N;
		}
	
		
	public int size() //returns the size of the tree
	{
		if ((lChild != null) && (rChild == null))
		{
			return 1 + lChild.size();
		}
		else if ((lChild == null) && (rChild != null))
		{
			return 1 + rChild.size();
		}
		else if ((lChild != null) && (rChild != null))
		{
			return 2 + lChild.size() + rChild.size();
		}
		else
		{
			return 1;
		}
		
	}
	
	public Value get(Key key) // returns the value associated with the key, or null if the key doesnt exist
	{
		if (this.key == key)
		{
			return this.value;
		}
		else
		{
			if ((lChild != null) && (rChild == null))
			{
				return lChild.get(key);
			}
			else if ((lChild == null) && (rChild !=null))
			{
				return rChild.get(key);
			}
			else if ((lChild != null) && (rChild != null))
			{
				if (lChild.get(key) == null)
				{
					return rChild.get(key);
				}
				else
				{
					return lChild.get(key);
				}
			}
			else
			{
				return null;
			}
		}
	}

	public void addNodeHelper(Node node)
	{
		if ((node.key).compareTo(key) >= 0)
		{
			if (rChild == null)
			{
				rChild = node;
			}
			else
			{
				rChild.addNodeHelper(node);
			}
		}
		
		else if ((node.key).compareTo(key) < 0)
		{
			if (lChild == null)
			{
				lChild = node;
			}
			else
			{
				lChild.addNodeHelper(node);
			}
		}
	}
	
	public void put(Key key, Value val)//insert key/value pair and update the value of N
	{
		Node node = new Node(key, val, this.N);
		
		if (this.root == null)
		{
			this.root = node;
		}
		
		else
		{
			root.addNodeHelper(node);
		}
	}
	
	public String walk(String choice)
	{
		//walk the tree in order and print the values
		// if choice is in then perform in-order walk
		// if pre then preorder
		// if post then post order
		// any other choice will use in order
		
		if (choice == "in")
		{
			return "" + root.toString() + lChild.toString() + rChild.toString();
		}
		else if (choice == "pre")
		{
			return "" + lChild.toString() + root.toString() + rChild.toString();
		}
		else if (choice == "post")
		{
			return "" + rChild.toString()  + root.toString() + lChild.toString();
		}
		else
		{
			return "Invalid Input. Default return order: " + root.toString() + lChild.toString() + rChild.toString();
		}
	}
	
	public String toString2()
	{
		// returns in, pre, and post order walk of tree
		return "";
	}
	
	public boolean equals(Object obj)
	{
		// returns whether this tree is exactly the same as another tree
		String str = this.toString();
		BST<Integer, Character> tempTree = (BST<Integer, Character>) obj;
		String str2 = obj.toString();
		if (str.equals(str2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isBalanced()
	{
		// if tree is perfectly balanced, return true. else false.
		if (rChild.size() == lChild.size())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int countLeafNodes()
	{
		// counts the number of leafs in the tree
		int counter = 0;
		if (lChild == null && rChild == null)
		{
			counter = counter + 1;
		}
		else
		{
			countLeafNodes();
		}
		return counter;
	}
	
	public int getOneChildNodes() //im gonna die
	{
		int counter = 0;
		if ((lChild != null && rChild == null) || (lChild == null && rChild != null))
		{
			counter = counter + 1;
		}
		else if (lChild == null && rChild == null)
		{
			counter = counter + 2;
		}
		else
		{
			getOneChildNodes();
		}
		return counter;
	}
	
	public BST removeDuplicates()
	{
		//removes duplicates from original tree
		return null;
	}
	
	public int sumLeft(Key key)
	{
		//returns the sum of the nodes in the left branch of the given key node
		return 0;
	}
	
	public int sumRight(Key key)
	{
		// returns the sum of the nodes in the right branch of the given key node
		return 0;
	}
	
	public BST getUpperHalf()
	{
		//returns a tree with half the height of the original tree (top half?)
		return null;
	}
	
	} // this ends the node class
	
	public static void main(String[] args)
	{
		
		
		
	}
}
