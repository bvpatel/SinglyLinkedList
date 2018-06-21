package com.operr;

import java.util.Scanner;

/**
 * {@link SinglyLinkedListApplication} used to perform different operations on the singly linked list.
 */
public class SinglyLinkedListApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        char ch;
        do {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. Append an element into the singly linked list");
            System.out.println("2. Remove the tail element from a singly linked list");
            System.out.println("3. Remove all element in the singly linked list that is great than a target value");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to Append an element into the singly linked list: ");
                    singlyLinkedList.appendElement(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Delete element: " + singlyLinkedList.removeTailElement());
                    break;
                case 3:
                    System.out.println("Enter Target value: ");
                    singlyLinkedList.deleteNodesAllGreat(scan.nextInt());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');

    }
}
