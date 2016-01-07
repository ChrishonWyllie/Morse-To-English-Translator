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
public interface QueueInterface<T> 
{
    T dequeue() throws QueueUnderflowException;
    
    boolean isEmpty();
    //Returns true if this queue is empty; otherwise, returns false.
}
