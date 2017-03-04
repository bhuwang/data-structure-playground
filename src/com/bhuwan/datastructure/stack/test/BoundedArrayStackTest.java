/**
 * 
 */
package com.bhuwan.datastructure.stack.test;

import org.junit.Before;
import org.junit.Test;

import com.bhuwan.datastructure.stack.BoundedArrayImpl;

/**
 * @author bhuwan
 *
 */
public class BoundedArrayStackTest extends StackTest {
    private static int CAPACITY = 40;

    @Before
    public void makeBoundedStack() {
        s = new BoundedArrayImpl(CAPACITY);
    }

    @Test(expected = IllegalStateException.class)
    public void testPushToFullStack() {
        for (int i = 0; i < CAPACITY; i++) {
            s.push("abc");
        }
        s.push("abc");
    }
}
