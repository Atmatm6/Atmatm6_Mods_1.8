package com.Atmatm6.CloudWorldClient;

import com.Atmatm6.CloudWorldClient.command.GitInterfaceCommand;
import com.Atmatm6.Libs.mclibs.ClouDLibs;
import com.Atmatm6.Libs.mclibs.ModLibs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;


@Mod(modid = ClouDLibs.Modid, name = ClouDLibs.Name, version = ModLibs.Version, dependencies = ModLibs.Depends, canBeDeactivated = true)
public class CloudWorlds {
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new GitInterfaceCommand());
    }
}
