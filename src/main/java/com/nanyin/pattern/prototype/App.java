package com.nanyin.pattern.prototype;

import org.junit.Assert;
import org.junit.Test;

public class App {
    @Test
    public void testPrototype(){
       Cell cell = new Cell();
       cell.setName("org");
       try{
           Cell cloneCell = cell.clone();
           Assert.assertEquals("org",cloneCell.getName());
           Assert.assertEquals(cell,cloneCell);
       }catch (CloneNotSupportedException e){
           e.printStackTrace();
       }
    }
}
