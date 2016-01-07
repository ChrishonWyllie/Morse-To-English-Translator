/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSCI260ProjectTwo;

/**
 *
 * @author Chrishon595
 */
public class BinarySearchTree<T extends Comparable<T>> implements BSTInterface<T>
{
    protected BSTNode<T> root;      //reference to the root of this BST
    boolean found;                  //used by remove
    
    //for traversals
    protected LinkedUnbndQueue<T> inOrderQueue;     //queue of info
    protected LinkedUnbndQueue<T> preOrderQueue;     //queue of info
    protected LinkedUnbndQueue<T> postOrderQueue;     //queue of info
    
    
    public BinarySearchTree()
    // Creates an empty BST object.
    {
        root = null;
    }

    public boolean isEmpty() 
    //Returns true if this BST empty; otherwise, returns false.
    {
        return(root == null);
    }
    
    public int size()
    // Returns the number of elements in this BST.
    {
        return recSize(root);
    }
    
    private int recSize(BSTNode<T> tree)
    //Returns the number of elements in tree
    {
        if(tree == null)
            return 0;
        else
            return recSize(tree.getLeft()) + recSize(tree.getRight()) + 1;
    }
    
    public boolean contains(T element)
    //Returns true if this BST contains an element e such that
    //e.compareTo(element) == 0; otherwise, returns false.
    {
        return recContains(element, root);
    }
    
    private boolean recContains(T element, BSTNode<T> tree)
    //Returns true if this BST contains an element e such that
    //e.compareTo(element) == 0; otherwise, returns false.
    {
        if(tree == null)
            return false;       //element is not found.
        else if(element.compareTo(tree.getInfo()) < 0)
            return recContains(element, tree.getLeft());    //Search left subtree
        else if(element.compareTo(tree.getInfo()) > 0)
            return recContains(element, tree.getRight());   //Search right subtree
        else
            return true;        //element is found.
    }

    public boolean remove(T element) 
    //Removes an element e from this BST such that e.comapareTo(element) == 0
    //and returns true; if no such element exists, returns false.
    {
        root = recRemove(element, root);
        return found;
    }

    private BSTNode<T> recRemove(T element, BSTNode<T> tree)
    //Removes an element e from this BST such that e.comapareTo(element) == 0
    //and returns true; if no such element exists, returns false.
    {
        if(tree == null)
            found = false;
        else if(element.compareTo(tree.getInfo()) < 0)
            tree.setLeft(recRemove(element, tree.getLeft()));
        else if(element.compareTo(tree.getInfo()) > 0)
            tree.setRight(recRemove(element, tree.getRight()));
        else
        {
            tree = removeNode(tree);
            found = true;
        }
        return tree;
    }
    
    private BSTNode<T> removeNode(BSTNode<T> tree)
    {
        T data;
        
        if(tree.getLeft() == null)
             return tree.getRight();
        else if(tree.getRight() == null)
            return tree.getLeft();
        else
        {
            data = getPredecessor(tree.getLeft());
            tree.setInfo(data);
            tree.setLeft(recRemove(data, tree.getLeft()));
            return tree;
        }
    }
    
    private T getPredecessor(BSTNode<T> tree)
    //Returns the information held in the rightmost node in tree
    {
        while(tree.getRight() != null)
            tree = tree.getRight();
        return tree.getInfo();
    }
    
    public T get(T element) 
    //Returns and element e from this BST such that e.compareTo(element) == 0;
    //if no such element exists, returns null.
    {
        return recGet(element, root);
    }
    
    private T recGet(T element, BSTNode<T> tree)
    //Returns and element e from this BST such that e.compareTo(element) == 0;
    //if no such element exists, returns null.
    {
        if(tree == null)
            return null;        //element is not found
        else if(element.compareTo(tree.getInfo()) < 0)
            return recGet(element, tree.getLeft());    //Get from left subtree
        else if(element.compareTo(tree.getInfo()) > 0)
            return recGet(element, tree.getRight());   //Get from right subtree
        else
            return tree.getInfo();        //element is found.
    }

    public void add(String element) 
    //Adds element to this BST. The tree retains its BST property.
    {
        root = recAdd(element, root);
    }
    
    //private BSTNode<T> recAdd(T element, BSTNode<T> tree)
    private BSTNode<T> recAdd(String morse, BSTNode<T> tree)
    //Adds element to this BST. The tree retains its BST property.
    {
        for(int i = 0; i < morse.length(); i++)
        {
            char morseCode = morse.charAt(i);
            if(morseCode == '.')
            {
                
            }
        }
        for(int i= 0; i< morse.length(); i++)
            {
                char morseCodeChar = morse.charAt(i);
                if(morseCodeChar == '.')
                {
                    tree.setLeft(recAdd(morse, tree.getLeft()));
                }
                else if(morseCodeChar == '-')
                {
                    tree.setRight(recAdd(morse, tree.getRight()));
                }
                
            }
        /*if(tree == null)
            //Addition place found
            tree = new BSTNode<T>(element);
        else if(element.compareTo(tree.getInfo()) <= 0)
            tree.setLeft(recAdd(element, tree.getLeft()));    //Add in left subtree
        else 
            tree.setRight(recAdd(element, tree.getRight())); //Add in right subtree
        */
        //return tree;
        return tree;
    }
    
    public int reset(int orderType) 
    //Initializes current position for an iteration through this BST
    //in orderType order. Returns current number of nodes in the BST.
    {
        int numNodes = size();
        if(orderType == INORDER)
        {
            inOrderQueue = new LinkedUnbndQueue<T>(numNodes);
            inOrder(root);
        }
        else
            if(orderType == PREORDER)
            {
                preOrderQueue = new LinkedUnbndQueue<T>(numNodes);
                preOrder(root);
            }
        else
            if(orderType == POSTORDER)
            {
                postOrderQueue = new LinkedUnbndQueue<T>(numNodes);
                postOrder(root);
            }
        return numNodes;
            
    }

    public T getNext(int orderType) 
    //Preconditions: The BST is not empty
    //               The BST has been reset for orderType
    //               The BST has not been modified since the most recent reset
    //               The end of orderType iteration has not been reached
    //
    //Returns the element at the current position on this BST for orderType
    //and advances the value of the current position based on the orderType.
    {
        if(orderType == INORDER)
            return inOrderQueue.dequeue();
        else
            if(orderType == PREORDER)
                return preOrderQueue.dequeue();
        else 
            if(orderType == POSTORDER)
                return postOrderQueue.dequeue();
        else
            return null;
    }
    
    private void inOrder(BSTNode<T> tree)
    //Initializes inOrderQueue with three elements in inOrder order
    {
        if(tree != null)
        {
            inOrder(tree.getLeft());
            inOrderQueue.enqueue(tree.getInfo());
            inOrder(tree.getRight());
        }
    }
    
    private void preOrder(BSTNode<T> tree)
    //Initializes inOrderQueue with three elements in preOrder order
    {
        if(tree != null)
        {
            preOrderQueue.enqueue(tree.getInfo());
            preOrder(tree.getLeft());
            preOrder(tree.getRight());
        }
    }
    
    private void postOrder(BSTNode<T> tree)
    //Initializes inOrderQueue with three elements in postOrder order
    {
        if(tree != null)
        {
            postOrder(tree.getLeft());
            preOrder(tree.getRight());
            postOrderQueue.enqueue(tree.getInfo());
        }
    }
}
