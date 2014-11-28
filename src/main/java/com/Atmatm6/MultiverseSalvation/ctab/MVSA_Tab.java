package com.Atmatm6.MultiverseSalvation.ctab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public abstract class MVSA_Tab extends CreativeTabs {
    private static String mvsaTab;
    private static final CreativeTabs MVSAtab = new CreativeTabs(4321, mvsaTab) {
        @Override
        public Item getTabIconItem() {
            return null;
        }
    };

    public MVSA_Tab(int index, String label) {
        super(index, label);
    }
}