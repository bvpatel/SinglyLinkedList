package com.operr;

import java.util.Objects;

/**
 * {@link LinkedListNode} used to store data for {@link SinglyLinkedList}.
 */
public class LinkedListNode {
    protected int data;
    protected LinkedListNode nextNode;

    public LinkedListNode() {
    }

    public LinkedListNode(int data, LinkedListNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedListNode that = (LinkedListNode) o;
        return data == that.data;
    }

    @Override
    public int hashCode() {

        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "data = " + data;
    }
}
