package com.artillect.peacefulutilities;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = PeacefulUtilities.modId, name = PeacefulUtilities.name, version = PeacefulUtilities.version, acceptedMinecraftVersions = "[1.10]")
public class PeacefulUtilities {
 
    public static final String modId = "PeacefulUtilities";
    public static final String name = "Peaceful Utilities";
    public static final String version = "1.10.2-0.0.1";
    
    @Mod.Instance(modId)
    public static PeacefulUtilities instance;
    
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    
    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event){
    	
    }
}
