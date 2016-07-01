package com.artillect.peacefulutilities;

import com.artillect.peacefulutilities.init.ModItems;
import com.artillect.peacefulutilities.proxy.CommonProxy;
import com.artillect.peacefulutilities.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.10]")
public class PeacefulUtilities {
    
    @Mod.Instance(Reference.MOD_ID)
    public static PeacefulUtilities instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	ModItems.init();
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    
    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event){
    	
    }
}
