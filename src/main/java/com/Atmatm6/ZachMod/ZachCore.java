package com.Atmatm6.ZachMod;

import com.Atmatm6.Libs.ZachLibs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ZachLibs.Modid, name = ZachLibs.Name, version = ZachLibs.Version, dependencies = ZachLibs.Dependencies)
public class ZachCore {
    public static Item
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerItem();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}