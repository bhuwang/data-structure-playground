package com.bhuwan.datastructure.stack.test;

import org.junit.Before;

import com.bhuwan.datastructure.stack.LinkedListImpl;

public class LinkedListImplTest extends StackTest {

    @Before
    public void makeLinkedListStack() {
        s = new LinkedListImpl();
    }
}
