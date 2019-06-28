package com.nanyin.pattern.Singleton;

import org.junit.Assert;
import org.junit.Test;

public class APP {
    @Test
    public void testEnum() {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnumCopy = SingletonEnum.INSTANCE;
        Assert.assertEquals(singletonEnum, singletonEnumCopy); //通过
        Object o1 = new Object();
        Object o2 = new Object();
        Assert.assertEquals(o1,o2);
    }
}
