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
public class Project_in_Class6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice = -1 ;
       
        System.out.println("1 add first\t2 add last\t3" +
                " remove first\t 4 rotate \t 0 exit");
       
        while (choice != 0)
        {
            System.out.print("your choice:");
            choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("input name:");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.print("input name:");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.print("deleted"+list.removeFirst());
                    break;
                case 4:
                    list.rotate();
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("first= "+list.first()+"\tlast= "+list.last()+"" +
                    "\tsize= "+list.size());
        }
   
    }
    
}
