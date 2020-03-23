package com.nanyin.pattern.adapter;

import org.junit.jupiter.api.Test;

/**
 * 适配器模式
 *
 */
public class App {
    @Test
    public void testCharge() {
        ThreeLeggedPlug s9Plus = new S9Plus(new ThreeLeggedPlug());
        s9Plus.charge();
//      使用适配器
        ThreeLeggedPlug s9PlusUseTwoLeggedPlug = new S9Plus(new TwoLeggedPlugAdapter());
        s9PlusUseTwoLeggedPlug.charge();
    }
}
