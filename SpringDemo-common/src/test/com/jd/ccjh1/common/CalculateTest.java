package com.jd.ccjh1.common;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * @author ccjh1
 * @creat 2020/7/13
 */

public class CalculateTest {
    @Test
    public void addTest(){
        assertEquals(2,new com.jd.ccjh1.common.Calculate().add(1,1));
    }
    @Test
    public void subtractTest(){
        assertEquals(0,new com.jd.ccjh1.common.Calculate().subtract(1,1));
    }
    @Test
    public void multiplyTest(){
        assertEquals(1,new com.jd.ccjh1.common.Calculate().multiply(1,1));
    }
    @Test
    public void divideTest(){
        assertEquals(1,new com.jd.ccjh1.common.Calculate().divide(1,1));
    }
}
