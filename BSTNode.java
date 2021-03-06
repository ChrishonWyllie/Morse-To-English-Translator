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
public class BSTNode<T extends Comparable<T>>
{
  // Used to hold references to BST nodes for the linked implementation
  protected T info;                // The info in a BST node
  protected BSTNode<T> left;       // A link to the left child node
  protected BSTNode<T> right;      // A link to the right child node

  public BSTNode(T info)
  {
    this.info = info;
    left = null;
    right = null;
  }
 
  public void setInfo(T info)
  // Sets info of this BSTNode.
  {
    this.info = info;
  }

  public T getInfo()
  // Returns info of this BSTNode.
  {
    return info;
  }
 
  public void setLeft(BSTNode<T> link)
  // Sets left link of this BSTNode.
  {
    left = link;
  }

  public void setRight(BSTNode<T> link)
  // Sets right link of this BSTNode.
  {
    right = link;
  }

  public BSTNode<T> getLeft()
  // Returns left link of this BSTNode.
  {
    return left;
  }

  public BSTNode<T> getRight()
  // Returns right link of this BSTNode.
  {
    return right;
  }
}
