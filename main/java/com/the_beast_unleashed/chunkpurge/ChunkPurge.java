package com.the_beast_unleashed.chunkpurge;

import java.util.logging.Logger;

import com.the_beast_unleashed.chunkpurge.proxy.ProxyCommon;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ChunkPurge.MODID, name = ChunkPurge.NAME, version = ChunkPurge.VERSION)
public class ChunkPurge
{
	
    public static final String MODID = "ChunkPurge";
    public static final String NAME = "Chunk Purge";
    public static final String VERSION = "1.0";
    
    @Instance(MODID)
    public static ChunkPurge instance;
    
    public static Logger log = Logger.getLogger(MODID);
    
    @SidedProxy(clientSide = "com.the_beast_unleashed.chunkpurge.proxy.ProxyClient", serverSide = "com.the_beast_unleashed.chunkpurge.proxy.ProxyCommon")
    public static ProxyCommon proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit();
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
		proxy.load();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit();
    }
    
}
