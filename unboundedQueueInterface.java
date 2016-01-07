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
public interface UnboundedQueueInterface<T> extends QueueInterface<T>

{
  void enqueue(T element);
  // Adds element to the rear of this queue.
}
