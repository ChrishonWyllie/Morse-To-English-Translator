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
public interface BSTInterface<T extends Comparable<T>>
{
    //used to specify traversal order
    static final int INORDER = 1;
    static final int PREORDER = 2;
    static final int POSTORDER = 3;
    
    boolean isEmpty();
    //Returns true if this BST is empty; otherwise, returns false.
    
    boolean contains(T elemeent);
    //Returns true if this BST contains an element e such that
    //e.compareTo(element) == 0; otherwise, returns false.
    
    boolean remove(T remove);
    //Removes an element e from this BST such that e.comapareTo(element) == 0
    //and returns true; if no such element exists, returns false.
    
    T get(T element);
    //Returns and element e from this BST such that e.compareTo(element) == 0;
    //if no such element exists, returns null.
    
    void add(String element);
    //Adds element to this BST. The tree retains its BST property.
    
    int reset(int orderType);
    //Initializes current position for an iteration through this BST
    //in orderType order. Returns current number of nodes in the BST.
    
    T getNext(int orderType);
    //Preconditions: The BST is not empty
    //               The BST has been reset for orderType
    //               The BST has not been modified since the most recent reset
    //               The end of orderType iteration has not been reached
    //
    //Returns the element at the current position on this BST for orderType
    //and advances the value of the current position based on the orderType.
}
