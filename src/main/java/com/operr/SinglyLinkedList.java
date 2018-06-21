package com.operr;

/**
 * {@link SinglyLinkedList} used to perform following operation on Singly linked List
 * 1. Append an element into the singly linked list
 * 2. Remove the tail element from a singly linked list
 * 3. Remove all element in the singly linked list that is great than a target value
 */
public class SinglyLinkedList {

    protected LinkedListNode startNode;
    protected LinkedListNode endNode;
    public int size = 0;

    /**
     * This method is used to find this singly linked list is empty or not.
     *
     * @return is this singly linked list is empty or not?
     */
    public boolean isEmpty() {
        return startNode == null;
    }

    /**
     * This method is used to find size of this singly linked list.
     *
     * @return the size of this singly linked list
     */
    public int getSize() {
        return size;
    }

    /**
     * This method is used to append the element into this singly linked list.
     *
     * @param value the element to append
     */
    public void appendElement(int value) {
        LinkedListNode node = new LinkedListNode(value, null);
        if (startNode == null) {
            startNode = node;
            endNode = node;
        } else {
            endNode.setNextNode(node);
            endNode = node;
        }
        size++;
    }

    /**
     * This method is used to remove last element from this singly linked list.
     *
     * @return the last element from this singly linked list
     */
    public LinkedListNode removeTailElement() {
        if (isEmpty())
            return null;
        LinkedListNode temp = startNode;
        LinkedListNode deleteNode = endNode;
        if (startNode == endNode) {
            startNode = endNode = null;
            size--;
            return temp;
        }
        while (temp.getNextNode() != endNode)
            temp = temp.getNextNode();
        temp.setNextNode(null);
        endNode = temp;
        size--;
        return deleteNode;
    }

    /**
     * This method is used to remove all elements in the singly linked list that is great than a target value.
     *
     * @param value the target value.
     */
    public void deleteNodesAllGreat(int value) {
        LinkedListNode temp = startNode;
        LinkedListNode prev = temp;
        while (temp != null && temp.getData() > value) {
            startNode = temp.getNextNode();
            temp = startNode;
            size--;
        }
        while (temp != null) {
            if (temp.getData() > value) {
                prev.setNextNode(temp.getNextNode());
                size--;
            } else
                prev = temp;
            temp = temp.getNextNode();
        }
        if (prev != null && prev.getNextNode() == null)
            endNode = prev;
    }

}
