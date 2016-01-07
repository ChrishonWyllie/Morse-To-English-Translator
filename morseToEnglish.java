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
import java.util.*;
public class morseToEnglish 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //BinarySearchTree<String> tree = new BinarySearchTree<String>();
        //BSTNode<String> root;      //reference to the root of this BST
  
        String element;
        String target;
        int treeSize;
        String[] alphabet;
        
        String A = ".-";
        String B = "-...";
        String C = "-.-.";
        String D = "-..";
        String E = ".";
        String F = "..-.";
        String G = "--.";
        String H = "....";
        String I = "..";
        String J = ".---"; 
        String K = "-.-";
        String L = ".-..";
        String M = "--";
        String N = "-.";
        String O = "---";      
        String P = ".--.";
        String Q = "--.-";
        String R = ".-.";
        String S = "...";
        String T = "-";        
        String U = "..-";
        String V = "...-";
        String W = ".--";
        String X = "-..-";
        String Y = "-.--";    
        String Z = "--..";
        
        alphabet = new String[26];
        alphabet[0] = A;
        alphabet[1] = B;
        alphabet[2] = C;
        alphabet[3] = D;
        alphabet[4] = E;
        alphabet[5] = F;
        alphabet[6] = G;
        alphabet[7] = H;
        alphabet[8] = I;
        alphabet[9] = J;
        alphabet[10] = K;
        alphabet[11] = L;
        alphabet[12] = M;
        alphabet[13] = N;
        alphabet[14] = O;
        alphabet[15] = P;
        alphabet[16] = Q;
        alphabet[17] = R;
        alphabet[18] = S;
        alphabet[19] = T;
        alphabet[20] = U;
        alphabet[21] = V;
        alphabet[22] = W;
        alphabet[23] = X;
        alphabet[24] = Y;
        alphabet[25] = Z;
        
        //tree.add(E);
        //tree.add(T);
        //tree.add(I);
        /*tree.add(A);
        tree.add(N);
        tree.add(M);
        tree.add(S);
        tree.add(U);
        tree.add(R);
        tree.add(W);
        tree.add(D);
        tree.add(K);
        tree.add(G);
        tree.add(O);
        tree.add(H);
        tree.add(V);
        tree.add(F);
        tree.add(L);
        tree.add(P);
        tree.add(J);
        tree.add(B);
        tree.add(X);
        tree.add(C);
        tree.add(Y);
        tree.add(Z);
        tree.add(Q);
        */
        System.out.println("This is a morse code to english translator");
        System.out.println("Please press 1 -8 for the corresponding action");
        System.out.println("1 to see if the tree is empty");
        System.out.println("2 to check the size of the tree");
        System.out.println("3 to check if the tree contains a desired element");
        System.out.println("4 to translate morse to english");
        System.out.println();
        int userNum = keyboard.nextInt(); //Captures the user's response to determine which operation to use
        
        /*
        if(userNum == 1) 
        {
            System.out.println("It is " + tree.isEmpty() + "that the tree is empty");
        }
        else
            if(userNum == 2)
            {
                System.out.println("The size of the tree is " + tree.size());
            }
        else
            if(userNum == 3)
            {
                System.out.println("Which element are you searching for?");
                element = keyboard.nextLine();
                if(tree.contains(element) == true)               
                    System.out.println("The element is in the tree");
                else
                    if(tree.contains(element) == false)
                    System.out.println("The element is not in the tree");
            }
        else
                */
        if(userNum == 4)
        {
            System.out.println("Please type in a letter of your name in Morse code, one at a time");
            System.out.println("Use underscores to indicate that a latter is complete");
            System.out.println("Use two underscores for completion of names");
            System.out.println("Finally, use a hashtag to indicate the end of your full name");   
            String letter = keyboard.nextLine();
            for(int i = 0; i < alphabet.length; i++)
            {
                if(letter == alphabet[i])
                    System.out.print(i);
                else
                    if(letter.equals("_"))
                    System.out.print("_");
                else
                    if(letter.equals("__"))
                    System.out.print("__");
                else
                    if(letter.equals("#"))
                    System.out.print("#");           
            }
            }
        }
        
 }

