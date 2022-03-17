/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_in_class6;

import java.util.Scanner;

/**
 *
 * @author youse
 */
public class Test {
    
    public static void main(String[] args) {
        LinkedStack<Integer> mystack = new LinkedStack<>() ; 
        
        Scanner in = new Scanner(System.in);
        System.out.println("is the stack empty ? " + mystack.isEmpty());
        System.out.println("input elements");
       
        for (int i = 0 ; i < 5 ; i++) {
            mystack.push(in.nextInt());   // first will increcement top by 1 and save the element in that top .
            //System.out.println(mystack.t); // here to see the top what came 
            System.out.println("top element is "+mystack.top());  // will return the element you entered 
            System.out.println("stack size is = "+mystack.size()); // will increcement top by 1 next the push method 
            System.out.println("is the stack empty ? "+mystack.isEmpty()); // will be false because top became 1 after incre in push and size methods
            
        }
        
        for (int i = 0 ; i < 6 ; i++) {
            System.out.println("deleted element is = "+mystack.pop()); //will return the deleted element ( the last one get in) 
            System.out.println("top element after delete is = "+mystack.top()); 
            System.out.println("stack size is = "+mystack.size());
            System.out.println("is the stack empty ? "+mystack.isEmpty());
            
        }
        
        
        
        
        
        
        
    }
    
}
