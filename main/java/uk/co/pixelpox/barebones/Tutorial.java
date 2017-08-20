package uk.co.pixelpox.barebones;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.pixelpox.barebones.proxy.CommonProxy;

@Mod(
		modid = Reference.MOD_ID 
	, 	name = Reference.NAME 
	, 	version = Reference.VERSION 
	,	acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS
)

public class Tutorial 
{
	@Instance
	public static Tutorial instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_POXY_CLASS , serverSide = Reference.SERVER_POXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("PRE");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("INIT");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("POST");
	}
}
