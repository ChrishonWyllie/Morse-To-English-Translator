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
public class QueueUnderflowException extends RuntimeException {

	private static final long serialVersionUID = 3L;

	public QueueUnderflowException() {
		super("Queue Underflow");
	}
	
	public QueueUnderflowException(String message) {
		super(message);
	}
}

