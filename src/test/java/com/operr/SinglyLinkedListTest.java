package com.operr;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

    private SinglyLinkedList singlyLinkedList;

    @Before
    public void setUp() throws Exception {
        //Create new singly linked list before starting test case
        singlyLinkedList = new SinglyLinkedList();
    }

    @After
    public void tearDown() throws Exception {
        //Delete singly linked list after test case
        singlyLinkedList = null;
    }

    @Test
    public void isEmpty() {
        //Checking isEmpty for empty singly linked list
        Assert.assertEquals(true, singlyLinkedList.isEmpty());

        //Inserting element into the singly linked list
        singlyLinkedList.appendElement(10);

        //Checking isEmpty for singly linked list after inserting one element
        Assert.assertEquals(false, singlyLinkedList.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void isEmptyWithNull() {
        //Checking isEmpty on null object.
        singlyLinkedList = null;
        singlyLinkedList.isEmpty();
    }

    @Test
    public void getSize() {
        //Checking size of empty singly linked list
        Assert.assertEquals(0, singlyLinkedList.getSize());

        //Checking size of singly linked list after inserting one element
        singlyLinkedList.appendElement(10);
        Assert.assertEquals(1, singlyLinkedList.getSize());
    }

    @Test(expected = NullPointerException.class)
    public void getSizeWithNull() {
        //Checking size on null object.
        singlyLinkedList = null;
        singlyLinkedList.getSize();
    }

    @Test
    public void appendElement() {
        //Checking size of empty singly linked list
        Assert.assertEquals(0, singlyLinkedList.getSize());

        //Inserting element into the singly linked list
        singlyLinkedList.appendElement(10);

        //Checking size and isEmpty on the singly linked list
        Assert.assertEquals(1, singlyLinkedList.getSize());
        Assert.assertEquals(false, singlyLinkedList.isEmpty());

        //Inserting another element into the singly linked list
        singlyLinkedList.appendElement(20);

        //Checking size and isEmpty on the singly linked list
        Assert.assertEquals(2, singlyLinkedList.getSize());
        Assert.assertEquals(false, singlyLinkedList.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void appendElementWithNull() {
        //Adding element into null object.
        singlyLinkedList = null;
        singlyLinkedList.appendElement(10);
    }

    @Test
    public void removeTailElement() {
        //Inserting two elements into the singly linked list.
        singlyLinkedList.appendElement(10);
        singlyLinkedList.appendElement(20);

        //Checking size and isEmpty on this singly linked list.
        Assert.assertEquals(2, singlyLinkedList.getSize());
        Assert.assertEquals(false, singlyLinkedList.isEmpty());

        //Removing tail element and checking element, size and isEmpty.
        Assert.assertEquals(20, singlyLinkedList.removeTailElement().getData());
        Assert.assertEquals(false, singlyLinkedList.isEmpty());
        Assert.assertEquals(1, singlyLinkedList.getSize());

        //Removing tail element and checking element, size and isEmpty.
        Assert.assertEquals(10, singlyLinkedList.removeTailElement().getData());
        Assert.assertEquals(true, singlyLinkedList.isEmpty());
        Assert.assertEquals(0, singlyLinkedList.getSize());
    }

    @Test(expected = NullPointerException.class)
    public void removeTailElementWithNull() {
        //Removing tail element into null object.
        singlyLinkedList = null;
        singlyLinkedList.removeTailElement();
    }

    @Test
    public void deleteNodesAllGreat() {
        //Inserting  elements into the singly linked list.
        singlyLinkedList.appendElement(2);
        singlyLinkedList.appendElement(10);
        singlyLinkedList.appendElement(5);
        singlyLinkedList.appendElement(20);

        //Checking size and isEmpty on this singly linked list.
        Assert.assertEquals(4, singlyLinkedList.getSize());
        Assert.assertEquals(false, singlyLinkedList.isEmpty());

        //Deleting all nodes grate than 8
        singlyLinkedList.deleteNodesAllGreat(8);

        //Checking size and isEmpty on this singly linked list.
        Assert.assertEquals(2, singlyLinkedList.getSize());
        Assert.assertEquals(false, singlyLinkedList.isEmpty());

        //Deleting all nodes grate than 8
        singlyLinkedList.deleteNodesAllGreat(1);

        //Checking size and isEmpty on this singly linked list.
        Assert.assertEquals(0, singlyLinkedList.getSize());
        Assert.assertEquals(true, singlyLinkedList.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void deleteNodesAllGreatWithNull() {
        //Remove all element in the singly linked list that is great than a target value on null object.
        singlyLinkedList = null;
        singlyLinkedList.deleteNodesAllGreat(10);
    }
}