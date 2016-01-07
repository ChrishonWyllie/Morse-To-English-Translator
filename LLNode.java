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
public class LLNode<T>
{
  private LLNode<T> link;
  private T info;
  
  public LLNode(T info)
  {
    this.info = info;
    link = null;
  }
 
  public void setInfo(T info)
  // Sets info of this LLNode.
  {
    this.info = info;
  }

  public T getInfo()
  // Returns info of this LLONode.
  {
    return info;
  }
 
  public void setLink(LLNode<T> link)
  // Sets link of this LLNode.
  {
    this.link = link;
  }

  public LLNode<T> getLink()
  // Returns link of this LLNode.
  {
    return link;
  }
}
